package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GlossyEmeraldBlock extends Block {
	public GlossyEmeraldBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}