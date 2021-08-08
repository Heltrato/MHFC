package com.heltrato.mhfc.world.biome;

import com.heltrato.mhfc.MainMH;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BiomesMH {

    public static DeferredRegister<Biome> MOD_BIOME = DeferredRegister.create(ForgeRegistries.BIOMES, MainMH.MODID);

    static {
        addBiome("frostzone_thickhoar", BiomeMaker::theVoidBiome);
    }

    public static RegistryObject<Biome> addBiome(String arg1, Supplier<Biome> arg2){
        return  MOD_BIOME.register(arg1, arg2);

    }
}
