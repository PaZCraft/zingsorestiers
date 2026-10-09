package com.zing.zingsorestiers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsorestiers.entity.NetheriteGolemEntity;
import com.zing.zingsorestiers.entity.GoldenGolemEntity;
import com.zing.zingsorestiers.entity.CoalFireballEntity;
import com.zing.zingsorestiers.ZingsOresAndTiersMod;

@EventBusSubscriber
public class ZingsOresAndTiersModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ZingsOresAndTiersMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<GoldenGolemEntity>> GOLDEN_GOLEM = register("golden_golem",
			EntityType.Builder.<GoldenGolemEntity>of(GoldenGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(24).setUpdateInterval(3)

					.sized(0.6f, 1f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<NetheriteGolemEntity>> NETHERITE_GOLEM = register("netherite_golem",
			EntityType.Builder.<NetheriteGolemEntity>of(NetheriteGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(40).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f)

	);
	public static final DeferredHolder<EntityType<?>, EntityType<CoalFireballEntity>> COAL_FIREBALL = register("coal_fireball",
			EntityType.Builder.<CoalFireballEntity>of(CoalFireballEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(ZingsOresAndTiersMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		GoldenGolemEntity.init(event);
		NetheriteGolemEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOLDEN_GOLEM.get(), GoldenGolemEntity.createAttributes().build());
		event.put(NETHERITE_GOLEM.get(), NetheriteGolemEntity.createAttributes().build());
	}
}