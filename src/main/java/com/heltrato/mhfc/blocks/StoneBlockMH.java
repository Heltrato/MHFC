package com.heltrato.mhfc.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StoneBlockMH extends  BlockMH{

    public StoneBlockMH(float arg1){
        this(arg1, 0, 0.6f, 1.0f, 1.0f);
    }

    public StoneBlockMH(float arg3, float arg4, float arg5){
        this(1.5f, 0, arg3, arg4, arg5);
    }

    public StoneBlockMH(float arg1, int arg2, float arg3, float arg4, float arg5){
        super(arg1, arg2, arg3,arg4,arg5);

    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        super.onEntityWalk(worldIn, pos, entityIn);
    }


}
