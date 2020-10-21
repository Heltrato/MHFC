package com.heltrato.mhfc.items.weapon;

import com.heltrato.mhfc.MainMH;

import net.minecraft.item.ShieldItem;

public class ShieldItemMH extends ShieldItem{

	public ShieldItemMH() {
		super(new Properties().group(MainMH.getItemGroup()).maxStackSize(1));
		
	}

}
