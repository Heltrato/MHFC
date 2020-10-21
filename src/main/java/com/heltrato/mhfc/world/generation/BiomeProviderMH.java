package com.heltrato.mhfc.world.generation;

import com.heltrato.mhfc.MainMH;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.data.BiomeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;


public class BiomeProviderMH extends BiomeProvider {

    private static Long SEED;


    public BiomeProviderMH(DataGenerator generator) {
        super(generator);
    }

    public static void addBiomeProvider() {
       // Registry.register(Registry.BIOME_SOURCE_KEY, new ResourceLocation(MainMH.MODID, "biome_source"), )
    }


}
