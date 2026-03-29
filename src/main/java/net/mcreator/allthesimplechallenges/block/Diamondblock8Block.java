package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Diamondblock8Block extends Block {
	public Diamondblock8Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 20f));
	}
}