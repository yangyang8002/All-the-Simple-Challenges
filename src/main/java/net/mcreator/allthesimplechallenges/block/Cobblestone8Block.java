package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class Cobblestone8Block extends Block {
	public Cobblestone8Block(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 20f));
	}
}