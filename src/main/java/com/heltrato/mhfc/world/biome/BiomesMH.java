package com.heltrato.mhfc.world.biome;

import com.heltrato.mhfc.MainMH;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.BiomeMaker;

public class BiomesMH {

    public static ResourceLocation FROSTZONE_THICKHOAR = new ResourceLocation(MainMH.MODID, "frostzone_thickhoar");

    public static void addBiomeIDS() {
        Registry.register(WorldGenRegistries.BIOME, FROSTZONE_THICKHOAR, BiomeMaker.makeColdOceanBiome(false));
    }
}
