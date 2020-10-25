package com.heltrato.mhfc.blocks;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.generator.ItemModelsMH;
import com.heltrato.mhfc.generator.LanguagesMH;
import com.heltrato.mhfc.generator.LootTableMH.AddBlockLoots;
import com.heltrato.mhfc.generator.abstracts.BlockStateProviderMH;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlocksMH {

	public final static DeferredRegister<Block> MOD_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS,
			MainMH.MODID);

	public static Block FROSTZONE_CRACKEDICE;
	public  static Block FROSTZONE_ICE;
	public  static Block FROSTZONE_SNOW;
	public  static Block FROSTZONE_STONE;
	public  static Block FROSTZONE_SMOOTH_STONE;
	public  static Block FROSTZONE_CLAY_LIME;
	public  static Block FROSTZONE_CLAY_PEACH;
	public  static Block FROSTZONE_MINERAL_LOW;

	public static void initateBlocks(){
		FROSTZONE_CRACKEDICE = addBlock("frostzone_crackedice",() -> new GlacierBlockMH(0.5f, 0.5f, ToolType.PICKAXE, 0.98F));
		FROSTZONE_ICE = addBlock("frostzone_ice",
				() -> new GlacierBlockMH( 0.5F, 0.5F, ToolType.PICKAXE, 0.98f));
		FROSTZONE_SNOW = addBlock("frostzone_snow", () -> new SnowBlockMH(0.6f, 0.7f, 1.0f));
		FROSTZONE_STONE = addBlock("frostzone_stone", () -> new StoneBlockMH(1.5f));
		FROSTZONE_SMOOTH_STONE = addBlock("frostzone_smooth_stone", () -> new StoneBlockMH(1.5f));
		FROSTZONE_CLAY_LIME = addBlock("frostzone_clay_lime", () -> new SnowBlockMH(0.6f, 1.0f,  1.3f));
		FROSTZONE_CLAY_PEACH = addBlock("frostzone_clay_peach", () -> new SnowBlockMH(1.0f, 1.0f, 1.1f));
		FROSTZONE_MINERAL_LOW = addBlock("frostzone_mineral_low", () -> new MineralBlockMH(2, 12));
	}


	public static void addBlockLanguage(final LanguagesMH arg) {
		arg.add(FROSTZONE_CRACKEDICE, "Frostzone Cracked Ice");
		arg.add(FROSTZONE_ICE, "Frostzone Ice");
		arg.add(FROSTZONE_SNOW, "Frostzone Snow");
		arg.add(FROSTZONE_STONE, "Frostzone Stone");
		arg.add(FROSTZONE_SMOOTH_STONE, "Frostzone Smooth Stone");
		arg.add(FROSTZONE_CLAY_LIME, "Frostzone Lime Clay");
		arg.add(FROSTZONE_CLAY_PEACH, "Frostzone Peach Clay");
		arg.add(FROSTZONE_MINERAL_LOW, "Frostzone Mineral Low I");
	}

	public static void addBlockStatesandModel(final BlockStateProviderMH arg) {
		arg.basicBlock(FROSTZONE_CRACKEDICE);
		arg.basicBlock(FROSTZONE_ICE);
		arg.basicBlock(FROSTZONE_SNOW);
		arg.basicBlock(FROSTZONE_STONE);
		arg.basicBlock(FROSTZONE_SMOOTH_STONE);
		arg.basicBlock(FROSTZONE_CLAY_LIME);
		arg.basicBlock(FROSTZONE_CLAY_PEACH);
	}

	// upon creating a new block generate the blockstate and model first with
	// runData then generate this one after otherwise it will crash.
	public static void addBlockItemModels(final ItemModelsMH arg) {
		arg.addItemBlockModel(FROSTZONE_CRACKEDICE);
		arg.addItemBlockModel(FROSTZONE_ICE);
		arg.addItemBlockModel(FROSTZONE_SNOW);
		arg.addItemBlockModel(FROSTZONE_STONE);
		arg.addItemBlockModel(FROSTZONE_SMOOTH_STONE);
		arg.addItemBlockModel(FROSTZONE_CLAY_PEACH);
		arg.addItemBlockModel(FROSTZONE_CLAY_LIME);
		arg.addItemBlockModel(FROSTZONE_MINERAL_LOW);
	}

	public static void addBlockLoots(final AddBlockLoots arg) {
		arg.addBlockSelfDrop(FROSTZONE_CRACKEDICE);
		arg.addBlockSelfDrop(FROSTZONE_ICE);
		arg.addBlockSelfDrop(FROSTZONE_SNOW);
		arg.addBlockSelfDrop(FROSTZONE_STONE);
		arg.addBlockSelfDrop(FROSTZONE_SMOOTH_STONE);
		arg.addBlockSelfDrop(FROSTZONE_CLAY_LIME);
		arg.addBlockSelfDrop(FROSTZONE_CLAY_PEACH);
		arg.addBlockSelfDrop(FROSTZONE_MINERAL_LOW);
	}

	@OnlyIn(Dist.CLIENT)
	public static void classifyBlockRenderTypes() {
		RenderTypeLookup.setRenderLayer(FROSTZONE_CRACKEDICE, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FROSTZONE_ICE, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(FROSTZONE_MINERAL_LOW, RenderType.getCutout());
		MainMH.log.info("Applying Render Types for certain " + MainMH.MODID.toUpperCase() + " blocks! ");
	}

	/*-------------------------------------------------------------------------------------------//
	
			NON PUBLIC METHODS BELOW; DO NOT EDIT NOR MODIFY. @author: Heltrato
	Revamp 1.16.3 changed to public
	//-------------------------------------------------------------------------------------------*/

	public static Block addBlock(String arg1, Supplier<? extends  Block> arg2){
		BlockItem itemBlock = new BlockItem(arg2.get(), new Item.Properties().group(MainMH.getItemGroup()));
		Registry.register(Registry.BLOCK, new ResourceLocation(MainMH.MODID, arg1), arg2.get());
		Registry.register(Registry.ITEM, new ResourceLocation(MainMH.MODID, arg1), itemBlock);
		return arg2.get();
	}

	public static Block addBlock(String arg1,  BlockItem arg2,Supplier<? extends  Block> arg3){
		Registry.register(Registry.BLOCK, new ResourceLocation(MainMH.MODID, arg1), arg3.get());
		if(arg2!=null) {
			Registry.register(Registry.ITEM, new ResourceLocation(MainMH.MODID, arg1), arg2);
		}
		return arg3.get();
	}

}
