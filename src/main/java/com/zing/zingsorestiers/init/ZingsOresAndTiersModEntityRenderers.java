/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zingsoresandtiers.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.zingsoresandtiers.client.renderer.NetheriteGolemRenderer;
import net.mcreator.zingsoresandtiers.client.renderer.GoldenGolemRenderer;
import net.mcreator.zingsoresandtiers.client.renderer.CoalFireballRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsOresAndTiersModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZingsOresAndTiersModEntities.GOLDEN_GOLEM.get(), GoldenGolemRenderer::new);
		event.registerEntityRenderer(ZingsOresAndTiersModEntities.NETHERITE_GOLEM.get(), NetheriteGolemRenderer::new);
		event.registerEntityRenderer(ZingsOresAndTiersModEntities.COAL_FIREBALL.get(), CoalFireballRenderer::new);
	}
}