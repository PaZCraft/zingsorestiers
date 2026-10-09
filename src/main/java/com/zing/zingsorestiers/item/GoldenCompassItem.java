package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GoldenCompassItem extends Item {
	public GoldenCompassItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}