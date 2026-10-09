package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class GoldenTrapdoorBlock extends TrapDoorBlock {
	public GoldenTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.IRON, properties.sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}
}