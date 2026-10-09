package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ClearDiamondBlock extends Block {
	public ClearDiamondBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}