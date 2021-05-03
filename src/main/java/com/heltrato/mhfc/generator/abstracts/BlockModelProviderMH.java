package com.heltrato.mhfc.generator.abstracts;

import com.heltrato.mhfc.MainMH;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class BlockModelProviderMH extends BlockModelProvider {

	
	public BlockModelProviderMH(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MainMH.MODID , existingFileHelper);
	}
	
	 public BlockModelBuilder addBasicModel(Block block, ResourceLocation bottom, ResourceLocation top) {
	        return withExistingParent(block.getRegistryName().getPath(), modLoc("block/base/cube_all_2_layer"))
	                .texture("all", bottom)
	                .texture("all2", top);
	    }



	
}
