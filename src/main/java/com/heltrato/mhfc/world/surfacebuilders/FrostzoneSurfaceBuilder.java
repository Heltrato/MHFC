package com.heltrato.mhfc.world.surfacebuilders;

import com.heltrato.mhfc.blocks.BlocksMH;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

public class FrostzoneSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {


    public FrostzoneSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232136_1_) {
        super(p_i232136_1_);
    }

    @ParametersAreNonnullByDefault
    @Override
    public void apply(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        BlockState topBlock = config.getTopMaterial();
        BlockState middleBlock = config.getUnderMaterial();
        BlockPos.Mutable blockpos$mutableblockpos = new BlockPos.Mutable();
        int j = -1;
        int k = (int) (noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int posX = x & 15;
        int posZ = z & 15;
        for (int posY = startHeight; posY >= 0; --posY) {
            blockpos$mutableblockpos.set(posX, posY, posZ);
            BlockState blockstate2 = chunkIn.getBlockState(blockpos$mutableblockpos);
            if (blockstate2.isAir()) {
                j = -1;
            } else if (blockstate2.getBlock() == defaultBlock.getBlock()) {
                if (j == -1) {
                    if (k <= 0) {
                        topBlock = Blocks.AIR.defaultBlockState();
                        middleBlock = defaultBlock;
                    } else if (posY >= seaLevel - 4 && posY <= seaLevel + 1) {
                        topBlock = config.getTopMaterial();
                        middleBlock = config.getUnderMaterial();
                    }

                    if (posY < seaLevel && topBlock.isAir()) {
                        if (biomeIn.getTemperature(blockpos$mutableblockpos.set(x, posY, z)) < 0.15F) {
                            topBlock = Blocks.ICE.defaultBlockState();
                        } else {
                            topBlock = defaultFluid;
                        }
                        blockpos$mutableblockpos.set(posX, posY, posZ);
                    }

                    j = k;

                    if (posY >= seaLevel - 1) {
                        chunkIn.setBlockState(blockpos$mutableblockpos, topBlock, false);
                    } else if (posY < seaLevel - 7 - k) {
                        topBlock = Blocks.AIR.defaultBlockState();
                        middleBlock = defaultBlock;
                        chunkIn.setBlockState(blockpos$mutableblockpos, config.getUnderwaterMaterial(), false);
                    } else {
                        chunkIn.setBlockState(blockpos$mutableblockpos, config.getUnderMaterial(), false);
                    }
                } else if (j > 0) {
                    --j;
                    chunkIn.setBlockState(blockpos$mutableblockpos, middleBlock, false);

                    if (j == 0 && middleBlock.getBlock() == BlocksMH.FROSTZONE_SNOW.get() && k > 1) {
                        j = random.nextInt(4) + Math.max(0, posY - 63);
                        middleBlock = Blocks.WATER.defaultBlockState();
                    }
                }
            }
        }

    }
}
