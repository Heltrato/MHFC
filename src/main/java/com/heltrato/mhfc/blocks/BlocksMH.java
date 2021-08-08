package com.heltrato.mhfc.blocks;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.generator.ItemModelsMH;
import com.heltrato.mhfc.generator.LanguagesMH;
import com.heltrato.mhfc.generator.LootTableMH.AddBlockLoots;
import com.heltrato.mhfc.generator.abstracts.BlockStateProviderMH;
import com.heltrato.mhfc.items.ItemsMH;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlocksMH {

	public final static DeferredRegister<Block> MOD_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS,MainMH.MODID);

	public static RegistryObject<Block> FROSTZONE_CRACKEDICE = addBlock("frostzone_crackedice", () -> new GlacierBlockMH(0.5f, 0.5f, ToolType.PICKAXE, 0.98F));
	public  static RegistryObject<Block> FROSTZONE_ICE = addBlock("frostzone_ice", () -> new GlacierBlockMH( 0.5F, 0.5F, ToolType.PICKAXE, 0.98f));
	public  static RegistryObject<Block> FROSTZONE_SNOW = addBlock("frostzone_snow", () -> new SnowBlockMH(0.6f, 0.7f, 1.0f));
	public  static RegistryObject<Block> FROSTZONE_STONE= addBlock("frostzone_stone", () -> new StoneBlockMH(1.5f));
	public  static RegistryObject<Block> FROSTZONE_SMOOTH_STONE= addBlock("frostzone_smooth_stone",  () -> new StoneBlockMH(1.5f));
	public  static RegistryObject<Block> FROSTZONE_CLAY_LIME= addBlock("frostzone_clay_lime", () -> new SnowBlockMH(0.6f, 1.0f,  1.3f));
	public  static RegistryObject<Block> FROSTZONE_CLAY_PEACH= addBlock("frostzone_clay_peach", () -> new SnowBlockMH(1.0f, 1.0f, 1.1f));
	public  static RegistryObject<Block> FROSTZONE_MINERAL_LOW= addBlock("frostzone_mineral_low",  () -> new MineralBlockMH(2, 12));



	public static void addBlockLanguage(final LanguagesMH arg) {
		arg.addBlock(FROSTZONE_CRACKEDICE, "Frostzone Cracked Ice");
		arg.addBlock(FROSTZONE_ICE, "Frostzone Ice");
		arg.addBlock(FROSTZONE_SNOW, "Frostzone Snow");
		arg.addBlock(FROSTZONE_STONE, "Frostzone Stone");
		arg.addBlock(FROSTZONE_SMOOTH_STONE, "Frostzone Smooth Stone");
		arg.addBlock(FROSTZONE_CLAY_LIME, "Frostzone Lime Clay");
		arg.addBlock(FROSTZONE_CLAY_PEACH, "Frostzone Peach Clay");
		arg.addBlock(FROSTZONE_MINERAL_LOW, "Frostzone Mineral Low I");
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
		RenderTypeLookup.setRenderLayer(FROSTZONE_CRACKEDICE.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FROSTZONE_ICE.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FROSTZONE_MINERAL_LOW.get(), RenderType.cutout());
		MainMH.log.info("Applying Render Types for certain " + MainMH.MODID.toUpperCase() + " blocks! ");
	}

	/*-------------------------------------------------------------------------------------------//
	
			NON PUBLIC METHODS BELOW; DO NOT EDIT NOR MODIFY. @author: Heltrato
	Revamp 1.16.3 changed to public
	//-------------------------------------------------------------------------------------------*/

	static RegistryObject<Block> addBlock(String arg1, Supplier<? extends Block> arg2) {
		return addBlock(arg1, arg2, BlocksMH::addItemBlockProperty);
	}

	static RegistryObject<Block> addBlock(String arg1, Supplier<? extends Block> arg2,
										  Function<RegistryObject<Block>, Supplier<? extends Item>> arg4) {
		RegistryObject<Block> var = MOD_BLOCK.register(arg1, arg2);
		ItemsMH.MOD_ITEM.register(arg1, arg4.apply(var));
		return var;
	}

	static Supplier<BlockItem> addItemBlockProperty(final RegistryObject<Block> var) {
		return () -> new BlockItem(var.get(), new Item.Properties().tab(MainMH.getItemGroup()));
	}



}
