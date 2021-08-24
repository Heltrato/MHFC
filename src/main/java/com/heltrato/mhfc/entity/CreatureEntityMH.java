package com.heltrato.mhfc.entity;

import com.heltrato.mhfc.entity.implement.IAnimEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class CreatureEntityMH extends CreatureEntity implements IAnimEntity, IAnimatable {
	
	public AnimationFactory FACTORY;

	/*
		Global Variables
	 */

	public double anglePi = (180/Math.PI);

	protected boolean activate;
	protected boolean hasDied;

	protected float targetDistance;
	protected float targetAngle;

	protected float hp;
	protected float maxHp;
	protected float nearDeathHP;

	protected int deathTicks;
	protected int optimalHungerTick;
	protected int starvationTick;

	protected LivingEntity targetEntity;

	public  CreatureEntityMH(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.noCulling = true;
		FACTORY = new AnimationFactory(this);
		targetEntity = getTarget();
		hp = getHealth();
		maxHp = getMaxHealth();
		nearDeathHP = 0.15F;
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
	}


	public static AttributeModifierMap.MutableAttribute func_234295_eP_() {
		//Most Creatures in Monster Hunter tend to retaliate
		return MobEntity.createMobAttributes().add(Attributes.ATTACK_DAMAGE);
	}
	
	@Override
	public void aiStep() {
		super.aiStep();
	}

	/*
		Death Logic
	 */
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

	/*
		Despawn
	 */
	@Override
	public void checkDespawn() {
		super.checkDespawn();
	}

	/*
		Creature Updates Tick
	 */

	@Override
	public void tick() {
		super.tick();
		if(getTargetEntity() != null){
			targetDistance = preciseDistance(getTargetEntity());
			targetAngle = preciseAngleInBetweenEntities()
		}
	}

	public LivingEntity getTargetEntity(){
		return targetEntity;
	}

	//Spawning Condition;
	public static boolean spawnCondition(Entity type, IWorld world, SpawnReason reason, BlockPos pos, Random random){
		return true;
	}


	/*
		Animation Factory
	 */
	@Override
	public AnimationFactory getFactory() {
		return FACTORY;
	}
	protected abstract void registerControllers();


	/**
	 * Preliminary Calculations
	 */


	public float preciseDistance(@Nullable LivingEntity livingEntity){
		return this.distanceTo(livingEntity) - livingEntity.getBbWidth() / 2F;
	}

	public double preciseAngleInBetweenEntities(@Nullable Entity e1, @Nullable Entity e2){
		double e1X = e1.getX();
		double e1Z = e1.getZ();
		double e2X = e2.getX();
		double e2Z = e2.getZ();
		return dualAngledTangent(e1X, e2X, e1Z, e2Z);
	}

	public double dualAngledTangent(double aX1, double aX2, double aZ1, double aZ2){
		return Math.atan2(aZ2 - aZ1, aX2 - aX1) * anglePi + 90;
	}

	public float getHealthPointsRatio(){
		return Math.abs(getHp()/getMaxHp());
	}

	public boolean isHealthQuotaForRage(float x){
		float ratio = getHealthPointsRatio();
		float rageQuote = Math.abs(x);
		return ratio <= rageQuote;
	}

	public boolean isHealthQuotaForImmediateRun(){
		float ratio = getHealthPointsRatio();
		return ratio <= this.nearDeathHP;
	}

	public float getHp(){
		return hp;
	}

	public float getMaxHp(){
		return maxHp;
	}

	@Override
	public boolean attackable() {
		return super.attackable();
	}


	//Attack Entity From Method
	@Override
	public boolean hurt(DamageSource p_70097_1_, float p_70097_2_) {
		return super.hurt(p_70097_1_, p_70097_2_);
	}


}
