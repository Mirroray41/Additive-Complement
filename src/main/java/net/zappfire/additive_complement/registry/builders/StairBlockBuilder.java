package net.zappfire.additive_complement.registry.builders;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.zappfire.additive_complement.registry.BlockRegistry;

public class StairBlockBuilder extends StairsBlock {
    private static BlockState baseBlockState = BlockRegistry.MOSSY_BLACKSTONE.getDefaultState();
    public StairBlockBuilder(Settings settings) {
        super(baseBlockState, settings);
    }
}
