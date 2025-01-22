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
    public static final Item PHYLACTERY = register("phylactery");

    private static Item register(String name) {
        RegistryKey<Item> ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Lichdom.MOD_ID, name));
        return Registry.register(Registries.ITEM, ITEM_KEY.getValue(), new Item(new Item.Settings().registryKey(ITEM_KEY)));
    }

    // Get the event for modifying entries in the ingredients group.
    // And register an event handler that adds our suspicious item to the ingredients group.
    public static void initialize() {
        Lichdom.LOGGER.info("Registering Items for " + Lichdom.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
            entries.add(ModItems.PHYLACTERY);
        });
    }
}
