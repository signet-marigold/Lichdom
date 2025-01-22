package net.m1sha365.lichdom.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.m1sha365.lichdom.Lichdom;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block PINK_GARNET_BLOCK = register("pink_garnet_block", Block::new, Block.Settings.create()
            .strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of("lichdom", path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void initialize() {
        Lichdom.LOGGER.info("Registering Blocks for " + Lichdom.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
        });
    }
}