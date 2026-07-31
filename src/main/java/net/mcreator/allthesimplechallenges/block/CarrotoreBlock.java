package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CarrotoreBlock extends Block {
	public CarrotoreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 3f));
	}
}