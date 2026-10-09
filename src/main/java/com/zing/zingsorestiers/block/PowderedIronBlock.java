package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class PowderedIronBlock extends Block {
	public PowderedIronBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}