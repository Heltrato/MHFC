package com.heltrato.mhfc.generator.abstracts;

import java.util.function.Supplier;

import com.heltrato.mhfc.MainMH;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class BlockStateProviderMH extends BlockStateProvider {
	
	BlockModelProviderMH BLOCKMODELS;
	
	public BlockStateProviderMH(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, MainMH.MODID, exFileHelper);
		BLOCKMODELS = new BlockModelProviderMH(gen, exFileHelper) {
			
			@Override
			public String getName() {
				return BlockStateProviderMH.this.getName();
			}

			
			@Override
			protected void registerModels() {
			}
		};
	}
	
	ResourceLocation blockLocation(String name) {
	        return modLoc("block/" + name);
	}

	String blockName(Supplier<? extends Block> arg) {
		return arg.get().getRegistryName().getPath();
	}
	
	@Override
	public BlockModelProvider models() {
		return super.models();
	}
	
	public void basicBlock(Supplier<? extends Block> arg) {
		simpleBlock(arg.get());
	}
	
}
