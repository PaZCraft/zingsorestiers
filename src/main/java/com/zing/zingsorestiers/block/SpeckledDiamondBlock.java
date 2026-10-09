package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SpeckledDiamondBlock extends Block {
	public SpeckledDiamondBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}