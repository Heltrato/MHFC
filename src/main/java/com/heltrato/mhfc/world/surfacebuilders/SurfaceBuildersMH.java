package com.heltrato.mhfc.world.surfacebuilders;

import com.heltrato.mhfc.MainMH;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class SurfaceBuildersMH {

    public static DeferredRegister<SurfaceBuilder<?>> MOD_SURFACEBUILDER = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MainMH.MODID);


    public static RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> FROSTZONE_SURFACE_BUILDER = addSurfaceBuilders("frostzone_surface_builder", () -> new FrostzoneSurfaceBuilder(SurfaceBuilderConfig.CODEC));


    static <S extends  SurfaceBuilder<?>>RegistryObject<S>  addSurfaceBuilders(String arg1, Supplier<? extends  S> arg2){
        return  MOD_SURFACEBUILDER.register(arg1, arg2);
    }


}
