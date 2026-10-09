package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class AmethystAxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 8f, 0, 16, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:amethyst_axe_repair_items")));

	public AmethystAxeItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 7f, -2.5f));
	}
}