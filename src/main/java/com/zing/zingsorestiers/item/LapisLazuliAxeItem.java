package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class LapisLazuliAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 7f, 0, 30, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:lapis_lazuli_axe_repair_items")));

	public LapisLazuliAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5.5f, -2.4f, properties);
	}
}