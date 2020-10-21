package com.heltrato.mhfc.entity.client.render;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.entity.client.model.FelyneModel;
import com.heltrato.mhfc.entity.client.model.PopoModel;
import com.heltrato.mhfc.entity.companion.FelyneEntity;
import com.heltrato.mhfc.entity.herbivore.PopoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Resource;

@OnlyIn(Dist.CLIENT)
public class PopoRenderer extends MobRenderer<PopoEntity, PopoModel> {

    protected float renderSize;

    final ResourceLocation POPO_DEFAULT = new ResourceLocation(MainMH.MODID, "textures/entity/popo.png");

    public PopoRenderer(EntityRendererManager renderManagerIn, float renderSize) {
        super(renderManagerIn, new PopoModel(), 1.0F);
        this.renderSize = renderSize;
    }


    @Override
    public ResourceLocation getEntityTexture(PopoEntity entity) {
        return POPO_DEFAULT;
    }

    @Override
    protected void applyRotations(PopoEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(PopoEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(renderSize,renderSize,renderSize);
        super.preRenderCallback(entitylivingbaseIn,matrixStackIn,partialTickTime);
    }
}
