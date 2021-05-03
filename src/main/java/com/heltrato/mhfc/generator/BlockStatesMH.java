package com.heltrato.mhfc.generator;

import javax.annotation.Nonnull;

import com.heltrato.mhfc.blocks.BlocksMH;
import com.heltrato.mhfc.generator.abstracts.BlockStateProviderMH;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStatesMH extends BlockStateProviderMH {

	public BlockStatesMH(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, exFileHelper);
		
	}

	@Nonnull
	@Override
	public String getName() {
		return "MH Blockstates and Models";
	}
	
	@Override
	protected void registerStatesAndModels() {
		BlocksMH.addBlockStatesandModel(this);
	}

}
