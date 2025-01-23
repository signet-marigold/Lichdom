package net.m1sha365.lichdom;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class LichdomClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBinding binding1 = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.lichdom.test_keybinding_1",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_P,
                "key.category.lichdom"
        ));

        KeyBinding stickyBinding1 = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding(
                "key.lichdom.test_keybinding_sticky_1",
                GLFW.GLFW_KEY_R,
                "key.category.lichdom",
                () -> true
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (binding1.wasPressed()) {
                //client.player.sendMessage(new Text.("Key 1 was pressed!"), false);
            }

            if (stickyBinding1.isPressed()) {
                //client.player.sendMessage(new LiteralText("Sticky Key was pressed!"), false);
            }
        });
    }
}
