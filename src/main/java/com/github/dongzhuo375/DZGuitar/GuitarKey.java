package com.github.dongzhuo375.DZGuitar;

import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.glfw.GLFW;

public class GuitarKey {
    public static final Identifier SE = new Identifier("dzguitar:e");
    public static SoundEvent SEE = new SoundEvent(SE);
    public static final Identifier SB = new Identifier("dzguitar:b");
    public static SoundEvent SBE = new SoundEvent(SB);
    public static final Identifier SG = new Identifier("dzguitar:g");
    public static SoundEvent SGE = new SoundEvent(SG);
    public static final Identifier SD = new Identifier("dzguitar:d");
    public static SoundEvent SDE = new SoundEvent(SD);
    public static final Identifier SA = new Identifier("dzguitar:a");
    public static SoundEvent SAE = new SoundEvent(SA);
    public static final Identifier SE2 = new Identifier("dzguitar:e2");
    public static SoundEvent SE2E = new SoundEvent(SE2);
    private static final FabricKeyBinding e = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "e"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V,
                    "key.categories.playguitar").build();
    private static final FabricKeyBinding b = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "b"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_B,
                    "key.categories.playguitar").build();
    private static final FabricKeyBinding g = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "g"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_N,
                    "key.categories.playguitar").build();
    private static final FabricKeyBinding d = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "d"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_M,
                    "key.categories.playguitar").build();
    private static final FabricKeyBinding a = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "a"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_COMMA,
                    "key.categories.playguitar").build();
    private static final FabricKeyBinding e2 = FabricKeyBinding.Builder
            .create(new Identifier("dzguitar", "e2"), InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_PERIOD,
                    "key.categories.playguitar").build();
    public static void register() {
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SE, SEE);
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SB, SBE);
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SG, SGE);
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SD, SDE);
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SA, SAE);
        Registry.register(Registry.SOUND_EVENT, GuitarKey.SE2, SE2E);
        KeyBindingRegistry.INSTANCE.register(e);
        KeyBindingRegistry.INSTANCE.register(b);
        KeyBindingRegistry.INSTANCE.register(g);
        KeyBindingRegistry.INSTANCE.register(d);
        KeyBindingRegistry.INSTANCE.register(a);
        KeyBindingRegistry.INSTANCE.register(e2);
        ClientTickCallback.EVENT.register(GuitarKey::tick);
    }
    private static void tick(MinecraftClient client) {
        if (client.player != null) {
            String item = MinecraftClient.getInstance().player.getMainHandStack().toString();
            String item2 = MinecraftClient.getInstance().player.getOffHandStack().toString();
            if (item.endsWith("_dz_guitar") || item2.endsWith("_dz_guitar")) {
                if (e.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SEE,SoundCategory.PLAYERS, 1f,1f);
                }
                if (b.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SBE,SoundCategory.PLAYERS, 1f,1f);
                }
                if (g.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SGE,SoundCategory.PLAYERS, 1f,1f);
                }
                if (d.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SDE,SoundCategory.PLAYERS, 1f,1f);
                }
                if (a.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SAE,SoundCategory.PLAYERS, 1f,1f);
                }
                if (e2.isPressed()) {
                    client.player.playSound(
                            GuitarKey.SE2E,SoundCategory.PLAYERS, 1f,1f);
                }
            }
        }
    }
}

