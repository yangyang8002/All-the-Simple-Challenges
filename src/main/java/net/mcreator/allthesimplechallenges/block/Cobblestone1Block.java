package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class Cobblestone1Block extends Block {
	public Cobblestone1Block() {
		super(BlockBehaviour.Properties.of().strength(1f, 20f));
	}
}