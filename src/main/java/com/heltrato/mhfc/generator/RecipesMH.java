package com.heltrato.mhfc.generator;

import java.util.function.Consumer;

import com.heltrato.mhfc.generator.abstracts.RecipeProviderMH;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class RecipesMH extends RecipeProviderMH implements IConditionBuilder{

	public RecipesMH(DataGenerator generatorIn) {
		super(generatorIn);
		
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
	}

}
