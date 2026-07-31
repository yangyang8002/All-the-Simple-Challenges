package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class RawchorusfruitblockBlock extends Block {
	public RawchorusfruitblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(1f, 3f).requiresCorrectToolForDrops());
	}
}