package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ClearResinBlock extends Block {
	public ClearResinBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}