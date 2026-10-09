package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SpeckledAmethystBlock extends Block {
	public SpeckledAmethystBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}