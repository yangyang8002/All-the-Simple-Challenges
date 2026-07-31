package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Diamondblock2Block extends Block {
	public Diamondblock2Block(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 20f));
	}
}