package net.m1sha365.lichdom.client.model.block;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.m1sha365.lichdom.client.renderer.block.PhylacteryBlockRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.model.GeoModel;

public class PhylacteryModel extends DefaultedBlockGeoModel<PhylacteryBlockEntity> {
	public PhylacteryModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));
	}

	@Override
	public RenderType getRenderType(PhylacteryBlockEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
