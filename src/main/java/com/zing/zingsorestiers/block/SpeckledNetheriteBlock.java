package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SpeckledNetheriteBlock extends Block {
	public SpeckledNetheriteBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}