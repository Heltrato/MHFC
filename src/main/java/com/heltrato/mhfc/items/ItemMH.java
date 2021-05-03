package com.heltrato.mhfc.items;

import com.heltrato.mhfc.MainMH;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMH extends Item {
	
	int int_Burn;

	public ItemMH() {
			this(new Properties().group(MainMH.getItemGroup()));
	}

	//Burn Properties.
	public ItemMH(int par1) {
		this();
		this.int_Burn = par1;
	}
	
	public ItemMH(Properties properties) {
		super(properties);
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return this.int_Burn;
	}
}
