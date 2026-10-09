package net.mcreator.zingsoresandtiers.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.zingsoresandtiers.procedures.NetheriteWaterBucketRightclickedOnBlockProcedure;

public class NetheriteWaterBucketItem extends Item {
	public NetheriteWaterBucketItem(Item.Properties properties) {
		super(properties.fireResistant());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		NetheriteWaterBucketRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}