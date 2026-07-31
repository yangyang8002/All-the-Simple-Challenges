package net.mcreator.allthesimplechallenges.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawbreadItem extends Item {
	public RawbreadItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).alwaysEdible().build()));
	}
}