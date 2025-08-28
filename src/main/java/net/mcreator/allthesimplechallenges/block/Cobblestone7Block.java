package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class Cobblestone7Block extends Block {
	public Cobblestone7Block() {
		super(BlockBehaviour.Properties.of().strength(1f, 20f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}