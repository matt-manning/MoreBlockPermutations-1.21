package com.mbp.datagen;

import com.mbp.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
//        BlockStateModelGenerator.BlockTexturePool sandstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICKS);
//        sandstoneBricksPool.stairs(ModBlocks.SANDSTONE_BRICKS_STAIRS);

        //BlockStateModelGenerator.BlockTexturePool oakWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_WOOD);
//        BlockStateModelGenerator.BlockTexturePool spruceWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_WOOD);
//        BlockStateModelGenerator.BlockTexturePool birchWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_WOOD);
//        BlockStateModelGenerator.BlockTexturePool jungleWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_WOOD);
//        BlockStateModelGenerator.BlockTexturePool darkOakWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_WOOD);
//        BlockStateModelGenerator.BlockTexturePool acaciaWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_WOOD);
//        BlockStateModelGenerator.BlockTexturePool cherryWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_WOOD);
//        BlockStateModelGenerator.BlockTexturePool mangroveWoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_WOOD);


        registerStairs(generator, ModBlocks.OAK_WOOD_STAIRS, "block/oak_log");
        registerSlab(generator, ModBlocks.OAK_WOOD_SLAB, "block/oak_log");
        registerFence(generator, ModBlocks.OAK_WOOD_FENCE, "block/oak_log");
        registerFenceGate(generator, ModBlocks.OAK_WOOD_FENCE_GATE, "block/oak_log");
        registerWall(generator, ModBlocks.OAK_WOOD_WALL, "block/oak_log");
        registerButton(generator, ModBlocks.OAK_WOOD_BUTTON, "block/oak_log");
        registerPressurePlate(generator, ModBlocks.OAK_WOOD_PRESSURE_PLATE, "block/oak_log");

//        blockStateModelGenerator.registerDoor(ModBlocks.OAK_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.OAK_WOOD_TRAPDOOR);

//        spruceWoodPool.stairs(ModBlocks.SPRUCE_WOOD_STAIRS);
//        spruceWoodPool.slab(ModBlocks.SPRUCE_WOOD_SLAB);
//        spruceWoodPool.fence(ModBlocks.SPRUCE_WOOD_FENCE);
//        spruceWoodPool.fenceGate(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
//        spruceWoodPool.wall(ModBlocks.SPRUCE_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.SPRUCE_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.SPRUCE_WOOD_TRAPDOOR);
//        spruceWoodPool.button(ModBlocks.SPRUCE_WOOD_BUTTON);
//        spruceWoodPool.pressurePlate(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
//
//        birchWoodPool.stairs(ModBlocks.BIRCH_WOOD_STAIRS);
//        birchWoodPool.slab(ModBlocks.BIRCH_WOOD_SLAB);
//        birchWoodPool.fence(ModBlocks.BIRCH_WOOD_FENCE);
//        birchWoodPool.fenceGate(ModBlocks.BIRCH_WOOD_FENCE_GATE);
//        birchWoodPool.wall(ModBlocks.BIRCH_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.BIRCH_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.BIRCH_WOOD_TRAPDOOR);
//        birchWoodPool.button(ModBlocks.BIRCH_WOOD_BUTTON);
//        birchWoodPool.pressurePlate(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
//
//        jungleWoodPool.stairs(ModBlocks.JUNGLE_WOOD_STAIRS);
//        jungleWoodPool.slab(ModBlocks.JUNGLE_WOOD_SLAB);
//        jungleWoodPool.fence(ModBlocks.JUNGLE_WOOD_FENCE);
//        jungleWoodPool.fenceGate(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
//        jungleWoodPool.wall(ModBlocks.JUNGLE_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.JUNGLE_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.JUNGLE_WOOD_TRAPDOOR);
//        jungleWoodPool.button(ModBlocks.JUNGLE_WOOD_BUTTON);
//        jungleWoodPool.pressurePlate(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
//
//        darkOakWoodPool.stairs(ModBlocks.DARK_OAK_WOOD_STAIRS);
//        darkOakWoodPool.slab(ModBlocks.DARK_OAK_WOOD_SLAB);
//        darkOakWoodPool.fence(ModBlocks.DARK_OAK_WOOD_FENCE);
//        darkOakWoodPool.fenceGate(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
//        darkOakWoodPool.wall(ModBlocks.DARK_OAK_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.DARK_OAK_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.DARK_OAK_WOOD_TRAPDOOR);
//        darkOakWoodPool.button(ModBlocks.DARK_OAK_WOOD_BUTTON);
//        darkOakWoodPool.pressurePlate(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
//
//        acaciaWoodPool.stairs(ModBlocks.ACACIA_WOOD_STAIRS);
//        acaciaWoodPool.slab(ModBlocks.ACACIA_WOOD_SLAB);
//        acaciaWoodPool.fence(ModBlocks.ACACIA_WOOD_FENCE);
//        acaciaWoodPool.fenceGate(ModBlocks.ACACIA_WOOD_FENCE_GATE);
//        acaciaWoodPool.wall(ModBlocks.ACACIA_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.ACACIA_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.ACACIA_WOOD_TRAPDOOR);
//        acaciaWoodPool.button(ModBlocks.ACACIA_WOOD_BUTTON);
//        acaciaWoodPool.pressurePlate(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
//
//        cherryWoodPool.stairs(ModBlocks.CHERRY_WOOD_STAIRS);
//        cherryWoodPool.slab(ModBlocks.CHERRY_WOOD_SLAB);
//        cherryWoodPool.fence(ModBlocks.CHERRY_WOOD_FENCE);
//        cherryWoodPool.fenceGate(ModBlocks.CHERRY_WOOD_FENCE_GATE);
//        cherryWoodPool.wall(ModBlocks.CHERRY_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.CHERRY_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHERRY_WOOD_TRAPDOOR);
//        cherryWoodPool.button(ModBlocks.CHERRY_WOOD_BUTTON);
//        cherryWoodPool.pressurePlate(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
//
//        mangroveWoodPool.stairs(ModBlocks.MANGROVE_WOOD_STAIRS);
//        mangroveWoodPool.slab(ModBlocks.MANGROVE_WOOD_SLAB);
//        mangroveWoodPool.fence(ModBlocks.MANGROVE_WOOD_FENCE);
//        mangroveWoodPool.fenceGate(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
//        mangroveWoodPool.wall(ModBlocks.MANGROVE_WOOD_WALL);
//        blockStateModelGenerator.registerDoor(ModBlocks.MANGROVE_WOOD_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.MANGROVE_WOOD_TRAPDOOR);
//        mangroveWoodPool.button(ModBlocks.MANGROVE_WOOD_BUTTON);
//        mangroveWoodPool.pressurePlate(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private void registerStairs(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

//        TextureMap textureMap = new TextureMap()
//                .put(TextureKey.BOTTOM, Identifier.ofVanilla(texture))
//                .put(TextureKey.TOP, Identifier.ofVanilla(texture))
//                .put(TextureKey.SIDE, Identifier.ofVanilla(texture));

        Identifier baseModelId = ModelIds.getBlockModelId(block);
        Identifier innerModelId = ModelIds.getBlockSubModelId(block, "_inner");
        Identifier outerModelId = ModelIds.getBlockSubModelId(block, "_outer");

        Models.STAIRS.upload(baseModelId, textureMap, generator.modelCollector);
        Models.INNER_STAIRS.upload(innerModelId, textureMap, generator.modelCollector);
        Models.OUTER_STAIRS.upload(outerModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(block, innerModelId, baseModelId, outerModelId)
        );
    }

    private void registerSlab(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier baseModelId = ModelIds.getBlockModelId(block);
        Identifier topModelId = ModelIds.getBlockSubModelId(block, "_top");
        Identifier doubleModelId = ModelIds.getBlockSubModelId(block, "_double");

        Models.SLAB.upload(baseModelId, textureMap, generator.modelCollector);
        Models.SLAB_TOP.upload(topModelId, textureMap, generator.modelCollector);
        Models.CUBE_ALL.upload(doubleModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createSlabBlockState(block, baseModelId, topModelId, doubleModelId)
        );
    }

    private void registerFence(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier postModelId = ModelIds.getBlockModelId(block);
        Identifier sideModeId = ModelIds.getBlockSubModelId(block, "_side");
        Identifier inventoryModelId = ModelIds.getItemModelId(block.asItem());

        Models.FENCE_POST.upload(postModelId, textureMap, generator.modelCollector);
        Models.FENCE_SIDE.upload(sideModeId, textureMap, generator.modelCollector);
        Models.FENCE_INVENTORY.upload(inventoryModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createFenceBlockState(block, postModelId, sideModeId)
        );
    }

    private void registerFenceGate(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier gateModelId = ModelIds.getBlockModelId(block);
        Identifier gateOpenModelId = ModelIds.getBlockSubModelId(block, "_open");
        Identifier gateWallModelId = ModelIds.getBlockSubModelId(block, "_wall");
        Identifier gateWallOpenModelId = ModelIds.getBlockSubModelId(block, "_wall_open");

        Models.TEMPLATE_FENCE_GATE.upload(gateModelId, textureMap, generator.modelCollector);
        Models.TEMPLATE_FENCE_GATE_OPEN.upload(gateOpenModelId, textureMap, generator.modelCollector);
        Models.TEMPLATE_FENCE_GATE_WALL.upload(gateWallModelId, textureMap, generator.modelCollector);
        Models.TEMPLATE_FENCE_GATE_WALL_OPEN.upload(gateWallOpenModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createFenceGateBlockState(block, gateOpenModelId, gateModelId, gateWallOpenModelId, gateWallModelId, false)
        );
    }

    private void registerWall(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier postModelId = ModelIds.getBlockModelId(block);
        Identifier sideModelId = ModelIds.getBlockSubModelId(block, "_side");
        Identifier tallSideModelId = ModelIds.getBlockSubModelId(block, "_side_tall");
        Identifier inventoryModelId = ModelIds.getItemModelId(block.asItem());

        Models.TEMPLATE_WALL_POST.upload(postModelId, textureMap, generator.modelCollector);
        Models.TEMPLATE_WALL_SIDE.upload(sideModelId, textureMap, generator.modelCollector);
        Models.TEMPLATE_WALL_SIDE_TALL.upload(tallSideModelId, textureMap, generator.modelCollector);
        Models.WALL_INVENTORY.upload(inventoryModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(block, postModelId, sideModelId, tallSideModelId)
        );
    }

    private void registerButton(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier defaultModelId = ModelIds.getBlockModelId(block);
        Identifier pressedModelId = ModelIds.getBlockSubModelId(block, "_pressed");
        Identifier inventoryModelId = ModelIds.getItemModelId(block.asItem());

        Models.BUTTON.upload(defaultModelId, textureMap, generator.modelCollector);
        Models.BUTTON_PRESSED.upload(pressedModelId, textureMap, generator.modelCollector);
        Models.BUTTON_INVENTORY.upload(inventoryModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(
                BlockStateModelGenerator.createButtonBlockState(block, defaultModelId, pressedModelId)
        );
    }

    private void registerPressurePlate(BlockStateModelGenerator generator, Block block, String texture) {
        TextureMap textureMap = TextureMap.all(Identifier.ofVanilla(texture));

        Identifier upModelId = ModelIds.getBlockModelId(block);
        Identifier downModelId = ModelIds.getBlockSubModelId(block, "_down");
        //Identifier itemModelId = ModelIds.getItemModelId(block.asItem());

        Models.PRESSURE_PLATE_UP.upload(upModelId, textureMap, generator.modelCollector);
        Models.PRESSURE_PLATE_DOWN.upload(downModelId, textureMap, generator.modelCollector);
        //Models.Inve.upload(itemModelId, textureMap, generator.modelCollector);

        generator.blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(
                block, upModelId, downModelId
        ));
    }
}
