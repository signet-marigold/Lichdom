package net.m1sha365.lichdom.client.model.block;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.FertilizerBlockEntity;
import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.m1sha365.lichdom.client.renderer.block.FertilizerBlockRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class PhylacteryModel extends DefaultedBlockGeoModel<PhylacteryBlockEntity> {
	private final ResourceLocation BOTARIUM_MODEL = buildFormattedModelPath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "botarium"));
	private final ResourceLocation BOTARIUM_TEXTURE = buildFormattedTexturePath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "botarium"));
	private final ResourceLocation BOTARIUM_ANIMATIONS = buildFormattedAnimationPath(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "botarium"));

	public PhylacteryModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "phylactery"));
	}

	/**
	 * Return the fertilizer animation path if it's raining, or the botarium animation path if not.
	 */
	@Override
	public ResourceLocation getAnimationResource(PhylacteryBlockEntity animatable) {
		if (animatable.getLevel().isRaining()) {
			return super.getAnimationResource(animatable);
		}
		else {
			return BOTARIUM_ANIMATIONS;
		}
	}

	/**
	 * Return the fertilizer model path if it's raining, or the botarium model path if not.
	 */
	@Override
	public ResourceLocation getModelResource(PhylacteryBlockEntity animatable, @Nullable GeoRenderer<PhylacteryBlockEntity> renderer) {
		if (animatable.getLevel().isRaining()) {
			return super.getModelResource(animatable, renderer);
		}
		else {
			return BOTARIUM_MODEL;
		}
	}

	/**
	 * Return the fertilizer texture path if it's raining, or the botarium texture path if not.
	 */
	@Override
	public ResourceLocation getTextureResource(PhylacteryBlockEntity animatable, @Nullable GeoRenderer<PhylacteryBlockEntity> renderer) {
		if (animatable.getLevel().isRaining()) {
			return super.getTextureResource(animatable, renderer);
		}
		else {
			return BOTARIUM_TEXTURE;
		}
	}

	@Override
	public RenderType getRenderType(PhylacteryBlockEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
