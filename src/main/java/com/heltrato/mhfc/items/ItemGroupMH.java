package com.heltrato.mhfc.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupMH extends ItemGroup {

	public ItemGroupMH(String label) {
		super(label);
		
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemsMH.SWORD_HUNTERKNIFE);
	}
	
}
