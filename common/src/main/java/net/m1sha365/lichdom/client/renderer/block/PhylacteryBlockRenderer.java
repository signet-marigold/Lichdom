package net.m1sha365.lichdom.client.renderer.block;

import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.m1sha365.lichdom.client.model.block.PhylacteryModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class PhylacteryBlockRenderer extends GeoBlockRenderer<PhylacteryBlockEntity> {
	public PhylacteryBlockRenderer() {
		super(new PhylacteryModel());
	}
}
