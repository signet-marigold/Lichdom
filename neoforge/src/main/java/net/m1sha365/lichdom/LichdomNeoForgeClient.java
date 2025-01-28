package net.m1sha365.lichdom;

import net.m1sha365.lichdom.client.LichdomClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = LichdomCommon.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public final class LichdomNeoForgeClient {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        LichdomClient.registerRenderers(event::registerEntityRenderer, event::registerBlockEntityRenderer);
    }
}
