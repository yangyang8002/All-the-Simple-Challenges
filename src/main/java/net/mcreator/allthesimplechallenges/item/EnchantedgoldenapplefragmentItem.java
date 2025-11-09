package net.mcreator.allthesimplechallenges.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EnchantedgoldenapplefragmentItem extends Item {
	public EnchantedgoldenapplefragmentItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}