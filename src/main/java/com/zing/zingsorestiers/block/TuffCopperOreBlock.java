package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class TuffCopperOreBlock extends Block {
	public TuffCopperOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.TUFF).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}