package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BeveledIronBlock extends Block {
	public BeveledIronBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}