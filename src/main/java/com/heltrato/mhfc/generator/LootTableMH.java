package com.heltrato.mhfc.generator;

import com.google.common.collect.ImmutableList;
import com.heltrato.mhfc.blocks.BlocksMH;
import com.heltrato.mhfc.entity.EntitiesMH;
import com.heltrato.mhfc.generator.abstracts.BlockLootProviderMH;
import com.heltrato.mhfc.generator.abstracts.EntityLootProviderMH;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootTable.Builder;


import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootTableMH extends LootTableProvider {

	public LootTableMH(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);

	}

	@Nonnull
	@Override
	public String getName() {
		return "MH Loot Tables";
	}
	
	@Nonnull
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
		return ImmutableList.of(Pair.of(AddBlockLoots::new, LootParameterSets.BLOCK), Pair.of(AddEntityLoots::new, LootParameterSets.ENTITY));
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> arg1, @Nonnull ValidationTracker arg2) {
		arg1.forEach((var1,var2) -> LootTableManager.validateLootTable(arg2, var1, var2));
	}

	// Loot table for block drops.
	public static class AddBlockLoots extends BlockLootProviderMH {
		@Override
		public void addTables() {	
			BlocksMH.addBlockLoots(this);
		}
		@Nonnull
		@Override
		protected Iterable<Block> getKnownBlocks() {
			return BlocksMH.MOD_BLOCK.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
		}
	}
	
	// Loot table for entity drops.
	public static class AddEntityLoots extends EntityLootProviderMH{
		@Override
		public void addTables() {
			EntitiesMH.addEntityLoot(this);
		}
		
		@Nonnull
		@Override
		protected Iterable<EntityType<?>> getKnownEntities() {
			return EntitiesMH.MOD_ENTITY.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
		}
	}
	
	

}
