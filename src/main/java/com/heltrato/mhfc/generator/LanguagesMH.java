package com.heltrato.mhfc.generator;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.blocks.BlocksMH;
import com.heltrato.mhfc.entity.EntitiesMH;
import com.heltrato.mhfc.gui.HunterProfile;
import com.heltrato.mhfc.items.ItemsMH;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguagesMH extends LanguageProvider {

	public LanguagesMH(DataGenerator arg) {
		super(arg, MainMH.MODID, "en_us");
	}

	/**
	 * Provides english language to ease more time.
	 */
	@Override
	public void addTranslations() {
		// Unique Translations
		this.add("itemGroup.groupMHFC", "Monster Hunter Tab");

		// Core translations
		BlocksMH.addBlockLanguage(this);
		ItemsMH.addItemLanguage(this);
		EntitiesMH.addEntityLanguage(this);
		HunterProfile.addScreenLanguage(this);
	}
}
