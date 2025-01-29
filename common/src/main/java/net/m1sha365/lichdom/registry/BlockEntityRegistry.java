package net.m1sha365.lichdom.registry;

import net.m1sha365.lichdom.LichdomCommon;
import net.m1sha365.lichdom.block.entity.FertilizerBlockEntity;
import net.m1sha365.lichdom.block.entity.GeckoHabitatBlockEntity;
import net.m1sha365.lichdom.block.entity.PhylacteryBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Set;
import java.util.function.Supplier;

public final class BlockEntityRegistry {
	public static void init() {}

	public static final Supplier<BlockEntityType<GeckoHabitatBlockEntity>> GECKO_HABITAT = registerBlockEntity("habitat", () -> new BlockEntityType<>(GeckoHabitatBlockEntity::new, Set.of(BlockRegistry.GECKO_HABITAT.get())));
	public static final Supplier<BlockEntityType<FertilizerBlockEntity>> FERTILIZER_BLOCK = registerBlockEntity("fertilizer", () -> new BlockEntityType<>(FertilizerBlockEntity::new, Set.of(BlockRegistry.FERTILIZER.get())));
	public static final Supplier<BlockEntityType<PhylacteryBlockEntity>> PHYLACTERY_BLOCK = registerBlockEntity("phylactery", () -> new BlockEntityType<>(PhylacteryBlockEntity::new, Set.of(BlockRegistry.PHYLACTERY.get())));

	private static <T extends BlockEntity> Supplier<BlockEntityType<T>> registerBlockEntity(String id, Supplier<BlockEntityType<T>> blockEntity) {
		return LichdomCommon.COMMON_PLATFORM.registerBlockEntity(id, blockEntity);
	}
}
