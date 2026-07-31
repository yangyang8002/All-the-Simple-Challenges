package net.mcreator.allthesimplechallenges.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class RedDirtBlock extends FallingBlock {
	public static final MapCodec<RedDirtBlock> CODEC = simpleCodec(properties -> new RedDirtBlock());

	public MapCodec<RedDirtBlock> codec() {
		return CODEC;
	}

	public RedDirtBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WET_GRASS).strength(1f, 20f).lightLevel(blockstate -> 2).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}
}