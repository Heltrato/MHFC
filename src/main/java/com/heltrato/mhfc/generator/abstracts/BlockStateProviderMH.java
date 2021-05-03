package com.heltrato.mhfc.generator.abstracts;

import java.util.Objects;
import java.util.function.Supplier;

import com.heltrato.mhfc.MainMH;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public abstract class BlockStateProviderMH extends BlockStateProvider {
	
	BlockModelProviderMH BLOCKMODELS;
	
	public BlockStateProviderMH(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, MainMH.MODID, exFileHelper);
		BLOCKMODELS = new BlockModelProviderMH(gen, exFileHelper) {
			
			@Nonnull
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
		return Objects.requireNonNull(arg.get().getRegistryName()).getPath();
	}
	
	@Override
	public BlockModelProvider models() {
		return super.models();
	}
	
	public void basicBlock( Supplier<? extends  Block> args ) {
		simpleBlock(args.get());
	}
	
}
