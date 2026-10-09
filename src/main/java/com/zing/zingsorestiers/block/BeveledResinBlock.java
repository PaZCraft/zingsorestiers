package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class BeveledResinBlock extends Block {
	public BeveledResinBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}