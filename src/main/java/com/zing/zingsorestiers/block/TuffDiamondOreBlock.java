package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class TuffDiamondOreBlock extends Block {
	public TuffDiamondOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.TUFF).strength(1f, 10f).requiresCorrectToolForDrops());
	}
}