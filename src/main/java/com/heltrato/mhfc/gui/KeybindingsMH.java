package com.heltrato.mhfc.gui;


import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

public class KeybindingsMH {

    final static KeyBinding HUNTERPROFILEKEY = new KeyBinding("key.mhfc.hunterprofile", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_P, "key.categories.mhfc");

    public static void addKeyBindings(){
        ClientRegistry.registerKeyBinding(HUNTERPROFILEKEY);
    }

    public static KeyBinding getHunterprofilekey(){
        return KeybindingsMH.HUNTERPROFILEKEY;
    }
}
