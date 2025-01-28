package net.m1sha365.lichdom.item.client;

import net.m1sha365.lichdom.Lichdom;
import net.m1sha365.lichdom.item.custom.AnimatedItem;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public Identifier getModelResource(AnimatedItem animatable, @Nullable GeoRenderer<AnimatedItem> renderer) {
        return Identifier.of(Lichdom.MOD_ID, "geo/animated_item.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedItem animatable, @Nullable GeoRenderer<AnimatedItem> renderer) {
        return Identifier.of(Lichdom.MOD_ID, "textures/item/animated_item.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedItem animatable) {
        return Identifier.of(Lichdom.MOD_ID, "animations/animated_item.animation.json");
    }
}