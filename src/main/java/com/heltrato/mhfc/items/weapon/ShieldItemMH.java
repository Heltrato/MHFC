package com.heltrato.mhfc.items.weapon;

import com.heltrato.mhfc.MainMH;

import net.minecraft.item.ShieldItem;

public class ShieldItemMH extends ShieldItem{

	public ShieldItemMH() {
		super(new Properties().tab(MainMH.getItemGroup()).stacksTo(1));
		
	}

}
