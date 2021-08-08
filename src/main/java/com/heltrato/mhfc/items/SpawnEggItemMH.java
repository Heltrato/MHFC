package com.heltrato.mhfc.items;

import com.heltrato.mhfc.MainMH;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

public class SpawnEggItemMH extends SpawnEggItem{

	public SpawnEggItemMH(EntityType<?> typeIn, int primaryColorIn, int secondaryColorIn) {
		super(typeIn, primaryColorIn, secondaryColorIn, new Properties().tab(MainMH.getItemGroup()));
		
	} 

}
