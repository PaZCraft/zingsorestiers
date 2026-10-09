package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GlossyCoalBlock extends Block {
	public GlossyCoalBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}