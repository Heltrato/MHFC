package com.heltrato.mhfc.world.surfacebuilders;

import com.heltrato.mhfc.MainMH;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SurfaceBuildersMH {

    public static SurfaceBuilder<SurfaceBuilderConfig> FROSTZONE_SURFACE_BUILDER = new FrostzoneSurfaceBuilder(SurfaceBuilderConfig.field_237203_a_);

    public static void addSurfaceBuilders(){
        Registry.register(Registry.SURFACE_BUILDER, new ResourceLocation(MainMH.MODID, "frostzone_surface_builder"), FROSTZONE_SURFACE_BUILDER);
    }

}
