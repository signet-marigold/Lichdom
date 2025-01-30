package net.m1sha365.lichdom.registry;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.FertilizerBlock;
import net.m1sha365.lichdom.block.GeckoHabitatBlock;
import net.m1sha365.lichdom.block.PhylacteryBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public final class BlockRegistry {
	public static void init() {}

	public static final Supplier<GeckoHabitatBlock> GECKO_HABITAT = registerBlock("gecko_habitat", properties -> new GeckoHabitatBlock(properties.noOcclusion()));
	public static final Supplier<FertilizerBlock> FERTILIZER = registerBlock("fertilizer", properties -> new FertilizerBlock(properties.noOcclusion()));
	public static final Supplier<PhylacteryBlock> PHYLACTERY = registerBlock("phylactery", properties -> new PhylacteryBlock());

	private static <T extends Block> Supplier<T> registerBlock(String id, Function<BlockBehaviour.Properties, T> block) {
		return LichdomCommon.COMMON_PLATFORM.registerBlock(id, block);
	}
}
