package net.m1sha365.lichdom;

import net.m1sha365.lichdom.client.LichdomClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public final class LichdomFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LichdomClient.registerRenderers(EntityRendererRegistry::register, BlockEntityRenderers::register);
    }
}
