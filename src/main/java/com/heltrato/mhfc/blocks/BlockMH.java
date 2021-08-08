package com.heltrato.mhfc.blocks;

import java.util.Optional;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockMH extends Block {

	/**
	 * 	 Variables:
	 * 1 - Material
	 * 2- SoundType
	 * 3 - Light Value
	 * 4 - Hardness
	 * 5 - Resistance
	 * 6 - Harvest Level
	 * 7 - Harvest Tool
	 * 8 - Slipperiness
	 * 9 - Speed Factor
	 * 10 - Jump Factor
	 *
	 * 
	 */


	public BlockMH(Material arg1,  SoundType arg2, int arg3, float arg4, float arg5, int arg6, ToolType arg7, @Nullable float arg8, @Nullable float arg9, @Nullable float arg10) {
		super(Properties.of(arg1).sound(arg2).lightLevel((state) -> arg3).strength(arg4, arg5).harvestLevel(arg6).harvestTool(arg7).friction(Optional.ofNullable(arg8).orElse(0.6f)).speedFactor(Optional.ofNullable(arg9).orElse(1.0f)).jumpFactor(Optional.ofNullable(arg10).orElse(1.0f)));
		
	}
	
	public BlockMH(float arg1, int arg2, float arg3, float arg4, float arg5){
		this(Material.STONE, SoundType.STONE, 0, arg1, arg1, arg2, ToolType.PICKAXE, arg3, arg4, arg5);
	}

	// Ice or Destructive Blocks Blocks
	public BlockMH(Material arg1, SoundType arg2,  float arg3, float arg4, ToolType arg5,float arg6) {
		super(Properties.of(arg1).sound( arg2).strength(arg3, arg4).harvestTool(arg5).noCollission().randomTicks().friction(arg6));
	}

}
