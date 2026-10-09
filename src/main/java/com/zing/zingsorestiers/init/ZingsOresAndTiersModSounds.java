/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.zing.zingsorestiers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import com.zing.zingsorestiers.ZingsOresAndTiersMod;

public class ZingsOresAndTiersModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ZingsOresAndTiersMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_REDSTONE = REGISTRY.register("item.armor.equip_redstone",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_redstone")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_QUARTZ = REGISTRY.register("item.armor.equip_quartz",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_quartz")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_EMERALD = REGISTRY.register("item.armor.equip_emerald",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_emerald")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_LAPIS_LAZULI = REGISTRY.register("item.armor.equip_lapis_lazuli",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_lapis_lazuli")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_RESIN = REGISTRY.register("item.armor.equip_resin",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_resin")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_AMETHYST = REGISTRY.register("item.armor.equip_amethyst",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_amethyst")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_ARMOR_EQUIP_COAL = REGISTRY.register("item.armor.equip_coal",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("zings_ores_and_tiers", "item.armor.equip_coal")));
}