package com.heltrato.mhfc.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public abstract class CreatureEntityMH extends CreatureEntity implements IEntityAdditionalSpawnData, IAnimatedEntity {
	
	public EntityAnimationManager MANAGER = new EntityAnimationManager();

	public  CreatureEntityMH(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.ignoreFrustumCheck = true;
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
	public EntityAnimationManager getAnimationManager() {
		return MANAGER;
	}

	protected abstract void registerControllers();
}
