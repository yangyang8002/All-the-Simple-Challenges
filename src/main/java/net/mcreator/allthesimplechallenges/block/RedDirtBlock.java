package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class RedDirtBlock extends FallingBlock {
	public static final MapCodec<RedDirtBlock> CODEC = simpleCodec(RedDirtBlock::new);

	@Override
	public MapCodec<RedDirtBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public RedDirtBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WET_GRASS).strength(1f, 20f).lightLevel(blockstate -> 2).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}
}