package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class ResinShovelItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 1100, 7.5f, 0, 15, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:resin_shovel_repair_items")));

	public ResinShovelItem(Item.Properties properties) {
		super(properties.shovel(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}