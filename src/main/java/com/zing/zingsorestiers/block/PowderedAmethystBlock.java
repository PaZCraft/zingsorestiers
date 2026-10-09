package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class PowderedAmethystBlock extends Block {
	public PowderedAmethystBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}