package net.m1sha365.lichdom.client.renderer.entity;

import net.m1sha365.lichdom.client.model.entity.ParasiteModel;
import net.m1sha365.lichdom.entity.ParasiteEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

/**
 * Example {@link software.bernie.geckolib.renderer.GeoRenderer} implementation of an entity
 * @see ParasiteModel
 * @see ParasiteEntity
 */
public class ParasiteRenderer extends GeoEntityRenderer<ParasiteEntity> {
	public ParasiteRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ParasiteModel());
	}
}
