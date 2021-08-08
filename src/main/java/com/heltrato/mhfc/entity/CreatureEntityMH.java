package com.heltrato.mhfc.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public abstract class CreatureEntityMH extends CreatureEntity implements IEntityAdditionalSpawnData, IAnimatable {
	
	public AnimationFactory FACTORY;

	public  CreatureEntityMH(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.noCulling = true;
		FACTORY = new AnimationFactory(this);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
	}


	public static AttributeModifierMap.MutableAttribute func_234295_eP_() {
		return MobEntity.createMobAttributes().add(Attributes.ATTACK_DAMAGE);
	}
	
	@Override
	public void aiStep() {
		super.aiStep();
	}
	
	@Override
	public void die(DamageSource cause) {
		super.die(cause);
	}
	
	@Override
	protected void tickDeath() {
		super.tickDeath();
	}
	
	@Override
	protected boolean shouldDropExperience() {
		return super.shouldDropExperience();
	}

	@Override
	public AnimationFactory getFactory() {
		return FACTORY;
	}

	protected abstract void registerControllers();
}
