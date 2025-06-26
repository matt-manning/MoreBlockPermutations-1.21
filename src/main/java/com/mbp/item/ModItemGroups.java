package com.mbp.item;

import com.mbp.MoreBlockPermutations;
import com.mbp.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_BLOCK_PERMUTATIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreBlockPermutations.MOD_ID, "more_block_permutations"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.OAK_WOOD_STAIRS))
                    .displayName(Text.translatable("itemgroup.more-block-permutations.more_block_permutations"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.OAK_WOOD_STAIRS);
                        entries.add(ModBlocks.OAK_WOOD_SLAB);
                        entries.add(ModBlocks.OAK_WOOD_FENCE);
//                        entries.add(ModBlocks.OAK_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.OAK_WOOD_WALL);
//                        entries.add(ModBlocks.OAK_WOOD_DOOR);
//                        entries.add(ModBlocks.OAK_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.OAK_WOOD_BUTTON);
//                        entries.add(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.SPRUCE_WOOD_STAIRS);
//                        entries.add(ModBlocks.SPRUCE_WOOD_SLAB);
//                        entries.add(ModBlocks.SPRUCE_WOOD_FENCE);
//                        entries.add(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.SPRUCE_WOOD_WALL);
//                        entries.add(ModBlocks.SPRUCE_WOOD_DOOR);
//                        entries.add(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.SPRUCE_WOOD_BUTTON);
//                        entries.add(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.BIRCH_WOOD_STAIRS);
//                        entries.add(ModBlocks.BIRCH_WOOD_SLAB);
//                        entries.add(ModBlocks.BIRCH_WOOD_FENCE);
//                        entries.add(ModBlocks.BIRCH_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.BIRCH_WOOD_WALL);
//                        entries.add(ModBlocks.BIRCH_WOOD_DOOR);
//                        entries.add(ModBlocks.BIRCH_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.BIRCH_WOOD_BUTTON);
//                        entries.add(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.JUNGLE_WOOD_STAIRS);
//                        entries.add(ModBlocks.JUNGLE_WOOD_SLAB);
//                        entries.add(ModBlocks.JUNGLE_WOOD_FENCE);
//                        entries.add(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.JUNGLE_WOOD_WALL);
//                        entries.add(ModBlocks.JUNGLE_WOOD_DOOR);
//                        entries.add(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.JUNGLE_WOOD_BUTTON);
//                        entries.add(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.DARK_OAK_WOOD_STAIRS);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_SLAB);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_FENCE);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_WALL);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_DOOR);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_BUTTON);
//                        entries.add(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.ACACIA_WOOD_STAIRS);
//                        entries.add(ModBlocks.ACACIA_WOOD_SLAB);
//                        entries.add(ModBlocks.ACACIA_WOOD_FENCE);
//                        entries.add(ModBlocks.ACACIA_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.ACACIA_WOOD_WALL);
//                        entries.add(ModBlocks.ACACIA_WOOD_DOOR);
//                        entries.add(ModBlocks.ACACIA_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.ACACIA_WOOD_BUTTON);
//                        entries.add(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.CHERRY_WOOD_STAIRS);
//                        entries.add(ModBlocks.CHERRY_WOOD_SLAB);
//                        entries.add(ModBlocks.CHERRY_WOOD_FENCE);
//                        entries.add(ModBlocks.CHERRY_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.CHERRY_WOOD_WALL);
//                        entries.add(ModBlocks.CHERRY_WOOD_DOOR);
//                        entries.add(ModBlocks.CHERRY_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.CHERRY_WOOD_BUTTON);
//                        entries.add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.MANGROVE_WOOD_STAIRS);
//                        entries.add(ModBlocks.MANGROVE_WOOD_SLAB);
//                        entries.add(ModBlocks.MANGROVE_WOOD_FENCE);
//                        entries.add(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
//                        entries.add(ModBlocks.MANGROVE_WOOD_WALL);
//                        entries.add(ModBlocks.MANGROVE_WOOD_DOOR);
//                        entries.add(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
//                        entries.add(ModBlocks.MANGROVE_WOOD_BUTTON);
//                        entries.add(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
//
//                        entries.add(ModBlocks.SANDSTONE_BRICKS);
//                        entries.add(ModBlocks.SANDSTONE_BRICKS_STAIRS);
                    }).build());

    public static void registerItemGroups() {
        MoreBlockPermutations.LOGGER.info("Registering Item Groups for " + MoreBlockPermutations.MOD_ID);
    }
}
