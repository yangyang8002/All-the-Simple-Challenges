package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BakedbreadblockBlock extends Block {
	public BakedbreadblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST_CLUSTER).strength(1f, 3f).requiresCorrectToolForDrops());
	}
}