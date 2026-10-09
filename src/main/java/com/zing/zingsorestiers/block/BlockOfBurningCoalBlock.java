package com.zing.zingsorestiers.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import com.zing.zingsorestiers.procedures.BlockOfBurningCoalOnRandomClientDisplayTickProcedure;
import com.zing.zingsorestiers.procedures.BlockOfBurningCoalEntityWalksOnTheBlockProcedure;

public class BlockOfBurningCoalBlock extends Block {
	public BlockOfBurningCoalBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WART_BLOCK).strength(1f, 10f).lightLevel(blockstate -> 2));
	}

	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		BlockOfBurningCoalOnRandomClientDisplayTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		BlockOfBurningCoalEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}