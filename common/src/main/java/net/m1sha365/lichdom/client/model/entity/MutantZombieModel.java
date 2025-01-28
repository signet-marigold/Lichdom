package net.m1sha365.lichdom.client.model.entity;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.client.renderer.entity.MutantZombieRenderer;
import net.m1sha365.lichdom.entity.DynamicExampleEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link DynamicExampleEntity}
 * @see MutantZombieRenderer
 */
public class MutantZombieModel extends DefaultedEntityGeoModel<DynamicExampleEntity> {
	public MutantZombieModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "mutant_zombie"));
	}
}
