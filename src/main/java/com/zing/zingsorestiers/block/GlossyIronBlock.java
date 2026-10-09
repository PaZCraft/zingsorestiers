package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GlossyIronBlock extends Block {
	public GlossyIronBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}