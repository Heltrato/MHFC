package com.heltrato.mhfc.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class GlacierBlockMH extends BlockMH {

	public GlacierBlockMH(float arg1, float arg2, ToolType arg3, float arg4) {
		super(Material.ICE, SoundType.GLASS, arg1, arg2, arg3, arg4);

	}



	@SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this || super.isSideInvisible(state, adjacentBlockState, side);
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (worldIn.getBlockState(pos).getBlock() == BlocksMH.FROSTZONE_CRACKEDICE.get()) {
			BlockState var1 = Blocks.WATER.getDefaultState();
			worldIn.playSound(null, pos, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 1.0f,
					1.0f);
			worldIn.setBlockState(pos, var1);
		}
		super.onEntityWalk(worldIn, pos, entityIn);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, java.util.Random rand) {
		float f1 = pos.getX() + 0.5F;
		float f2 = pos.getY() + 1.1F;
		float f3 = pos.getZ() + 0.5F;
		float f4 = rand.nextFloat() * 0.6F - 0.3F;
		float f5 = rand.nextFloat() * -0.6F - -0.3F;
		worldIn.addParticle(ParticleTypes.POOF, f1 + f4, f2, (double) f3 + f5, 0D, 0D, 0D);
	}

}
