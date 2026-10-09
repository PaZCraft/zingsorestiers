package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class PrismarineHoeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 4f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:prismarine_hoe_repair_items")));

	public PrismarineHoeItem(Item.Properties properties) {
		super(properties.hoe(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}