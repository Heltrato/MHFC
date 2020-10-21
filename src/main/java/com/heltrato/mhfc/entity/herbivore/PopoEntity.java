package com.heltrato.mhfc.entity.herbivore;

import com.heltrato.mhfc.entity.HerbivoreEntityMH;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.event.AnimationTestEvent;

public class PopoEntity extends HerbivoreEntityMH {

    EntityAnimationController<PopoEntity> controller = new EntityAnimationController<>(this, "walkController", 20, this::animationPredicate);

    public PopoEntity(EntityType<? extends PopoEntity> type, World worldIn) {
        super(type, worldIn);
        registerControllers();
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)0.3F).createMutableAttribute(Attributes.MAX_HEALTH, 120D).createMutableAttribute(Attributes.FOLLOW_RANGE, 30D).createMutableAttribute(Attributes.ARMOR, 3D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Override
    protected void registerControllers() {
        MANAGER.addAnimationController(controller);

    }


    <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> arg){
        if(arg.isWalking()){
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.mhfc.popo.walk", true));
            return true;
        } else {
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.mhfc.popo.idle", true));
        }
        return true;
    }
}
