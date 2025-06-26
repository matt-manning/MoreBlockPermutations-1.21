package com.mbp.datagen;

import com.mbp.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//                .add(ModBlocks.SANDSTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_WOOD_STAIRS)
                .add(ModBlocks.OAK_WOOD_SLAB);
//                .add(ModBlocks.OAK_WOOD_FENCE_GATE)
//                .add(ModBlocks.OAK_WOOD_WALL)
//                .add(ModBlocks.OAK_WOOD_DOOR)
//                .add(ModBlocks.OAK_WOOD_TRAPDOOR)
//                .add(ModBlocks.OAK_WOOD_BUTTON)
//                .add(ModBlocks.OAK_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.SPRUCE_WOOD_STAIRS)
//                .add(ModBlocks.SPRUCE_WOOD_SLAB)
//                .add(ModBlocks.SPRUCE_WOOD_FENCE)
//                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE)
//                .add(ModBlocks.SPRUCE_WOOD_WALL)
//                .add(ModBlocks.SPRUCE_WOOD_DOOR)
//                .add(ModBlocks.SPRUCE_WOOD_TRAPDOOR)
//                .add(ModBlocks.SPRUCE_WOOD_BUTTON)
//                .add(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.BIRCH_WOOD_STAIRS)
//                .add(ModBlocks.BIRCH_WOOD_SLAB)
//                .add(ModBlocks.BIRCH_WOOD_FENCE)
//                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE)
//                .add(ModBlocks.BIRCH_WOOD_WALL)
//                .add(ModBlocks.BIRCH_WOOD_DOOR)
//                .add(ModBlocks.BIRCH_WOOD_TRAPDOOR)
//                .add(ModBlocks.BIRCH_WOOD_BUTTON)
//                .add(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.JUNGLE_WOOD_STAIRS)
//                .add(ModBlocks.JUNGLE_WOOD_SLAB)
//                .add(ModBlocks.JUNGLE_WOOD_FENCE)
//                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE)
//                .add(ModBlocks.JUNGLE_WOOD_WALL)
//                .add(ModBlocks.JUNGLE_WOOD_DOOR)
//                .add(ModBlocks.JUNGLE_WOOD_TRAPDOOR)
//                .add(ModBlocks.JUNGLE_WOOD_BUTTON)
//                .add(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.DARK_OAK_WOOD_STAIRS)
//                .add(ModBlocks.DARK_OAK_WOOD_SLAB)
//                .add(ModBlocks.DARK_OAK_WOOD_FENCE)
//                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE)
//                .add(ModBlocks.DARK_OAK_WOOD_WALL)
//                .add(ModBlocks.DARK_OAK_WOOD_DOOR)
//                .add(ModBlocks.DARK_OAK_WOOD_TRAPDOOR)
//                .add(ModBlocks.DARK_OAK_WOOD_BUTTON)
//                .add(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.ACACIA_WOOD_STAIRS)
//                .add(ModBlocks.ACACIA_WOOD_SLAB)
//                .add(ModBlocks.ACACIA_WOOD_FENCE)
//                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE)
//                .add(ModBlocks.ACACIA_WOOD_WALL)
//                .add(ModBlocks.ACACIA_WOOD_DOOR)
//                .add(ModBlocks.ACACIA_WOOD_TRAPDOOR)
//                .add(ModBlocks.ACACIA_WOOD_BUTTON)
//                .add(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.CHERRY_WOOD_STAIRS)
//                .add(ModBlocks.CHERRY_WOOD_SLAB)
//                .add(ModBlocks.CHERRY_WOOD_FENCE)
//                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE)
//                .add(ModBlocks.CHERRY_WOOD_WALL)
//                .add(ModBlocks.CHERRY_WOOD_DOOR)
//                .add(ModBlocks.CHERRY_WOOD_TRAPDOOR)
//                .add(ModBlocks.CHERRY_WOOD_BUTTON)
//                .add(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE)
//
//                .add(ModBlocks.MANGROVE_WOOD_STAIRS)
//                .add(ModBlocks.MANGROVE_WOOD_SLAB)
//                .add(ModBlocks.MANGROVE_WOOD_FENCE)
//                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE)
//                .add(ModBlocks.MANGROVE_WOOD_WALL)
//                .add(ModBlocks.MANGROVE_WOOD_DOOR)
//                .add(ModBlocks.MANGROVE_WOOD_TRAPDOOR)
//                .add(ModBlocks.MANGROVE_WOOD_BUTTON)
//                .add(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.OAK_WOOD_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.OAK_WOOD_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.OAK_WOOD_WALL);
    }
}
