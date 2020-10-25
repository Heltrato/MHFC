package com.heltrato.mhfc.items;

import java.util.function.Supplier;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.generator.ItemModelsMH;
import com.heltrato.mhfc.generator.LanguagesMH;
import com.heltrato.mhfc.items.weapon.ShieldItemMH;
import com.heltrato.mhfc.items.weapon.SwordItemMH;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsMH {

	public final static DeferredRegister<Item> MOD_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MainMH.MODID);
	
	public static Item GREATSWORD_BONE;
	public static Item SWORD_HUNTERKNIFE;
	public static Item SHIELD_HUNTERKNIFE;


	public static void initiateItems(){
		GREATSWORD_BONE = addItem("greatsword_bone",() -> new SwordItemMH(ItemTier.IRON, 15,  -3.F, 10, Rarity.UNCOMMON));
		SWORD_HUNTERKNIFE = addItem("sword_hunterknife", () -> new SwordItemMH(ItemTier.IRON, 15,  -3.F, 10, Rarity.UNCOMMON));
		SHIELD_HUNTERKNIFE = addItem("shield_hunterknife", ShieldItemMH::new);
	}
	public static void addItemLanguage(final LanguagesMH arg) {
		arg.add(SWORD_HUNTERKNIFE, "Hunter's Knife");
		arg.add(SHIELD_HUNTERKNIFE, "Hunter's Knife Shield");
		arg.add(GREATSWORD_BONE, "Bone Blade");
		
	}
	
	public  static void addItemModel(final ItemModelsMH arg) {
	}
	

	public static Item addItem(String arg1, Supplier<? extends Item> arg2){
		Registry.register(Registry.ITEM, new ResourceLocation(MainMH.MODID,arg1), arg2.get());
		return arg2.get();
	}

	public static Item addItemEggSpawner(String arg1, EntityType<?> arg2, int arg3, int arg4){
		Item spawner = new SpawnEggItemMH(arg2, arg3, arg4);
		Registry.register(Registry.ITEM, new ResourceLocation(MainMH.MODID,arg1), spawner);
		return spawner;
	}
	
}
