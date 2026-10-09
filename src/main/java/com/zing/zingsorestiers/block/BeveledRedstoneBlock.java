package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BeveledRedstoneBlock extends Block {
	public BeveledRedstoneBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}