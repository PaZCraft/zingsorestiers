package net.mcreator.zingsoresandtiers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class BlockOfBurningCoalOnRandomClientDisplayTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.WHITE_SMOKE, x, y, z, 0, 1, 0);
	}
}