package net.m1sha365.lichdom.client.model.block;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.GeckoHabitatBlockEntity;
import net.m1sha365.lichdom.client.renderer.block.GeckoHabitatBlockRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link GeckoHabitatBlockEntity}
 * @see GeckoHabitatBlockEntity
 * @see GeckoHabitatBlockRenderer
 */
public class GeckoHabitatModel extends DefaultedBlockGeoModel<GeckoHabitatBlockEntity> {
	public GeckoHabitatModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "gecko_habitat"));
	}

	@Override
	public RenderType getRenderType(GeckoHabitatBlockEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
