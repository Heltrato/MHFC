package com.heltrato.mhfc.entity.companion;

import com.heltrato.mhfc.entity.CompanionEntityMH;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.event.AnimationTestEvent;

public class FelyneEntity extends CompanionEntityMH {

	EntityAnimationController<FelyneEntity> controller = new EntityAnimationController<>(this, "walkController", 20, this::animationPredicate);

	public FelyneEntity(EntityType<? extends FelyneEntity> type, World worldIn) {
		super(type, worldIn);
		registerControllers();
		
	}
	public static AttributeModifierMap.MutableAttribute registerAttributes() {
		return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)0.3F).createMutableAttribute(Attributes.MAX_HEALTH, 15D).createMutableAttribute(Attributes.FOLLOW_RANGE, 30D).createMutableAttribute(Attributes.ARMOR, 3D).createMutableAttribute(Attributes.ATTACK_DAMAGE, 8D);
	}

	@Override
	protected void registerControllers() {
		MANAGER.addAnimationController(controller);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
	}

	<E extends Entity> boolean animationPredicate(AnimationTestEvent<E> arg){
		if(arg.isWalking()){
			controller.setAnimation(new AnimationBuilder().addAnimation("animation.mhfc.felyne.walk", true));
		} else {
			controller.setAnimation(new AnimationBuilder().addAnimation("animation.mhfc.felyne.idle"));
		}
		return  true;
	}

	
	

}
