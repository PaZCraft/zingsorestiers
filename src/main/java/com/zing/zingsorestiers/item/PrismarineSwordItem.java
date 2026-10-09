package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class PrismarineSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 4f, 0, 12, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:prismarine_sword_repair_items")));

	public PrismarineSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}