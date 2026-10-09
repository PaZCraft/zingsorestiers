package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GlossyLapisLazuliBlock extends Block {
	public GlossyLapisLazuliBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}