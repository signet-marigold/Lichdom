package net.m1sha365.lichdom.client.renderer.armor;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.item.GeckoArmorItem;
import net.m1sha365.lichdom.item.WolfArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

/**
 * Example {@link GeoRenderer} for the {@link WolfArmorItem} example item
 */
public final class GeckoArmorRenderer extends GeoArmorRenderer<GeckoArmorItem> {
	public GeckoArmorRenderer() {
		super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "armor/gecko_armor")));

		addRenderLayer(new AutoGlowingGeoLayer<>(this));
	}
}
