package net.m1sha365.lichdom.client.renderer.block;

import net.m1sha365.lichdom.block.entity.GeckoHabitatBlockEntity;
import net.m1sha365.lichdom.client.model.block.GeckoHabitatModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

/**
 * Example {@link net.minecraft.world.level.block.entity.BlockEntity BlockEntity} renderer for {@link GeckoHabitatBlockEntity}
 * @see GeckoHabitatModel
 * @see GeckoHabitatBlockEntity
 */
public class GeckoHabitatBlockRenderer extends GeoBlockRenderer<GeckoHabitatBlockEntity> {
	public GeckoHabitatBlockRenderer() {
		super(new GeckoHabitatModel());
	}
}
