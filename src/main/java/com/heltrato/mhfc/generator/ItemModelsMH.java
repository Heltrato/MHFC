package com.heltrato.mhfc.generator;

import com.heltrato.mhfc.blocks.BlocksMH;
import com.heltrato.mhfc.generator.abstracts.ItemModelProviderMH;
import com.heltrato.mhfc.items.ItemsMH;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelsMH extends ItemModelProviderMH {

	public ItemModelsMH(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, existingFileHelper);
		
	}

	@Override
	public String getName() {
		return "MH Item Models";
	}

	@Override
	protected void registerModels() {
		BlocksMH.addBlockItemModels(this);
		ItemsMH.addItemModel(this);
	}
	

}
