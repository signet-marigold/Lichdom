package net.m1sha365.lichdom.client.model.entity;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.client.renderer.entity.ParasiteRenderer;
import net.m1sha365.lichdom.entity.ParasiteEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link ParasiteEntity}
 * @see ParasiteRenderer
 */
public class ParasiteModel extends DefaultedEntityGeoModel<ParasiteEntity> {
	public ParasiteModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "parasite"));
	}

	// We want our model to render using the translucent render type
	@Override
	public RenderType getRenderType(ParasiteEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
