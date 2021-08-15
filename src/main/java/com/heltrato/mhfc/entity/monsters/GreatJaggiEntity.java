package com.heltrato.mhfc.entity.monsters;

import com.heltrato.mhfc.entity.HostileCreatureEntityMH;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class GreatJaggiEntity extends HostileCreatureEntityMH {

    
    public GreatJaggiEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
