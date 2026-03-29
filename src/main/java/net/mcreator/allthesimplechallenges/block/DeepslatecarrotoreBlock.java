package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DeepslatecarrotoreBlock extends Block {
	public DeepslatecarrotoreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).strength(3f, 6f));
	}
}