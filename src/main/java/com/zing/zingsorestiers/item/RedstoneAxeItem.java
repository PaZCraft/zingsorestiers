package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class RedstoneAxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(
		BlockTags.INCORRECT_FOR_IRON_TOOL,
		350,
		11f,
		0f,
		20,
		TagKey.create(Registries.ITEM, Identifier.parse("zingsores_and_tiers:redstone_axe_repair_items"))
		
	);

	public RedstoneAxeItem(Item.Properties properties) {
		super(properties.axe(TOOL_MATERIAL, 5f, -2f));
	}
}