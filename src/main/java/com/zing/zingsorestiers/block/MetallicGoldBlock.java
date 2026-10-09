package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MetallicGoldBlock extends Block {
	public MetallicGoldBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.IRON).strength(1f, 10f));
	}
}