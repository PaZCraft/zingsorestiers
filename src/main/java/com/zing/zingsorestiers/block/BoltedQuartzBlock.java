package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BoltedQuartzBlock extends Block {
	public BoltedQuartzBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(1f, 10f));
	}
}