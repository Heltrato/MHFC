package com.heltrato.mhfc.gui;

import com.google.common.collect.Lists;
import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.generator.LanguagesMH;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.*;

public class HunterProfile extends Screen{

	public final static ResourceLocation HUNTERPROFILETEX = new ResourceLocation(MainMH.MODID, "textures/gui/hunterprofile.png");
	final int GUIWIDTH = 256, GUIHEIGHT = 255;
	int CENTERX, CENTERY;
	float oldp_render_1_ = 0, oldp_render_2_ = 0;
	int playerRank = 0; //TODO test
	final static String NAME = "gui.mhc.tooltip.name",HUNTERRANK = "gui.mhc.tooltip.hunterRank", HEALTH = "gui.mhc.tooltip.health", STAMINA = "gui.mhc.tooltip.stamina", ATTACK = "gui.mhc.tooltip.attack", AFFINITY = "gui.mhc.tooltip.affinity", HELMET = "gui.mhc.tooltip.helmet",
	CHEST = "gui.mhc.tooltip.chest", LEGS = "gui.mhc.tooltip.legs", BOOTS ="gui.mhc.tooltip.boots" ;


	public HunterProfile(ITextComponent titleIn) {
		super(titleIn);
		
	}


	@Override
	protected void init() {
		super.init();
		CENTERX = Math.subtractExact(this.width/2, this.GUIWIDTH/2);
		CENTERY = Math.subtractExact(this.height/2, this.GUIHEIGHT/2);
	}

	@Override
	public boolean isPauseScreen() {
		return false;
	}

	@Override
	public void render(MatrixStack matrixStack, int p_render_1_, int p_render_2_, float p_render_3_) {
		this.renderBackground(matrixStack);
		RenderSystem.pushMatrix();{
			RenderSystem.enableAlphaTest();
			RenderSystem.enableBlend();
			RenderSystem.enableRescaleNormal();
			RenderSystem.color4f(1,1,1,1);
			getMinecraft().textureManager.bind(HUNTERPROFILETEX);
			this.blit(matrixStack, CENTERX,CENTERY,0,0,GUIWIDTH,GUIHEIGHT);
			int i = 59, j = 135;
			renderEntityOnScreen(CENTERX + i,  CENTERY + j, 45, (float)(this.CENTERX + i) - this.oldp_render_1_, (float)(this.CENTERY + j - 50) - this.oldp_render_2_, getMinecraft().player);
			// Draws tool tip
			List<IReorderingProcessor> name = Lists.newArrayList();
			List<IReorderingProcessor> hunterRank = Lists.newArrayList();
			List<IReorderingProcessor> health = Lists.newArrayList();
			List<IReorderingProcessor> stamina = Lists.newArrayList();
			List<IReorderingProcessor> attack = Lists.newArrayList();
			List<IReorderingProcessor> affinity = Lists.newArrayList();

			List<IReorderingProcessor> helmet = Lists.newArrayList();
			List<IReorderingProcessor> chest = Lists.newArrayList();
			List<IReorderingProcessor> legs = Lists.newArrayList();
			List<IReorderingProcessor> boots = Lists.newArrayList();

			Style style = Style.EMPTY.withBold(true);


			name.add(IReorderingProcessor.forward(I18n.get(NAME), style));
			hunterRank.add(IReorderingProcessor.forward(I18n.get(HUNTERRANK), style));
			health.add(IReorderingProcessor.forward(I18n.get(I18n.get(HEALTH)), style));
			stamina.add(IReorderingProcessor.forward(I18n.get(I18n.get(STAMINA)), style));
			attack.add(IReorderingProcessor.forward(I18n.get(I18n.get(ATTACK)), style));
			affinity.add(IReorderingProcessor.forward(I18n.get(I18n.get(AFFINITY)), style));
			helmet.add(IReorderingProcessor.forward(I18n.get(I18n.get(HELMET)), style));
			chest.add(IReorderingProcessor.forward(I18n.get(I18n.get(CHEST)), style));
			legs.add(IReorderingProcessor.forward(I18n.get(I18n.get(LEGS)), style));
			boots.add(IReorderingProcessor.forward(I18n.get(I18n.get(BOOTS)), style));

			renderProfileFonts(matrixStack,p_render_1_, p_render_2_);
			drawTooltip(matrixStack, name, p_render_1_, p_render_2_, this.CENTERX  + 115, this.CENTERY + 35, 135 ,  23);
			drawTooltip(matrixStack,hunterRank, p_render_1_, p_render_2_, this.CENTERX + 115, this.CENTERY + 63, 135 , 23);
			drawTooltip(matrixStack,health, p_render_1_, p_render_2_, this.CENTERX + 115, this.CENTERY + 90, 135 ,  23);
			drawTooltip(matrixStack,stamina, p_render_1_, p_render_2_, this.CENTERX + 115, this.CENTERY + 117, 135 , 23);
			drawTooltip(matrixStack,attack, p_render_1_, p_render_2_, this.CENTERX + 115, this.CENTERY + 144, 135 ,  23);
			drawTooltip(matrixStack,affinity, p_render_1_, p_render_2_, this.CENTERX + 115, this.CENTERY + 172, 135 , 23);


			drawTooltip(matrixStack,helmet, p_render_1_, p_render_2_, this.CENTERX + 28, this.CENTERY + 166, 78 , 15);
			drawTooltip(matrixStack,chest, p_render_1_, p_render_2_, this.CENTERX + 28, this.CENTERY + 184, 78 ,  15);
			drawTooltip(matrixStack,legs, p_render_1_, p_render_2_, this.CENTERX + 28, this.CENTERY + 202, 78,  15);
			drawTooltip(matrixStack,boots, p_render_1_, p_render_2_, this.CENTERX + 28, this.CENTERY + 220, 78, 15);
		}
		RenderSystem.popMatrix();
		this.oldp_render_1_ = (float) p_render_1_;
		this.oldp_render_2_ = (float) p_render_2_;
		super.render(matrixStack,p_render_1_,p_render_2_,p_render_3_);

	}

	static void renderEntityOnScreen(int posX, int posY, int scale, float p_render_1_, float p_render_2_, LivingEntity ent){
		RenderSystem.enableColorMaterial();
		RenderSystem.pushMatrix();
		RenderSystem.translatef((float)posX, (float)posY, 50.0F);
		RenderSystem.scalef((float)(-scale), (float) scale, (float) scale);
		RenderSystem.rotatef(180.0F,0.0F,0.0F,1.0F);
		float f = ent.yBodyRot;
		float f1 = ent.yRot;
		float f2 = ent.xRot;
		float f3 = ent.yHeadRotO;
		float f4 = ent.yHeadRot;
		RenderSystem.rotatef(135F,0F,1F,0F);
		RenderHelper.turnBackOn();
		RenderSystem.rotatef(-135.0F, 0.0F, 1.0F, 0.0F);
		RenderSystem.rotatef(-((float) Math.atan(p_render_2_ / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
		ent.yBodyRot = (float) Math.atan(p_render_1_ / 40.0F) * 20.0F;
		ent.yRot = (float) Math.atan(p_render_1_ / 40.0F) * 40.0F;
		ent.xRot = -((float) Math.atan(p_render_2_ / 40.0F)) * 20.0F;
		ent.yHeadRot = ent.yRot;
		ent.yHeadRotO = ent.yRot;
		RenderSystem.translatef(0.0F, 0.0F, 0.0F);
		EntityRendererManager rendererManager = Minecraft.getInstance().getEntityRenderDispatcher();
			//just a test of setPlayerViewY
		Quaternion quaternion = Vector3f.YP.rotationDegrees(180.0F);
		rendererManager.overrideCameraOrientation(quaternion);
		rendererManager.setRenderShadow(false);
		IRenderTypeBuffer.Impl iRenderTypeBuffer = Minecraft.getInstance().renderBuffers().bufferSource();
		MatrixStack matrixStack = new MatrixStack();
		rendererManager.render(ent,0.0D,0.0D,0.0D,0.0F,1.0F,matrixStack,iRenderTypeBuffer,15728880);
		iRenderTypeBuffer.endBatch();
		rendererManager.setRenderShadow(true);
		ent.yBodyRot = f;
		ent.yRot = f1;
		ent.xRot = f2;
		ent.yHeadRotO = f3;
		ent.yHeadRot = 4;
		RenderSystem.popMatrix();
		RenderHelper.turnOff();
		RenderSystem.disableRescaleNormal();
	}

	void drawTooltip(MatrixStack matrixStack, List<? extends IReorderingProcessor> lines, int p_render_1_, int p_render_2_, int coordX, int coordY, int width, int height){
		if(p_render_1_ < (coordX + width) && p_render_1_ > coordX && p_render_2_ < (coordY + height) && p_render_2_ > coordY){
			this.renderTooltip(matrixStack, lines, p_render_1_, p_render_2_);
		}
	}

	void renderProfileFonts(MatrixStack matrixStack,int p_render_1_, int p_render_2_) {
		PlayerEntity playerEntity = getMinecraft().player;
		RenderSystem.pushMatrix();
		this.font.draw(matrixStack,"S T A T U S", CENTERX + 157,  CENTERY + 21, cyan.getRGB());
		this.font.draw(matrixStack,"E Q U I P M E N T", this.CENTERX + 20, this.CENTERY + 21, cyan.getRGB());
		// Render Player name state.
		this.font.draw(matrixStack,"Name: ", this.CENTERX + 143, this.CENTERY + 44, white.getRGB());
		this.font.draw(matrixStack,"Hunter Rank: ", this.CENTERX + 143, this.CENTERY + 71, white.getRGB());
		this.font.draw(matrixStack,"Health: ", this.CENTERX + 143, this.CENTERY + 98, white.getRGB());
		this.font.draw(matrixStack,"Stamina: ", this.CENTERX + 143, this.CENTERY + 125, white.getRGB());
		this.font.draw(matrixStack,"Attack: ", this.CENTERX + 143, this.CENTERY + 152, white.getRGB());
		this.font.draw(matrixStack,"Affinity: ", this.CENTERX + 143, this.CENTERY + 180, white.getRGB());

		this.font.draw(matrixStack,playerEntity.getName().getString(), this.CENTERX + 171, this.CENTERY + 44, yellow.getRGB());
		this.font.draw(matrixStack," " + playerRank, this.CENTERX + 208, this.CENTERY + 71, yellow.getRGB());

		String playerHealth = Float.toString(Math.round(playerEntity.getMaxHealth()));
		font.draw(matrixStack,playerHealth, this.CENTERX + 180, this.CENTERY + 98.5f, yellow.getRGB());
		// test only
		String playerStamina = Float.toString(Math.round(playerEntity.getMaxHealth() * 5));
		font.draw(matrixStack,playerStamina, this.CENTERX + 183, this.CENTERY + 125.5f, yellow.getRGB());


		// Renders the player wearing equipment slots TODO: include MHC weapons
		List<ItemStack> equip = (List<ItemStack>) playerEntity.getArmorSlots();
		for (int e = 0; e < 4; e++) {
			if (!equip.get(e).isEmpty()) {
				font.draw(matrixStack,equip.get(e).getDisplayName().getString(), this.CENTERX + 28, this.CENTERY + 222 - e * 18, cyan.getRGB());
			} else {
				font.draw(matrixStack,"No Equipment ", this.CENTERX + 28, this.CENTERY + 222 - e * 18, cyan.getRGB());
			}
		}
		RenderSystem.popMatrix();
	}

	public final static void addScreenLanguage(final LanguagesMH arg){
		arg.add(NAME, "Name");
		arg.add(HUNTERRANK, "Hunter's Rank");
		arg.add(HEALTH, "Health");
		arg.add(ATTACK, "Attack Damage");
		arg.add(AFFINITY, "Affinity");
		arg.add(STAMINA, "Stamina");
		arg.add(HELMET, "Helmet Slot");
		arg.add(CHEST, "Chestplate Slot");
		arg.add(LEGS, "Leggings Slot");
		arg.add(BOOTS, "Boots Slot");

	}
}
