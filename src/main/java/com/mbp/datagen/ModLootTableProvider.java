package com.mbp.datagen;

import com.mbp.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.SANDSTONE_BRICKS);

        addDrop(ModBlocks.OAK_WOOD_STAIRS);
        addDrop(ModBlocks.OAK_WOOD_SLAB);
        addDrop(ModBlocks.OAK_WOOD_FENCE);
        addDrop(ModBlocks.OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.OAK_WOOD_WALL);
//        addDrop(ModBlocks.OAK_WOOD_DOOR);
//        addDrop(ModBlocks.OAK_WOOD_TRAPDOOR);
        addDrop(ModBlocks.OAK_WOOD_BUTTON);
        addDrop(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.SPRUCE_WOOD_STAIRS);
//        addDrop(ModBlocks.SPRUCE_WOOD_SLAB);
//        addDrop(ModBlocks.SPRUCE_WOOD_FENCE);
//        addDrop(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.SPRUCE_WOOD_WALL);
//        addDrop(ModBlocks.SPRUCE_WOOD_DOOR);
//        addDrop(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.SPRUCE_WOOD_BUTTON);
//        addDrop(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.BIRCH_WOOD_STAIRS);
//        addDrop(ModBlocks.BIRCH_WOOD_SLAB);
//        addDrop(ModBlocks.BIRCH_WOOD_FENCE);
//        addDrop(ModBlocks.BIRCH_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.BIRCH_WOOD_WALL);
//        addDrop(ModBlocks.BIRCH_WOOD_DOOR);
//        addDrop(ModBlocks.BIRCH_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.BIRCH_WOOD_BUTTON);
//        addDrop(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.JUNGLE_WOOD_STAIRS);
//        addDrop(ModBlocks.JUNGLE_WOOD_SLAB);
//        addDrop(ModBlocks.JUNGLE_WOOD_FENCE);
//        addDrop(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.JUNGLE_WOOD_WALL);
//        addDrop(ModBlocks.JUNGLE_WOOD_DOOR);
//        addDrop(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.JUNGLE_WOOD_BUTTON);
//        addDrop(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.DARK_OAK_WOOD_STAIRS);
//        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB);
//        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE);
//        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.DARK_OAK_WOOD_WALL);
//        addDrop(ModBlocks.DARK_OAK_WOOD_DOOR);
//        addDrop(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.DARK_OAK_WOOD_BUTTON);
//        addDrop(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.ACACIA_WOOD_STAIRS);
//        addDrop(ModBlocks.ACACIA_WOOD_SLAB);
//        addDrop(ModBlocks.ACACIA_WOOD_FENCE);
//        addDrop(ModBlocks.ACACIA_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.ACACIA_WOOD_WALL);
//        addDrop(ModBlocks.ACACIA_WOOD_DOOR);
//        addDrop(ModBlocks.ACACIA_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.ACACIA_WOOD_BUTTON);
//        addDrop(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.CHERRY_WOOD_STAIRS);
//        addDrop(ModBlocks.CHERRY_WOOD_SLAB);
//        addDrop(ModBlocks.CHERRY_WOOD_FENCE);
//        addDrop(ModBlocks.CHERRY_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.CHERRY_WOOD_WALL);
//        addDrop(ModBlocks.CHERRY_WOOD_DOOR);
//        addDrop(ModBlocks.CHERRY_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.CHERRY_WOOD_BUTTON);
//        addDrop(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
//
//        addDrop(ModBlocks.MANGROVE_WOOD_STAIRS);
//        addDrop(ModBlocks.MANGROVE_WOOD_SLAB);
//        addDrop(ModBlocks.MANGROVE_WOOD_FENCE);
//        addDrop(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
//        addDrop(ModBlocks.MANGROVE_WOOD_WALL);
//        addDrop(ModBlocks.MANGROVE_WOOD_DOOR);
//        addDrop(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
//        addDrop(ModBlocks.MANGROVE_WOOD_BUTTON);
//        addDrop(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
    }
}
