package net.m1sha365.lichdom.client.renderer.block;

import net.m1sha365.lichdom.block.entity.FertilizerBlockEntity;
import net.m1sha365.lichdom.client.model.block.FertilizerModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

/**
 * Example {@link net.minecraft.world.level.block.entity.BlockEntity} renderer for {@link FertilizerBlockEntity}
 * @see FertilizerModel
 * @see FertilizerBlockEntity
 */
public class FertilizerBlockRenderer extends GeoBlockRenderer<FertilizerBlockEntity> {
	public FertilizerBlockRenderer() {
		super(new FertilizerModel());
	}
}
