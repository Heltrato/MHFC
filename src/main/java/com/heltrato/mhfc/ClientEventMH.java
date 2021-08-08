package com.heltrato.mhfc;


import com.heltrato.mhfc.gui.HunterProfile;
import com.heltrato.mhfc.gui.KeybindingsMH;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = MainMH.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class
ClientEventMH {

    @SubscribeEvent
    public static void setKeybindEvent(final TickEvent.ClientTickEvent arg){
        Minecraft minecraft = Minecraft.getInstance();
            while (KeybindingsMH.getHunterprofilekey().isDown()){
                if(minecraft.screen == null){
                    Style style = Style.EMPTY;
                    ITextComponent textComponent = new StringTextComponent("mhfc.hunterprofiledisplay").setStyle((style.withColor(Color.fromLegacyFormat(TextFormatting.BLUE)).withBold(true)));
                    minecraft.setScreen(new HunterProfile(textComponent));
                    MainMH.log.debug("Hunter Profile is being activated.");
                }
            }

    }
}
