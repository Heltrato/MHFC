package com.heltrato.mhfc.world.biome;

import com.mojang.serialization.Codec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.List;

//todo biome provider from bumblezone fck
public class BiomeProviderMH extends BiomeProvider {


    protected BiomeProviderMH(List<Biome> biomes) {
        super(biomes);
    }

    @Override
    protected Codec<? extends BiomeProvider> getBiomeProviderCodec() {
        return null;
    }

    @Override
    public BiomeProvider getBiomeProvider(long seed) {
        return null;
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return null;
    }
}
