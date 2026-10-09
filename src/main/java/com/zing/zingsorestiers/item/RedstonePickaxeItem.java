package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class RedstonePickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 11f, 0, 20, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:redstone_pickaxe_repair_items")));

	public RedstonePickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 5f, -2f));
	}
}