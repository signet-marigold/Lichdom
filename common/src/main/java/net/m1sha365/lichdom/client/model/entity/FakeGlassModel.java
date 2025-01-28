package net.m1sha365.lichdom.client.model.entity;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.client.renderer.entity.FakeGlassRenderer;
import net.m1sha365.lichdom.entity.FakeGlassEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

/**
 * Example {@link GeoModel} for the {@link FakeGlassEntity}
 * @see FakeGlassRenderer
 */
public class FakeGlassModel extends DefaultedEntityGeoModel<FakeGlassEntity> {
	private static final ResourceLocation REDSTONE_BLOCK_TEXTURE =
			ResourceLocation.withDefaultNamespace("textures/block/redstone_block.png");

	public FakeGlassModel() {
		super(ResourceLocation.fromNamespaceAndPath(LichdomCommon.MODID, "fake_glass"));
	}

	// We just want our texture to be the Redstone Block texture
	@Override
	public ResourceLocation getTextureResource(FakeGlassEntity animatable, @Nullable GeoRenderer<FakeGlassEntity> renderer) {
		return REDSTONE_BLOCK_TEXTURE;
	}

	// We want our entity to be translucent
	@Override
	public RenderType getRenderType(FakeGlassEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}
}
