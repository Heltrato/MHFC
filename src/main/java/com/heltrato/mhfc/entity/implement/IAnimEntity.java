package com.heltrato.mhfc.entity.implement;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public interface IAnimEntity extends IEntityAdditionalSpawnData {

    int getAnimationID();
    void setAnimationID(int i);
    int animationTick();
    void setAnimationTick(int t);

    @Override
    default void writeSpawnData(PacketBuffer buffer){
        buffer.writeVarInt(this.getAnimationID());
    }

    @Override
    default void readSpawnData(PacketBuffer additionalData){
        this.setAnimationID(additionalData.readVarInt());
        this.setAnimationTick(additionalData.readVarInt());
    }

}
