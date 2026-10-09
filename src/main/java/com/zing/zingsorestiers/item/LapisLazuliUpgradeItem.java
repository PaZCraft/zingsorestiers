package com.zing.zingsorestiers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LapisLazuliUpgradeItem extends Item {
	public LapisLazuliUpgradeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}