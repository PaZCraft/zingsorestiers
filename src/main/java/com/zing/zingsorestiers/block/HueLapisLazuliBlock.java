package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class HueLapisLazuliBlock extends Block {
	public HueLapisLazuliBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}