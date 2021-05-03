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
		this.ignoreFrustumCheck = true;
		FACTORY = new AnimationFactory(this);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
	}


	public static AttributeModifierMap.MutableAttribute func_234295_eP_() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.ATTACK_DAMAGE);
	}
	
	@Override
	public void livingTick() {
		super.livingTick();
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
	}
	
	@Override
	protected void onDeathUpdate() {
		super.onDeathUpdate();
	}
	
	@Override
	protected boolean canDropLoot() {
		return super.canDropLoot();
	}

	@Override
	public AnimationFactory getFactory() {
		return FACTORY;
	}

	protected abstract void registerControllers();
}
