package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class LapisLazuliPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 7f, 0, 30, TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:lapis_lazuli_pickaxe_repair_items")));

	public LapisLazuliPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}