package net.m1sha365.lichdom.client.model.entity;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.entity.DynamicExampleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link DynamicExampleEntity}
 * @see net.m1sha365.lichdom.client.renderer.entity.GremlinRenderer GremlinRenderer
 */
public class GremlinModel extends DefaultedEntityGeoModel<DynamicExampleEntity> {
	public GremlinModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "gremlin"));
	}
}
