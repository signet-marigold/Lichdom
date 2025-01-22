package net.m1sha365.lichdom;

import net.fabricmc.api.ModInitializer;

import net.m1sha365.lichdom.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lichdom implements ModInitializer {
	public static final String MOD_ID = "lichdom";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}