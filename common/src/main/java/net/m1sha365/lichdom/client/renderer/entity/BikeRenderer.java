package net.m1sha365.lichdom.client.renderer.entity;

import net.m1sha365.lichdom.client.model.entity.BikeModel;
import net.m1sha365.lichdom.entity.BikeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * Example {@link software.bernie.geckolib.renderer.GeoRenderer} for {@link BikeEntity}
 * @see BikeModel
 */
public class BikeRenderer extends GeoEntityRenderer<BikeEntity> {
	public BikeRenderer(EntityRendererProvider.Context context) {
		super(context, new BikeModel());
	}
}
