package net.mcreator.zingsoresandtiers.block;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.zingsoresandtiers.procedures.WarpedNetheriteBulbRedstoneOnProcedure;

import javax.annotation.Nullable;

public class WarpedNetheriteBulbBlock extends Block {
	public WarpedNetheriteBulbBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER_BULB).strength(1f, 10f));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			WarpedNetheriteBulbRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}
}