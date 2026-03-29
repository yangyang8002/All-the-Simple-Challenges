package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class Cobblestone4Block extends Block {
	public Cobblestone4Block() {
		super(BlockBehaviour.Properties.of().strength(1f, 20f));
	}
}