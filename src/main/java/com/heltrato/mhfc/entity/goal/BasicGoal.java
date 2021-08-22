package com.heltrato.mhfc.entity.goal;

import net.minecraft.entity.ai.goal.Goal;

public class BasicGoal extends Goal {


	@Override
	public boolean canUse() {
		return false;
	}

	/*
		The probably to trigger this Goal
	 */

	public int getWeightChance(boolean isInRage, int x, int y){
		if(isInRage){
			return x;
		}else{
			return y;
		}

	}

}
