package com.heltrato.mhfc.world;

import com.heltrato.mhfc.MainMH;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DimensionsMH {
    //World Fields
    public static RegistryKey<World> WORLD_FROSTZONE = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation(MainMH.MODID, "frostzone_world"));
    //Dimension Type Fields
    public static RegistryKey<DimensionType> DIMENSION_FROSTZONE = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation(MainMH.MODID, "frostzone_world"));
    //Dimension Render Info Fields TODO: Add separate class for this types.
    public static DimensionRenderInfo RENDER_FROSTZONE = new DimensionRenderInfo(255.0F,true,DimensionRenderInfo.FogType.NORMAL,false,false) {
        @Override
        public Vector3d func_230494_a_(Vector3d p_230494_1_, float p_230494_2_) {
            return p_230494_1_;
        }

        @Override
        public boolean func_230493_a_(int p_230493_1_, int p_230493_2_) {
            return false;
        }
    };


    public static void addChunkGenerator(){

    }

    public static void addBiomeProvider(){

    }

    @OnlyIn(Dist.CLIENT)
    public static void addDimensionRenderInfo(){
        DimensionRenderInfo.field_239208_a_.put(new ResourceLocation(MainMH.MODID, "frostzone_render"), RENDER_FROSTZONE );
    }





}
