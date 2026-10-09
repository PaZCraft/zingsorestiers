package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GlassGoldItem extends Item {
	public GlassGoldItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}