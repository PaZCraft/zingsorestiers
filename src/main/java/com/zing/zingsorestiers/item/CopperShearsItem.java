package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

public class CopperShearsItem extends ShearsItem {
	public CopperShearsItem(Item.Properties properties) {
		super(properties.component(DataComponents.TOOL, ShearsItem.createToolProperties()).repairable(TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:copper_shears_repair_items"))).durability(191).enchantable(13));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 5f;
	}
}