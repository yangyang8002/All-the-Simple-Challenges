package net.mcreator.allthesimplechallenges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EnchantedgoldenapplefragmentItem extends Item {
	public EnchantedgoldenapplefragmentItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(16));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}