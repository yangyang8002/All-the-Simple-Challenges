package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class Cobblestone2Block extends Block {
	public Cobblestone2Block() {
		super(BlockBehaviour.Properties.of().strength(1f, 20f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}