package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneUpgradeItem extends Item {
	public RedstoneUpgradeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}