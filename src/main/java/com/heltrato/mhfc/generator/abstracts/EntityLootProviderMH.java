package com.heltrato.mhfc.generator.abstracts;

import java.util.function.Supplier;

import net.minecraft.data.loot.EntityLootTables;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootTable;


public class EntityLootProviderMH extends EntityLootTables  {

	public LootTable.Builder blankTable() {
		return LootTable.lootTable();
	}
	
	public void add(Supplier<? extends EntityType<?>> arg1, LootTable.Builder arg2) {
		super.add(arg1.get(), arg2);
	}

}
