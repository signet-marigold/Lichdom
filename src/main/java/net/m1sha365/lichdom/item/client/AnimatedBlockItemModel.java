package net.m1sha365.lichdom.item.client;

import net.m1sha365.lichdom.Lichdom;
import net.m1sha365.lichdom.item.custom.AnimatedBlockItem;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class AnimatedBlockItemModel extends GeoModel<AnimatedBlockItem> {
    @Override
    public Identifier getModelResource(AnimatedBlockItem animatable, @Nullable GeoRenderer<AnimatedBlockItem> renderer) {
        return Identifier.of(Lichdom.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockItem animatable, @Nullable GeoRenderer<AnimatedBlockItem> renderer) {
        return Identifier.of(Lichdom.MOD_ID, "textures/block/animated_block.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockItem animatable) {
        return Identifier.of(Lichdom.MOD_ID, "animations/animated_block.animation.json");
    }
}