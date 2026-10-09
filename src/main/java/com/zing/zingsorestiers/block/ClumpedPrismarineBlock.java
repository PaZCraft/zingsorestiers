package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ClumpedPrismarineBlock extends Block {
	public ClumpedPrismarineBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.RESIN).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}