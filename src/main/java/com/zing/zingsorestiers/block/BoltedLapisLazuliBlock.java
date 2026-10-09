package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BoltedLapisLazuliBlock extends Block {
	public BoltedLapisLazuliBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(1f, 10f));
	}
}