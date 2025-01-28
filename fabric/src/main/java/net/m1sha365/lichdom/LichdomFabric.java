package net.m1sha365.lichdom;

import net.m1sha365.lichdom.registry.EntityRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public final class LichdomFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LichdomCommon.doRegistrations();
        EntityRegistry.registerEntityAttributes(FabricDefaultAttributeRegistry::register);
    }
}
