package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DripstoneCopperOreBlock extends Block {
	public DripstoneCopperOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DRIPSTONE_BLOCK).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}