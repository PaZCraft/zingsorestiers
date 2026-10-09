package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SpeckledIronBlock extends Block {
	public SpeckledIronBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}