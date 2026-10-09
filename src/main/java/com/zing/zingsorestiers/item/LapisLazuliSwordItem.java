package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class LapisLazuliSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 7f, 0, 30, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:lapis_lazuli_sword_repair_items")));

	public LapisLazuliSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}