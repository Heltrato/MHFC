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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsMH {

	public final static DeferredRegister<Item> MOD_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, MainMH.MODID);
	
	public static RegistryObject<Item> GREATSWORD_BONE= addItem("greatsword_bone", () ->new SwordItemMH(ItemTier.IRON, 15,  -3.F, 10, Rarity.UNCOMMON));
	public static RegistryObject<Item> SWORD_HUNTERKNIFE= addItem("sword_hunterknife", () ->new SwordItemMH(ItemTier.IRON, 15,  -3.F, 10, Rarity.UNCOMMON));
	public static RegistryObject<Item> SHIELD_HUNTERKNIFE= addItem("shield_hunterknife", ShieldItemMH::new);


	public static void addItemLanguage(final LanguagesMH arg) {
		arg.addItem(SWORD_HUNTERKNIFE, "Hunter's Knife");
		arg.addItem(SHIELD_HUNTERKNIFE, "Hunter's Knife Shield");
		arg.addItem(GREATSWORD_BONE, "Bone Blade");
		
	}
	
	public  static void addItemModel(final ItemModelsMH arg) {
	}
	

	static  RegistryObject<Item> addItem(String arg1, Supplier<? extends  Item> arg2){
		return MOD_ITEM.register(arg1, arg2);
	}

	static RegistryObject<Item	> addItemEggSpawner (String arg1, EntityType<?> arg2, int arg3, int arg4){
		return MOD_ITEM.register(arg1, () -> new SpawnEggItemMH(arg2, arg3, arg4));
	}

	
}
