package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class QuartzHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 900, 9f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:quartz_hoe_repair_items")));

	public QuartzHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -2.3f, properties);
	}
}