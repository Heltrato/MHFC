package com.heltrato.mhfc.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.manager.AnimationData;

public class HostileCreatureEntityMH extends  CreatureEntityMH{
    public HostileCreatureEntityMH(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerControllers() {

    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {

    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {

    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }
}
