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
        super(Properties.of(Material.STONE).sound(SoundType.STONE).lightLevel((state) -> var1).harvestTool(ToolType.PICKAXE).noCollission());
        this.lifespan = var2;

    }





    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return super.isRandomlyTicking(state);
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        return super.use(state, worldIn, pos, player, handIn, hit);
    }

}
