package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BeveledCopperBlock extends Block {
	public BeveledCopperBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}