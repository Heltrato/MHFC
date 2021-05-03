package com.heltrato.mhfc.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemGroupMH extends ItemGroup {

	public ItemGroupMH(String label) {
		super(label);
		
	}

	@Nonnull
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemsMH.SWORD_HUNTERKNIFE.get());
	}
	
}
