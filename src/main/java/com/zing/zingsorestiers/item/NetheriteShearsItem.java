package com.zing.zingsorestiers.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

public class NetheriteShearsItem extends ShearsItem {
	public NetheriteShearsItem(Item.Properties properties) {
		super(properties.component(DataComponents.TOOL, ShearsItem.createToolProperties()).repairable(TagKey.create(Registries.ITEM, Identifier.parse("zings_ores_and_tiers:netherite_shears_repair_items"))).durability(2031).fireResistant()
				.enchantable(15));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 9f;
	}
}