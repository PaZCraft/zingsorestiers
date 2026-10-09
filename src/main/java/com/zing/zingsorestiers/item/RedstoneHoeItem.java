package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class RedstoneHoeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(
		BlockTags.INCORRECT_FOR_IRON_TOOL,
		350,
		11.0F,
		0.0F,
		20,
		TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:redstone_hoe_repair_items"))
	);

	public RedstoneHoeItem(Item.Properties properties) {
		super(properties.hoe(TOOL_MATERIAL, 5f, -2f));
	}
}