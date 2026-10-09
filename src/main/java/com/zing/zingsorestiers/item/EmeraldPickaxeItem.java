package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class EmeraldPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.5f, 0, 18, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:emerald_pickaxe_repair_items")));

	public EmeraldPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 6.5f, -2.4f));
	}
}