package com.heltrato.mhfc.items.weapon;

import java.util.List;

import com.heltrato.mhfc.MainMH;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SwordItemMH extends SwordItem{
	
	float extraDamage;

	// This constructor is for weapons that doesnt deal critical damage
	public SwordItemMH(IItemTier tier, float attackSpeedIn, Rarity rarity) {
		this(tier, attackSpeedIn, 0, rarity);
	}
	
	// Parameters only measures upto attack speed
	public SwordItemMH(IItemTier tier, float attackSpeedIn, float extraDamage, Rarity raiRarity) {
		this(tier, 3, attackSpeedIn, extraDamage, raiRarity);
		
	}
	
	public SwordItemMH(IItemTier tier, int attackDamageIn,  float attackSpeedIn,  float extraDamage, Rarity rarity) {
		this(tier, attackDamageIn, attackSpeedIn, extraDamage, new Properties().maxStackSize(1).defaultMaxDamage(tier.getMaxUses()).rarity(rarity).group(MainMH.getItemGroup()));
	}
	
	public SwordItemMH(IItemTier tier, int attackDamageIn, float attackSpeedIn, float extraDamage, Item.Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		this.extraDamage = extraDamage;
	}
	
	@Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltips, ITooltipFlag flags) {
        super.addInformation(stack, world, tooltips, flags);
        tooltips.add(new TranslationTextComponent(getTranslationKey() + ".tooltip"));
    }

	
	//Some getters
	public float getExtraDamage() {
		return extraDamage;
	}

	public void setExtraDamage(float extraDamage) {
		this.extraDamage = extraDamage;
	}
}
