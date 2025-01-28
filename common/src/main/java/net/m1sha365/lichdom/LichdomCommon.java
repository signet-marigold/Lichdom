package net.m1sha365.lichdom;

import net.m1sha365.lichdom.platform.LichdomPlatform;
import net.m1sha365.lichdom.registry.*;

import java.util.ServiceLoader;

/**
 * Base multiloader class for the mod, handling all the common distribution tasks and holding common values
 */
public final class LichdomCommon {
    public static final String MODID = "lichdom";

    public static final LichdomPlatform COMMON_PLATFORM = ServiceLoader.load(LichdomPlatform.class).findFirst().orElseThrow();

    public static void doRegistrations() {
        SoundRegistry.init();
        BlockRegistry.init();
        BlockEntityRegistry.init();
        EntityRegistry.init();
        ArmorMaterialRegistry.init();
        ItemRegistry.init();
    }
}
