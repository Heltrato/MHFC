// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.heltrato.mhfc.entity.client.model;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.entity.herbivore.PopoEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

@OnlyIn(Dist.CLIENT)
public class PopoModel extends AnimatedEntityModel<PopoEntity> {

    final AnimatedModelRenderer root;
    final AnimatedModelRenderer body;
    final AnimatedModelRenderer head;
    final AnimatedModelRenderer nose;
    final AnimatedModelRenderer mane;
    final AnimatedModelRenderer jaw;
    final AnimatedModelRenderer tusk1;
    final AnimatedModelRenderer tusk3;
    final AnimatedModelRenderer tusk5;
    final AnimatedModelRenderer tusk2;
    final AnimatedModelRenderer tusk4;
    final AnimatedModelRenderer tusk6;
    final AnimatedModelRenderer chest;
    final AnimatedModelRenderer leg3;
    final AnimatedModelRenderer lowerleg3;
    final AnimatedModelRenderer leg4;
    final AnimatedModelRenderer lowerleg4;
    final AnimatedModelRenderer body2;
    final AnimatedModelRenderer body3;
    final AnimatedModelRenderer tailsegment1;
    final AnimatedModelRenderer tailsegment2;
    final AnimatedModelRenderer tailsegment3;
    final AnimatedModelRenderer leg1;
    final AnimatedModelRenderer lowerleg1;
    final AnimatedModelRenderer leg2;
    final AnimatedModelRenderer lowerleg2;

    public PopoModel()
    {
        textureWidth = 256;
        textureHeight = 256;
        root = new AnimatedModelRenderer(this);
        root.setRotationPoint(0.0F, 24.0F, 0.0F);

        root.setModelRendererName("root");
        this.registerModelRenderer(root);

        body = new AnimatedModelRenderer(this);
        body.setRotationPoint(0.0F, -21.7238F, 0.0005F);
        root.addChild(body);
        setRotationAngle(body, 1.5359F, 0.0F, 0.0F);
        body.setTextureOffset(75, 108).addBox(-7.0F, -8.0122F, -8.6502F, 14.0F, 16.0F, 18.0F, 0.004F, false);
        body.setModelRendererName("body");
        this.registerModelRenderer(body);

        head = new AnimatedModelRenderer(this);
        head.setRotationPoint(1.0F, -8.0496F, -3.3369F);
        body.addChild(head);
        setRotationAngle(head, -1.0821F, 0.0F, 0.0F);
        head.setTextureOffset(157, 107).addBox(-6.0F, -7.0F, -6.0F, 10.0F, 10.0F, 11.0F, 0.0F, false);
        head.setModelRendererName("head");
        this.registerModelRenderer(head);

        nose = new AnimatedModelRenderer(this);
        nose.setRotationPoint(-1.0F, -4.6609F, -7.5142F);
        head.addChild(nose);
        setRotationAngle(nose, -0.6109F, 0.0F, 0.0F);
        nose.setTextureOffset(40, 62).addBox(-4.0F, -6.103F, -0.6498F, 8.0F, 10.0F, 5.0F, 0.001F, false);
        nose.setModelRendererName("nose");
        this.registerModelRenderer(nose);

        mane = new AnimatedModelRenderer(this);
        mane.setRotationPoint(-1.0F, -8.8848F, 6.6443F);
        head.addChild(mane);
        mane.setTextureOffset(14, 5).addBox(-4.0F, -1.2326F, -12.9079F, 8.0F, 3.0F, 14.0F, 0.0F, false);
        mane.setModelRendererName("mane");
        this.registerModelRenderer(mane);

        jaw = new AnimatedModelRenderer(this);
        jaw.setRotationPoint(-1.0F, 3.5836F, -0.4058F);
        head.addChild(jaw);
        setRotationAngle(jaw, 1.3963F, 0.0F, 0.0F);
        jaw.setTextureOffset(84, 71).addBox(-4.0F, -10.4855F, -2.2239F, 8.0F, 11.0F, 6.0F, 0.0F, false);
        jaw.setModelRendererName("jaw");
        this.registerModelRenderer(jaw);

        tusk1 = new AnimatedModelRenderer(this);
        tusk1.setRotationPoint(2.5F, -6.9166F, -0.3266F);
        jaw.addChild(tusk1);
        setRotationAngle(tusk1, -0.0847F, 0.096F, 0.2345F);
        tusk1.setTextureOffset(47, 111).addBox(-1.5F, -13.0F, -1.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);
        tusk1.setModelRendererName("tusk1");
        this.registerModelRenderer(tusk1);

        tusk3 = new AnimatedModelRenderer(this);
        tusk3.setRotationPoint(0.021F, -11.214F, -0.5746F);
        tusk1.addChild(tusk3);
        setRotationAngle(tusk3, -1.3526F, 0.0F, 0.0F);
        tusk3.setTextureOffset(16, 94).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 3.0F, 0.0F, false);
        tusk3.setModelRendererName("tusk3");
        this.registerModelRenderer(tusk3);

        tusk5 = new AnimatedModelRenderer(this);
        tusk5.setRotationPoint(0.0468F, -9.7419F, -0.953F);
        tusk3.addChild(tusk5);
        setRotationAngle(tusk5, -0.6807F, -0.0087F, 0.0F);
        tusk5.setTextureOffset(33, 95).addBox(-1.0885F, -9.7678F, -1.3862F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        tusk5.setModelRendererName("tusk5");
        this.registerModelRenderer(tusk5);

        tusk2 = new AnimatedModelRenderer(this);
        tusk2.setRotationPoint(0.4F, 5.5555F, -3.8822F);
        jaw.addChild(tusk2);
        setRotationAngle(tusk2, -0.0847F, -0.096F, -0.2345F);
        tusk2.setTextureOffset(27, 111).addBox(-1.3418F, -25.0933F, 1.2593F, 3.0F, 13.0F, 3.0F, 0.0F, false);
        tusk2.setModelRendererName("tusk2");
        this.registerModelRenderer(tusk2);

        tusk4 = new AnimatedModelRenderer(this);
        tusk4.setRotationPoint(1.1661F, -16.2363F, -1.4984F);
        tusk2.addChild(tusk4);
        setRotationAngle(tusk4, -1.3526F, 0.0F, 0.0F);
        tusk4.setTextureOffset(47, 94).addBox(-1.8876F, -17.3805F, -7.0642F, 2.0F, 12.0F, 3.0F, 0.0F, false);
        tusk4.setModelRendererName("tusk4");
        this.registerModelRenderer(tusk4);

        tusk6 = new AnimatedModelRenderer(this);
        tusk6.setRotationPoint(-0.5973F, -17.5426F, -8.6564F);
        tusk4.addChild(tusk6);
        setRotationAngle(tusk6, -0.6807F, 0.0087F, 0.0F);
        tusk6.setTextureOffset(2, 95).addBox(-1.3225F, -8.8657F, 1.3524F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        tusk6.setModelRendererName("tusk6");
        this.registerModelRenderer(tusk6);

        chest = new AnimatedModelRenderer(this);
        chest.setRotationPoint(0.0F, 17.1181F, 1.0717F);
        body.addChild(chest);
        setRotationAngle(chest, 1.7773F, 0.0F, 0.0F);
        chest.setTextureOffset(66, 14).addBox(-4.0F, -9.2071F, 3.1959F, 8.0F, 7.0F, 23.0F, 0.0F, false);
        chest.setModelRendererName("chest");
        this.registerModelRenderer(chest);

        leg3 = new AnimatedModelRenderer(this);
        leg3.setRotationPoint(7.0F, -1.0355F, -3.2324F);
        body.addChild(leg3);
        setRotationAngle(leg3, -1.213F, 0.0F, 0.0F);
        leg3.setTextureOffset(36, 167).addBox(0.0F, -7.9343F, -3.152F, 6.0F, 13.0F, 8.0F, 0.0F, false);
        leg3.setModelRendererName("leg3");
        this.registerModelRenderer(leg3);

        lowerleg3 = new AnimatedModelRenderer(this);
        lowerleg3.setRotationPoint(2.0F, 2.9373F, -0.5967F);
        leg3.addChild(lowerleg3);
        setRotationAngle(lowerleg3, -0.5149F, 0.0F, 0.0F);
        lowerleg3.setTextureOffset(36, 200).addBox(-2.3F, -2.094F, -2.4381F, 6.0F, 18.0F, 7.0F, 0.0F, false);
        lowerleg3.setModelRendererName("lowerleg3");
        this.registerModelRenderer(lowerleg3);

        leg4 = new AnimatedModelRenderer(this);
        leg4.setRotationPoint(-6.7F, -1.1389F, -3.136F);
        body.addChild(leg4);
        setRotationAngle(leg4, -1.2566F, 0.0F, 0.0F);
        leg4.setTextureOffset(5, 167).addBox(-6.0F, -6.2705F, -3.3741F, 6.0F, 13.0F, 8.0F, 0.0F, false);
        leg4.setModelRendererName("leg4");
        this.registerModelRenderer(leg4);

        lowerleg4 = new AnimatedModelRenderer(this);
        lowerleg4.setRotationPoint(-3.0F, 2.0F, 0.0F);
        leg4.addChild(lowerleg4);
        setRotationAngle(lowerleg4, -0.4102F, 0.0F, 0.0F);
        lowerleg4.setTextureOffset(6, 200).addBox(-3.0F, -0.6F, -2.1541F, 6.0F, 18.0F, 7.0F, 0.0F, false);
        lowerleg4.setModelRendererName("lowerleg4");
        this.registerModelRenderer(lowerleg4);

        body2 = new AnimatedModelRenderer(this);
        body2.setRotationPoint(0.0F, -23.0F, 7.0F);
        root.addChild(body2);
        setRotationAngle(body2, 1.4486F, 0.0F, 0.0F);
        body2.setTextureOffset(141, 65).addBox(-6.5F, 0.0894F, -8.811F, 13.0F, 11.0F, 16.0F, 0.0F, false);
        body2.setModelRendererName("body2");
        this.registerModelRenderer(body2);

        body3 = new AnimatedModelRenderer(this);
        body3.setRotationPoint(0.0F, 12.209F, 1.0626F);
        body2.addChild(body3);
        setRotationAngle(body3, -1.7395F, 0.0F, 0.0F);
        body3.setTextureOffset(155, 38).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 11.0F, 5.0F, 0.0F, false);
        body3.setModelRendererName("body3");
        this.registerModelRenderer(body3);

        tailsegment1 = new AnimatedModelRenderer(this);
        tailsegment1.setRotationPoint(0.0F, -1.308F, -1.0118F);
        body3.addChild(tailsegment1);
        setRotationAngle(tailsegment1, -0.2909F, 0.0F, 0.0F);
        tailsegment1.setTextureOffset(7, 69).addBox(-3.0F, -3.35F, 1.2163F, 6.0F, 7.0F, 6.0F, 0.04F, false);
        tailsegment1.setModelRendererName("tailsegment1");
        this.registerModelRenderer(tailsegment1);

        tailsegment2 = new AnimatedModelRenderer(this);
        tailsegment2.setRotationPoint(0.0F, -0.7871F, 5.769F);
        tailsegment1.addChild(tailsegment2);
        setRotationAngle(tailsegment2, 0.0145F, 0.0F, 0.0F);
        tailsegment2.setTextureOffset(7, 43).addBox(-3.0F, -1.6749F, 0.6976F, 6.0F, 4.0F, 5.0F, 0.02F, false);
        tailsegment2.setModelRendererName("tailsegment2");
        this.registerModelRenderer(tailsegment2);

        tailsegment3 = new AnimatedModelRenderer(this);
        tailsegment3.setRotationPoint(0.0F, 1.0651F, 5.4811F);
        tailsegment2.addChild(tailsegment3);
        setRotationAngle(tailsegment3, 0.0407F, 0.0F, 0.0F);
        tailsegment3.setTextureOffset(135, 21).addBox(-3.0F, -2.1035F, -1.0429F, 6.0F, 2.0F, 5.0F, 0.0F, false);
        tailsegment3.setModelRendererName("tailsegment3");
        this.registerModelRenderer(tailsegment3);

        leg1 = new AnimatedModelRenderer(this);
        leg1.setRotationPoint(6.0F, 8.0704F, -0.3506F);
        body2.addChild(leg1);
        setRotationAngle(leg1, -1.9635F, 0.0F, 0.0F);
        leg1.setTextureOffset(2, 139).addBox(0.4F, -0.4297F, -4.3199F, 6.0F, 12.0F, 8.0F, 0.0F, false);
        leg1.setModelRendererName("leg1");
        this.registerModelRenderer(leg1);

        lowerleg1 = new AnimatedModelRenderer(this);
        lowerleg1.setRotationPoint(3.0F, 7.034F, 0.0998F);
        leg1.addChild(lowerleg1);
        setRotationAngle(lowerleg1, 0.5498F, 0.0F, 0.0F);
        lowerleg1.setTextureOffset(6, 228).addBox(-3.0F, -0.4352F, -2.6827F, 6.0F, 16.0F, 6.0F, 0.0F, false);
        lowerleg1.setModelRendererName("lowerleg1");
        this.registerModelRenderer(lowerleg1);

        leg2 = new AnimatedModelRenderer(this);
        leg2.setRotationPoint(-7.0F, 6.9996F, -1.778F);
        body2.addChild(leg2);
        setRotationAngle(leg2, -1.8762F, 0.0F, 0.0F);
        leg2.setTextureOffset(36, 138).addBox(-5.0F, -2.4209F, -3.7303F, 6.0F, 12.0F, 8.0F, 0.0F, false);
        leg2.setModelRendererName("leg2");
        this.registerModelRenderer(leg2);

        lowerleg2 = new AnimatedModelRenderer(this);
        lowerleg2.setRotationPoint(-2.0F, 6.1069F, 0.4497F);
        leg2.addChild(lowerleg2);
        setRotationAngle(lowerleg2, 0.4974F, 0.0F, 0.0F);
        lowerleg2.setTextureOffset(35, 228).addBox(-2.8F, -1.1658F, -2.9935F, 6.0F, 16.0F, 6.0F, 0.0F, false);
        lowerleg2.setModelRendererName("lowerleg2");
        this.registerModelRenderer(lowerleg2);

        this.rootBones.add(root);
    }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation(MainMH.MODID, "animation/popo.json");
    }
}