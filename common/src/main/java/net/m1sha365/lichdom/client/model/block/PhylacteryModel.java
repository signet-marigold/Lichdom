package net.m1sha365.lichdom.client.model.block;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class PhylacteryModel extends DefaultedBlockGeoModel<PhylacteryBlockEntity> {
	private final ResourceLocation PHYLACTERY_TEXTURE = buildFormattedTexturePath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));

	public PhylacteryModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));
	}

	public RenderType getRenderType(PhylacteryBlockEntity animatable) {
		return RenderType.entityTranslucent(PHYLACTERY_TEXTURE);
	}
}
