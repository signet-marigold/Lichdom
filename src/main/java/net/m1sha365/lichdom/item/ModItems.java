package net.m1sha365.lichdom.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.m1sha365.lichdom.Lichdom;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PHYLACTERY = registerItem("phylactery");

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }

    public static Item registerItem(String name) {
        RegistryKey<Item> ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lichdom.MOD_ID, name));
        return register(
            new Item(new Item.Settings().registryKey(ITEM_KEY)),
            ITEM_KEY
        );
    }

    // Get the event for modifying entries in the ingredients group.
    // And register an event handler that adds our suspicious item to the ingredients group.
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
            entries.add(PHYLACTERY);
        });
    }
}
