package com.heltrato.mhfc.entity.client.render;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.entity.client.model.FelyneModel;
import com.heltrato.mhfc.entity.companion.FelyneEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class FelyneRenderer extends MobRenderer<FelyneEntity, FelyneModel> {

	final ResourceLocation FELYNE_DEFAULT = new ResourceLocation(MainMH.MODID, "textures/entity/felyne.png");
	
	public FelyneRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new FelyneModel(), 0.5F);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(FelyneEntity entity) {
		return FELYNE_DEFAULT;
	}

	@Override
	protected void applyRotations(FelyneEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
	}
}
