package com.zing.zingsorestiers.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldenNameTagItem extends Item {
	public GoldenNameTagItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}