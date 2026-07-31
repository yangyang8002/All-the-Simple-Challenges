package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class RedlightBlockBlock extends FallingBlock {
	public static final MapCodec<RedlightBlockBlock> CODEC = simpleCodec(properties -> new RedlightBlockBlock());

	public MapCodec<RedlightBlockBlock> codec() {
		return CODEC;
	}

	public RedlightBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(3f, 10f).lightLevel(blockstate -> 10).requiresCorrectToolForDrops().friction(1f).speedFactor(1.3f).jumpFactor(1.1f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 9;
	}
}