package net.mcreator.zingsoresandtiers.procedures;

import net.minecraft.world.entity.Entity;

public class CoalFireballProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.igniteForSeconds(15);
	}
}