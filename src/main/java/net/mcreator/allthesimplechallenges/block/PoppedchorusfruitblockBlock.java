package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PoppedchorusfruitblockBlock extends Block {
	public PoppedchorusfruitblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(1f, 3f).requiresCorrectToolForDrops());
	}
}