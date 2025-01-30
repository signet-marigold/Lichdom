package net.m1sha365.lichdom.client.model.block;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;
import org.jetbrains.annotations.Nullable;

public class PhylacteryModel extends DefaultedBlockGeoModel<PhylacteryBlockEntity> {
	private final ResourceLocation PHYLACTERY_MODEL = buildFormattedModelPath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));
	private final ResourceLocation PHYLACTERY_TEXTURE = buildFormattedTexturePath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));

	public PhylacteryModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));
	}

	@Override
	public ResourceLocation getModelResource(PhylacteryBlockEntity animatable, @Nullable GeoRenderer<PhylacteryBlockEntity> renderer) {
			return PHYLACTERY_MODEL;
	}

	@Override
	public ResourceLocation getTextureResource(PhylacteryBlockEntity animatable, @Nullable GeoRenderer<PhylacteryBlockEntity> renderer) {
			return PHYLACTERY_TEXTURE;
	}

	@Override
	public RenderType getRenderType(PhylacteryBlockEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
