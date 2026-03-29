package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CarrotoreBlock extends Block {
	public CarrotoreBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 3f));
	}
}