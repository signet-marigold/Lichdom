package net.m1sha365.lichdom.item.client;

import net.m1sha365.lichdom.item.custom.AnimatedBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedBlockItemRenderer extends GeoItemRenderer<AnimatedBlockItem> {
    public AnimatedBlockItemRenderer() {
        super(new AnimatedBlockItemModel());
    }
}