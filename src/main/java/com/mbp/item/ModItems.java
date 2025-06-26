package com.mbp.item;

import com.mbp.MoreBlockPermutations;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreBlockPermutations.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreBlockPermutations.LOGGER.info("Registering Mod Items for " + MoreBlockPermutations.MOD_ID);
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add();
        });*/
    }
}
