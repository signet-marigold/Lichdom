package net.m1sha365.lichdom.client.model.entity;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.entity.BatEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;

/**
 * Example {@link GeoModel} for the {@link BatEntity}
 * @see net.m1sha365.lichdom.client.renderer.entity.BatRenderer BatRenderer
 */
public class BatModel extends DefaultedEntityGeoModel<BatEntity> {
	// We use the alternate super-constructor here to tell the model it should handle head-turning for us
	public BatModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "bat"), true);
	}
}
