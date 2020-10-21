package com.heltrato.mhfc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class MineralBlockMH extends Block {

    int lifespan;

    public MineralBlockMH(int var1, int var2) {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).setLightLevel((state) -> var1).harvestTool(ToolType.PICKAXE).notSolid());
        this.lifespan = var2;

    }





    @Override
    public boolean ticksRandomly(BlockState state) {
        return super.ticksRandomly(state);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }

}
