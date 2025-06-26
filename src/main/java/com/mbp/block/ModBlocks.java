package com.mbp.block;

import com.mbp.MoreBlockPermutations;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
//    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
//            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SANDSTONE_BRICKS_STAIRS = registerBlock("sandstone_bricks_stairs",
//            new StairsBlock(ModBlocks.SANDSTONE_BRICKS.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(2f).requiresTool()));

//    public static final Block OAK_WOOD_BLOCK = registerBlock("oak_wood_block",
//            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            new StairsBlock(Blocks.OAK_WOOD.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block OAK_WOOD_DOOR = registerBlock("oak_wood_door",
//            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block OAK_WOOD_TRAPDOOR = registerBlock("oak_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            new ButtonBlock(BlockSetType.OAK, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
//            new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
//            new FenceGateBlock(WoodType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_DOOR = registerBlock("spruce_wood_door",
//            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_TRAPDOOR = registerBlock("spruce_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
//            new ButtonBlock(BlockSetType.SPRUCE, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
//            new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
//            new FenceGateBlock(WoodType.BIRCH, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_DOOR = registerBlock("birch_wood_door",
//            new DoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_TRAPDOOR = registerBlock("birch_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.BIRCH, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
//            new ButtonBlock(BlockSetType.BIRCH, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
//            new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
//            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_DOOR = registerBlock("jungle_wood_door",
//            new DoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_TRAPDOOR = registerBlock("jungle_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
//            new ButtonBlock(BlockSetType.JUNGLE, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
//            new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
//            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_DOOR = registerBlock("dark_oak_wood_door",
//            new DoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_TRAPDOOR = registerBlock("dark_oak_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
//            new ButtonBlock(BlockSetType.DARK_OAK, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
//            new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
//            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_DOOR = registerBlock("acacia_wood_door",
//            new DoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_TRAPDOOR = registerBlock("acacia_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
//            new ButtonBlock(BlockSetType.ACACIA, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
//            new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
//            new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_DOOR = registerBlock("cherry_wood_door",
//            new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_TRAPDOOR = registerBlock("cherry_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
//            new ButtonBlock(BlockSetType.CHERRY, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//
//    public static final Block MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
//            new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(),
//                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
//    public static final Block MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
//            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
//            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
//            new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
//            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_DOOR = registerBlock("mangrove_wood_door",
//            new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_TRAPDOOR = registerBlock("mangrove_wood_trapdoor",
//            new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.create().strength(2f).requiresTool()));
//    public static final Block MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
//            new ButtonBlock(BlockSetType.MANGROVE, 2, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
//    public static final Block MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
//            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.create().strength(2f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreBlockPermutations.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreBlockPermutations.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreBlockPermutations.LOGGER.info("Registering Mod Blocks for " + MoreBlockPermutations.MOD_ID);
    }
}
