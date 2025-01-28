package net.m1sha365.lichdom.client.renderer.item;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.item.JackInTheBoxItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

/**
 * Example {@link software.bernie.geckolib.renderer.GeoItemRenderer} for {@link JackInTheBoxItem}
 */
public class JackInTheBoxRenderer extends GeoItemRenderer<JackInTheBoxItem> {
	public JackInTheBoxRenderer() {
		super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "jack_in_the_box")));
	}
}
