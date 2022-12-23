package net.zappfire.additive_complement.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zappfire.additive_complement.AdditiveComplement;
import net.zappfire.additive_complement.registry.builders.SlabBlockBuilder;
import net.zappfire.additive_complement.registry.builders.StairBlockBuilder;
import net.zappfire.additive_complement.registry.builders.WallBlockBuilder;

public class BlockRegistry {

    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICKS = registerBlock("mossy_polished_blackstone_bricks",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs",
            new StairBlockBuilder(BlockRegistry.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("mossy_polished_blackstone_brick_stairs",
            new StairBlockBuilder(BlockRegistry.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs",
            new StairBlockBuilder(BlockRegistry.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs",
            new StairBlockBuilder(BlockRegistry.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            new StairBlockBuilder(BlockRegistry.MOSSY_DEEPSLATE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            new SlabBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("mossy_polished_blackstone_brick_slab",
            new SlabBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab",
            new SlabBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab",
            new SlabBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            new SlabBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);

    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            new WallBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("mossy_polished_blackstone_brick_wall",
            new WallBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall",
            new WallBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall",
            new WallBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            new WallBlockBuilder(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ItemGroup.MISC);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(AdditiveComplement.MODID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(AdditiveComplement.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(AdditiveComplement.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerBlocks() {
        AdditiveComplement.LOGGER.debug("Registering Blocks for " + AdditiveComplement.MODID);
    }
}
