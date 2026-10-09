package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.zingsoresandtiers.procedures.GoldenLavaBucketRightclickedOnBlockProcedure;

public class GoldenLavaBucketItem extends Item {
	public GoldenLavaBucketItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GoldenLavaBucketRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}