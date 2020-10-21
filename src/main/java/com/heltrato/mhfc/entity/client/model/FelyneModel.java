package com.heltrato.mhfc.entity.client.model;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.entity.companion.FelyneEntity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

@OnlyIn(Dist.CLIENT)
public class FelyneModel extends AnimatedEntityModel<FelyneEntity> {

	final AnimatedModelRenderer body;
	final AnimatedModelRenderer head;
	final AnimatedModelRenderer head2;
	final AnimatedModelRenderer head3;
	final AnimatedModelRenderer head4;
	final AnimatedModelRenderer head5;
	final AnimatedModelRenderer head6;
	final AnimatedModelRenderer larm;
	final AnimatedModelRenderer rarm;
	final AnimatedModelRenderer tail1;
	final AnimatedModelRenderer tail2;
	final AnimatedModelRenderer tail3;
	final AnimatedModelRenderer lleg1;
	final AnimatedModelRenderer lleg2;
	final AnimatedModelRenderer lleg3;
	final AnimatedModelRenderer rleg1;
	final AnimatedModelRenderer rleg2;
	final AnimatedModelRenderer rleg3;

	public FelyneModel() {
		textureWidth = 32;
		textureHeight = 32;
		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 17.0F, 1.75F);
		setRotationAngle(body, 0.299F, 0.0F, 0.0F);
		body.setTextureOffset(16, 0).addBox(-1.5F, -3.9113F, -1.9109F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, -3.2786F, -0.3495F);
		body.addChild(head);
		setRotationAngle(head, -0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		head2 = new AnimatedModelRenderer(this);
		head2.setRotationPoint(0.0F, -1.1673F, -1.7359F);
		head.addChild(head2);
		head2.setTextureOffset(0, 20).addBox(-1.0F, -1.2623F, -1.0026F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head2.setModelRendererName("head2");
		this.registerModelRenderer(head2);

		head3 = new AnimatedModelRenderer(this);
		head3.setRotationPoint(-1.65F, -3.5452F, 0.835F);
		head.addChild(head3);
		head3.setTextureOffset(18, 15).addBox(-0.3F, -1.1655F, -0.8573F, 1.0F, 1.0F, 2.0F, 0.01F, false);
		head3.setModelRendererName("head3");
		this.registerModelRenderer(head3);

		head4 = new AnimatedModelRenderer(this);
		head4.setRotationPoint(0.25F, -0.6618F, 0.411F);
		head3.addChild(head4);
		head4.setTextureOffset(16, 25).addBox(-0.53F, -2.2341F, -0.375F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head4.setModelRendererName("head4");
		this.registerModelRenderer(head4);

		head5 = new AnimatedModelRenderer(this);
		head5.setRotationPoint(1.2F, -3.5452F, 0.835F);
		head.addChild(head5);
		head5.setTextureOffset(12, 15).addBox(-0.25F, -1.1655F, -0.8573F, 1.0F, 1.0F, 2.0F, 0.01F, false);
		head5.setModelRendererName("head5");
		this.registerModelRenderer(head5);

		head6 = new AnimatedModelRenderer(this);
		head6.setRotationPoint(0.25F, -0.6618F, 0.411F);
		head5.addChild(head6);
		head6.setTextureOffset(12, 25).addBox(-0.5F, -2.2341F, -0.375F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head6.setModelRendererName("head6");
		this.registerModelRenderer(head6);

		larm = new AnimatedModelRenderer(this);
		larm.setRotationPoint(1.5F, -3.0662F, -0.6394F);
		body.addChild(larm);
		setRotationAngle(larm, -0.6109F, -0.3054F, 0.0F);
		larm.setTextureOffset(10, 20).addBox(0.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		larm.setModelRendererName("larm");
		this.registerModelRenderer(larm);

		rarm = new AnimatedModelRenderer(this);
		rarm.setRotationPoint(-1.5F, -3.0662F, -0.6394F);
		body.addChild(rarm);
		setRotationAngle(rarm, -0.6109F, 0.3054F, 0.0F);
		rarm.setTextureOffset(6, 20).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rarm.setModelRendererName("rarm");
		this.registerModelRenderer(rarm);

		tail1 = new AnimatedModelRenderer(this);
		tail1.setRotationPoint(0.5F, 2.0405F, 0.6791F);
		body.addChild(tail1);
		setRotationAngle(tail1, 0.3054F, 0.0F, 0.0F);
		tail1.setTextureOffset(22, 9).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.002F, false);
		tail1.setModelRendererName("tail1");
		this.registerModelRenderer(tail1);

		tail2 = new AnimatedModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.3402F, 3.6072F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, 1.4399F, 0.0F, 0.0F);
		tail2.setTextureOffset(12, 9).addBox(-1.0F, -0.4572F, -0.3116F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		tail2.setModelRendererName("tail2");
		this.registerModelRenderer(tail2);

		tail3 = new AnimatedModelRenderer(this);
		tail3.setRotationPoint(-0.5F, -0.5904F, 3.615F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 1.5708F, 0.0F, 0.0F);
		tail3.setTextureOffset(0, 9).addBox(-0.5F, 0.0551F, -5.113F, 1.0F, 1.0F, 5.0F, 0.001F, false);
		tail3.setModelRendererName("tail3");
		this.registerModelRenderer(tail3);

		lleg1 = new AnimatedModelRenderer(this);
		lleg1.setRotationPoint(1.6F, 17.8825F, 1.0478F);
		setRotationAngle(lleg1, -0.3924F, -0.0403F, -0.0167F);
		lleg1.setTextureOffset(6, 15).addBox(-0.5F, -0.4675F, -0.616F, 1.0F, 3.0F, 2.0F, 0.003F, false);
		lleg1.setModelRendererName("lleg1");
		this.registerModelRenderer(lleg1);

		lleg2 = new AnimatedModelRenderer(this);
		lleg2.setRotationPoint(-0.0659F, 2.0683F, 0.4326F);
		lleg1.addChild(lleg2);
		setRotationAngle(lleg2, 1.2654F, 0.0F, 0.0F);
		lleg2.setTextureOffset(8, 25).addBox(-0.4244F, -0.8207F, -0.7628F, 1.0F, 3.0F, 1.0F, 0.001F, false);
		lleg2.setModelRendererName("lleg2");
		this.registerModelRenderer(lleg2);

		lleg3 = new AnimatedModelRenderer(this);
		lleg3.setRotationPoint(-0.6855F, 2.0581F, -0.5084F);
		lleg2.addChild(lleg3);
		setRotationAngle(lleg3, 1.6668F, -0.0349F, 0.0611F);
		lleg3.setTextureOffset(4, 25).addBox(0.2756F, -2.3107F, -1.0243F, 1.0F, 3.0F, 1.0F, 0.001F, false);
		lleg3.setModelRendererName("lleg3");
		this.registerModelRenderer(lleg3);

		rleg1 = new AnimatedModelRenderer(this);
		rleg1.setRotationPoint(-1.4F, 17.8825F, 1.0478F);
		setRotationAngle(rleg1, -0.3924F, 0.0436F, 0.0F);
		rleg1.setTextureOffset(0, 15).addBox(-0.5F, -0.4675F, -0.616F, 1.0F, 3.0F, 2.0F, 0.003F, false);
		rleg1.setModelRendererName("rleg1");
		this.registerModelRenderer(rleg1);

		rleg2 = new AnimatedModelRenderer(this);
		rleg2.setRotationPoint(-0.1341F, 2.0683F, 0.4326F);
		rleg1.addChild(rleg2);
		setRotationAngle(rleg2, 1.2654F, 0.0F, 0.0F);
		rleg2.setTextureOffset(0, 25).addBox(-0.3563F, -0.8207F, -0.7628F, 1.0F, 3.0F, 1.0F, 0.001F, false);
		rleg2.setModelRendererName("rleg2");
		this.registerModelRenderer(rleg2);

		rleg3 = new AnimatedModelRenderer(this);
		rleg3.setRotationPoint(0.1327F, 2.0581F, -0.5084F);
		rleg2.addChild(rleg3);
		setRotationAngle(rleg3, 1.6668F, -0.0349F, 0.0611F);
		rleg3.setTextureOffset(14, 20).addBox(-0.4986F, -2.3107F, -1.0244F, 1.0F, 3.0F, 1.0F, 0.001F, false);
		rleg3.setModelRendererName("rleg3");
		this.registerModelRenderer(rleg3);

		this.rootBones.add(body);
		this.rootBones.add(lleg1);
		this.rootBones.add(rleg1);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation(MainMH.MODID, "animation/felyne.json");
	}
	
	@Override
	public void setLivingAnimations(FelyneEntity entity, float limbSwing, float limbSwingAmount, float partialTick) {
		super.setLivingAnimations(entity, limbSwing, limbSwingAmount, partialTick);
		this.head.rotateAngleY = entity.getPitch(partialTick) * ((float)Math.PI/180F);
	}
	
}