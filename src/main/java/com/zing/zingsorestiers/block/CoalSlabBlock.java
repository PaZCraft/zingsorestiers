package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class CoalSlabBlock extends SlabBlock {
	public CoalSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f));
	}
}