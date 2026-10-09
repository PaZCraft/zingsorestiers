/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsorestiers.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.zing.zingsorestiers.client.model.Modelnetherite_golem_entity_model;
import com.zing.zingsorestiers.client.model.Modelgolden_golem_entity_model;
import com.zing.zingsorestiers.client.model.Modelcoal_fireball;

@EventBusSubscriber(Dist.CLIENT)
public class ZingsOresAndTiersModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcoal_fireball.LAYER_LOCATION, Modelcoal_fireball::createBodyLayer);
		event.registerLayerDefinition(Modelnetherite_golem_entity_model.LAYER_LOCATION, Modelnetherite_golem_entity_model::createBodyLayer);
		event.registerLayerDefinition(Modelgolden_golem_entity_model.LAYER_LOCATION, Modelgolden_golem_entity_model::createBodyLayer);
	}
}