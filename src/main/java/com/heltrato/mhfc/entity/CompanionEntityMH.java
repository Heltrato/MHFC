package com.heltrato.mhfc.entity;

import java.util.Random;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public abstract class CompanionEntityMH extends CreatureEntityMH{

	public CompanionEntityMH(EntityType<? extends CompanionEntityMH> type, World worldIn) {
		super(type, worldIn);
		
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		goalSelector.addGoal(0, new LookAtGoal(this, PlayerEntity.class, 6.0F));
		goalSelector.addGoal(1, new LookRandomlyGoal(this));
		goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue()));
	}

	public static AttributeModifierMap.MutableAttribute func_234295_eP_() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.ATTACK_DAMAGE);
	}

	@Override
	public void writeSpawnData(PacketBuffer buffer) {
	}

	@Override
	public void readSpawnData(PacketBuffer additionalData) {
	}

	public static boolean canSpawnOn(EntityType<? extends MobEntity> typeIn, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn) {
		BlockPos blockpos = pos.down();
		return reason == SpawnReason.SPAWNER || reason == SpawnReason.MOB_SUMMONED || worldIn.getBlockState(blockpos).canEntitySpawn(worldIn, blockpos, typeIn);
	}
	

}
