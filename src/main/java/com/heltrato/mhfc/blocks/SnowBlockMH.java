package com.heltrato.mhfc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nonnull;
import java.util.Random;

public class SnowBlockMH extends  BlockMH {

    final static VoxelShape field_220126_b = Block.makeCuboidShape(0.0D, 0.0D, 0.0D , 16.0D , 5D , 16.0D);

    public SnowBlockMH(float arg2, float arg3, float arg4){
        this(0.2f, ToolType.PICKAXE, arg2, arg3, arg4);

    }

    public SnowBlockMH(float arg1, ToolType arg2, float arg3, float arg4, float arg5) {
        super(Material.SNOW_BLOCK, SoundType.SNOW, 0, arg1, arg1, 0, arg2, arg3, arg4, arg5);
    }

    @Override
    public boolean ticksRandomly(@Nonnull BlockState state) {
        if(this == BlocksMH.FROSTZONE_SNOW.get()){
            return true;
        }
        return super.ticksRandomly(state);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if(this == BlocksMH.FROSTZONE_SNOW.get()){
            entityIn.setMotion(entityIn.getMotion().mul(0.5D,1.0D,0.5D));
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);
        if(this == BlocksMH.FROSTZONE_SNOW.get()) {
            if (rand.nextInt(4) == 0) {
                worldIn.addParticle(ParticleTypes.POOF, pos.getX() + rand.nextFloat(), pos.getY() + 1.1f, pos.getZ() + rand.nextFloat(), 0D, 0D, 0D);
            }
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return super.getShape(state, worldIn, pos, context);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        if(this == BlocksMH.FROSTZONE_SNOW.get()){
            return field_220126_b;
        }
        return super.getCollisionShape(state, worldIn, pos, context);
    }
}
