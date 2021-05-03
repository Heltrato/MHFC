package com.heltrato.mhfc.generator.abstracts;

import com.heltrato.mhfc.MainMH;

import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.common.data.ForgeRecipeProvider;

public abstract class RecipeProviderMH extends ForgeRecipeProvider implements IConditionBuilder {

	public RecipeProviderMH(DataGenerator generatorIn) {
		super(generatorIn);
		
	}

	public CookingRecipeBuilder addFoodSmeltery(IItemProvider arg1, IItemProvider arg2, float arg3) {
		return this.addItemSmeltery(arg1, arg2, arg3, 1);
		
	}

	public CookingRecipeBuilder addFoodBlastSmeltery(IItemProvider arg1, IItemProvider arg2, float arg3) {
		return this.addItemBlastSmeltery(arg1, arg2, arg3, 1);
	}
	
	public CookingRecipeBuilder addItemBlastSmeltery(IItemProvider arg1, IItemProvider arg2, float arg3, int arg4) {
		return this.addItemBlastSmeltery(arg1, arg2, arg3, arg4, 100);
	}
	
	public CookingRecipeBuilder addItemBlastSmeltery(IItemProvider var1, IItemProvider arg2, float arg3, int arg4, int arg5) {
		return CookingRecipeBuilder.blastingRecipe(Ingredient.fromStacks(new ItemStack(arg2, arg4)), var1, arg3, arg5).addCriterion("has_" + arg2.asItem().getRegistryName(), this.hasItem(arg2));
	}
	
	CookingRecipeBuilder addItemSmeltery(IItemProvider var1, IItemProvider arg2, float arg3, int arg4) {
		return this.addItemSmeltery(var1, arg2, arg3, arg4, 200);
	}
	
	/*
	 *  addItemSmeltery all furnace with burn time are added here.
	 *  var1 - Result Item
	 *  arg2 - Item to be inputted or Ingredient.
	 *  arg3 - Experience Points in terms of float
	 *  arg4 - Quantity of Items upon output
	 *  var 5 - Smelting Time Duration.
	 */
	
	CookingRecipeBuilder addItemSmeltery(IItemProvider var1, IItemProvider arg2, float arg3, int arg4, int arg5) {
		return CookingRecipeBuilder.smeltingRecipe(Ingredient.fromStacks(new ItemStack(arg2, arg4)), var1, arg3, arg5)	.addCriterion("has_" + arg2.asItem().getRegistryName(), this.hasItem(arg2));
	}
	
	ResourceLocation resourceModFolderLocation(String var1) {
		return new ResourceLocation(MainMH.MODID, var1);
	}
	
	protected ResourceLocation materialLocation(String var1){
		return resourceModFolderLocation("material/" + var1);
	}
	
	protected ResourceLocation foodLocation(String var1)	{
		return resourceModFolderLocation("food/" + var1);
	}


	
}
