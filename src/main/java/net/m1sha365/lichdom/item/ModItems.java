package net.m1sha365.lichdom.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.m1sha365.lichdom.Lichdom;
import net.m1sha365.lichdom.block.ModBlocks;
import net.m1sha365.lichdom.item.custom.AnimatedBlockItem;
import net.m1sha365.lichdom.item.custom.AnimatedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item register(String name) {
        RegistryKey<Item> ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lichdom.MOD_ID, name));
        return Registry.register(Registries.ITEM, ITEM_KEY.getValue(), new Item(new Item.Settings().registryKey(ITEM_KEY)));
    }

    private static Item registerAnimated(String name) {
        RegistryKey<Item> ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lichdom.MOD_ID, name));
        return Registry.register(Registries.ITEM, ITEM_KEY.getValue(), new AnimatedItem(new Item.Settings().registryKey(ITEM_KEY)));
    }

    private static Item registerAnimatedBlock(String name) {
        RegistryKey<Item> ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lichdom.MOD_ID, name));
        return Registry.register(Registries.ITEM, ITEM_KEY.getValue(), new AnimatedBlockItem(ModBlocks.ANIMATED_BLOCK, new Item.Settings().registryKey(ITEM_KEY)));
    }

    public static final Item CURSED_AMULET = register("cursed_amulet");
    public static final Item ANIMATED_ITEM = registerAnimated("animated_item");
    public static final Item ANIMATED_BLOCK_ITEM = registerAnimatedBlock("animated_block");

    public static void initialize() {
        Lichdom.LOGGER.info("Registering Items for " + Lichdom.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
            entries.add(ModItems.CURSED_AMULET);
            entries.add(ModItems.ANIMATED_ITEM);
            entries.add(ModItems.ANIMATED_BLOCK_ITEM);
        });
    }
}
