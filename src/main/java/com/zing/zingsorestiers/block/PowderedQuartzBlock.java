package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class PowderedQuartzBlock extends Block {
	public PowderedQuartzBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}