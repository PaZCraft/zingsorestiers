package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class EmeraldHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.5f, 0, 18, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:emerald_hoe_repair_items")));

	public EmeraldHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6.5f, -2.4f, properties);
	}
}