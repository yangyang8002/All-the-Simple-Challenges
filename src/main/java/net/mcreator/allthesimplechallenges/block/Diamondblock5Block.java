package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Diamondblock5Block extends Block {
	public Diamondblock5Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 20f));
	}
}