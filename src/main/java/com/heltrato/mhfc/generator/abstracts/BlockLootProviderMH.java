package com.heltrato.mhfc.generator.abstracts;

import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.MatchTool;
import net.minecraft.loot.LootTable;


public abstract class BlockLootProviderMH extends BlockLootTables {

	final static ILootCondition.IBuilder SILKTOUCH = MatchTool.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));
	final static ILootCondition.IBuilder SHEAR =MatchTool.builder(ItemPredicate.Builder.create().item(Items.SHEARS));
	final static ILootCondition.IBuilder SILKorSHEAR = SHEAR.alternative(SILKTOUCH);
	final static ILootCondition.IBuilder SHEARorSILK = SILKorSHEAR.inverted();
	
	public void registerTable(Block arg1, Function<Block, LootTable.Builder> arg2) {
        super.registerLootTable(arg1, arg2);
    }
	
	public void addBlockSelfDrop(Supplier<? extends Block> arg) {
		super.registerDropSelfLootTable(arg.get());
	}


	
}
