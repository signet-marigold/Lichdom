package net.m1sha365.lichdom.block.entity.client;

import net.m1sha365.lichdom.Lichdom;
import net.m1sha365.lichdom.block.entity.AnimatedBlockEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class AnimatedBlockModel extends GeoModel<AnimatedBlockEntity> {
    @Override
    public Identifier getModelResource(AnimatedBlockEntity animatedBlockEntity, @Nullable GeoRenderer<AnimatedBlockEntity> geoRenderer) {
        return Identifier.of(Lichdom.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockEntity animatedBlockEntity, @Nullable GeoRenderer<AnimatedBlockEntity> geoRenderer) {
        return Identifier.of(Lichdom.MOD_ID, "textures/block/animated_block.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockEntity animatedBlockEntity) {
        return Identifier.of(Lichdom.MOD_ID, "animations/animated_block.animation.json");
    }
}