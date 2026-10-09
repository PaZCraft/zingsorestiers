package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BeveledQuartzBlock extends Block {
	public BeveledQuartzBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}