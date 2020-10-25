package com.heltrato.mhfc.generator.abstracts;

import java.util.Objects;
import java.util.function.Supplier;

import com.heltrato.mhfc.MainMH;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public abstract class ItemModelProviderMH extends ItemModelProvider {

	final String ITEMLAYER0;
	final String ITEMGENERATEDLOCATION;
	final String ITEMHANDHELD;
	final String iTEMFOLDER;
	final String BLOCKFOLDER;
	
	public ItemModelProviderMH(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, MainMH.MODID , existingFileHelper);
		ITEMLAYER0 = "layer0";
		ITEMGENERATEDLOCATION = "item/generated";
		ITEMHANDHELD = "item/handheld";
		BLOCKFOLDER = "block/";
		iTEMFOLDER = "item/";
	}
	
	// Adds the blocks name base from the registryname of the Block (Supplier).
	public String addBlockName(Block arg) {
		return Objects.requireNonNull(arg.getRegistryName()).getPath();
	}
	
	// Adds the items name base from the registryname of the Item (Supplier).
	public String  addItemName(Supplier<? extends Item> var1) {
		return Objects.requireNonNull(var1.get().getRegistryName()).getPath();
	}
	/**
	 * 	This method adds block items to its specific model.json
	 * @param arg - block.
	 * @return the specific block and the registry Name
	 */
	
	public ItemModelBuilder addItemBlockModel(Block arg) 
	{
		return this.addItemBlockModel(arg, addBlockName(arg));
	}
	
	public ItemModelBuilder addItemBlockModel(Block arg1, String arg2) {
		return this.withExistingParent(addBlockName(arg1), modLoc(BLOCKFOLDER + arg2));
	}
	
	//Adds the texture for Block Models.
	public ItemModelBuilder addItemBlockModelTexture(Block arg) {
		return withExistingParent(addBlockName(arg), mcLoc(ITEMGENERATEDLOCATION)).texture(ITEMLAYER0, modLoc(BLOCKFOLDER + addBlockName(arg)));
	}
	
	/**
	 *  The methods below is for Items to add Model.
	 * @param arg
	 * @return
	 */
	
	public ItemModelBuilder addItemModel(Supplier<? extends Item> arg) {
		return	this.withExistingParent(addItemName(arg), mcLoc(ITEMGENERATEDLOCATION)).texture(ITEMLAYER0, modLoc(ITEM_FOLDER + addItemName(arg)));
	}
	
	public ItemModelBuilder addToolModel(Supplier<? extends Item> arg)	{
		return	this.withExistingParent(addItemName(arg), mcLoc(ITEMHANDHELD)).texture(ITEMLAYER0, modLoc(ITEM_FOLDER + addItemName(arg)));
	}
	
	public ItemModelBuilder addEggItemModel(Supplier<? extends Item> arg){
		String var = "item/template_spawn_egg";
		return this.withExistingParent(addItemName(arg), mcLoc(var));
	}
	


}
