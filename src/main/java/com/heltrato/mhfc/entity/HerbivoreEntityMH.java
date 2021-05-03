package com.heltrato.mhfc.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public abstract class HerbivoreEntityMH extends  CreatureEntityMH {

    /*
        The entity class for all Herbivore entities, most of this are non aggresive ones and the AI methods here are
        mostly for their benefits and behaviour with blocks interactions.

     */

    protected double PANICSPEED;

    public HerbivoreEntityMH(EntityType<? extends HerbivoreEntityMH> type, World worldIn) {
        super(type, worldIn);
        this.PANICSPEED = 2D; //DEFAULT
    }

    @Override
    protected void registerGoals() {
        goalSelector.addGoal(0, new SwimGoal(this));
        goalSelector.addGoal(1, new PanicGoal(this, getPANICSPEED()));
        goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 8.0F));// todo change to var
        goalSelector.addGoal(3, new LookRandomlyGoal(this));
        goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue()));
        super.registerGoals();

    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {
    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {
    }

    public void setPANICSPEED(double PANICSPEED) {
        this.PANICSPEED = PANICSPEED;
    }

    public double getPANICSPEED() {
        return PANICSPEED;
    }

    public static boolean canSpawnOn(EntityType<? extends MobEntity> typeIn, IWorld worldIn, SpawnReason reason, BlockPos pos, Random randomIn) {
        BlockPos blockpos = pos.down();
        return reason == SpawnReason.SPAWNER || reason == SpawnReason.MOB_SUMMONED || worldIn.getBlockState(blockpos).canEntitySpawn(worldIn, blockpos, typeIn);
    }

}
