package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BoltedPrismarineBlock extends Block {
	public BoltedPrismarineBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}