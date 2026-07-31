package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DeepslatepotatooreBlock extends Block {
	public DeepslatepotatooreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE).strength(3f, 6f));
	}
}