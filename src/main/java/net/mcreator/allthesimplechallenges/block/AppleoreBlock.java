package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class AppleoreBlock extends Block {
	public AppleoreBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 3f));
	}
}