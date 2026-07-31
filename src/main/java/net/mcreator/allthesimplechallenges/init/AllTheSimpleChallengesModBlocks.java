/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allthesimplechallenges.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.allthesimplechallenges.block.*;
import net.mcreator.allthesimplechallenges.AllTheSimpleChallengesMod;

import java.util.function.Function;

public class AllTheSimpleChallengesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AllTheSimpleChallengesMod.MODID);
	public static final DeferredBlock<Block> COBBLESTONE_9;
	public static final DeferredBlock<Block> COBBLESTONE_8;
	public static final DeferredBlock<Block> COBBLESTONE_7;
	public static final DeferredBlock<Block> COBBLESTONE_6;
	public static final DeferredBlock<Block> COBBLESTONE_5;
	public static final DeferredBlock<Block> COBBLESTONE_4;
	public static final DeferredBlock<Block> COBBLESTONE_3;
	public static final DeferredBlock<Block> COBBLESTONE_2;
	public static final DeferredBlock<Block> COBBLESTONE_1;
	public static final DeferredBlock<Block> DIAMONDBLOCK_1;
	public static final DeferredBlock<Block> DIAMONDBLOCK_2;
	public static final DeferredBlock<Block> DIAMONDBLOCK_3;
	public static final DeferredBlock<Block> DIAMONDBLOCK_4;
	public static final DeferredBlock<Block> DIAMONDBLOCK_5;
	public static final DeferredBlock<Block> DIAMONDBLOCK_6;
	public static final DeferredBlock<Block> DIAMONDBLOCK_7;
	public static final DeferredBlock<Block> DIAMONDBLOCK_8;
	public static final DeferredBlock<Block> DIAMONDBLOCK_9;
	public static final DeferredBlock<Block> RED_LIGHT;
	public static final DeferredBlock<Block> RED_DIRT;
	public static final DeferredBlock<Block> REDLIGHT_BLOCK;
	public static final DeferredBlock<Block> DEEPSLATEBREADORE;
	public static final DeferredBlock<Block> DEEPSLATECARROTORE;
	public static final DeferredBlock<Block> DEEPSLATEENCHANTEDGOLDENAPPLEORE;
	public static final DeferredBlock<Block> DEEPSLATEGOLDENCARROTORE;
	public static final DeferredBlock<Block> DEEPSLATEPOTATOORE;
	public static final DeferredBlock<Block> APPLEORE;
	public static final DeferredBlock<Block> BREADORE;
	public static final DeferredBlock<Block> CARROTORE;
	public static final DeferredBlock<Block> CHORUSFRUITORE;
	public static final DeferredBlock<Block> GOLDENCARROTORE;
	public static final DeferredBlock<Block> POTATOORE;
	public static final DeferredBlock<Block> BAKEDBREADBLOCK;
	public static final DeferredBlock<Block> BAKEDPOTATOBLOCK;
	public static final DeferredBlock<Block> POPPEDCHORUSFRUITBLOCK;
	public static final DeferredBlock<Block> RAWAPPLEBLOCK;
	public static final DeferredBlock<Block> RAWBREADBLOCK;
	public static final DeferredBlock<Block> RAWCARROTBLOCK;
	public static final DeferredBlock<Block> RAWCHORUSFRUITBLOCK;
	public static final DeferredBlock<Block> RAWPOISONOUSPOTATOBLOCK;
	public static final DeferredBlock<Block> RAWPOTATOBLOCK;
	static {
		COBBLESTONE_9 = register("cobblestone_9", Cobblestone9Block::new);
		COBBLESTONE_8 = register("cobblestone_8", Cobblestone8Block::new);
		COBBLESTONE_7 = register("cobblestone_7", Cobblestone7Block::new);
		COBBLESTONE_6 = register("cobblestone_6", Cobblestone6Block::new);
		COBBLESTONE_5 = register("cobblestone_5", Cobblestone5Block::new);
		COBBLESTONE_4 = register("cobblestone_4", Cobblestone4Block::new);
		COBBLESTONE_3 = register("cobblestone_3", Cobblestone3Block::new);
		COBBLESTONE_2 = register("cobblestone_2", Cobblestone2Block::new);
		COBBLESTONE_1 = register("cobblestone_1", Cobblestone1Block::new);
		DIAMONDBLOCK_1 = register("diamondblock_1", Diamondblock1Block::new);
		DIAMONDBLOCK_2 = register("diamondblock_2", Diamondblock2Block::new);
		DIAMONDBLOCK_3 = register("diamondblock_3", Diamondblock3Block::new);
		DIAMONDBLOCK_4 = register("diamondblock_4", Diamondblock4Block::new);
		DIAMONDBLOCK_5 = register("diamondblock_5", Diamondblock5Block::new);
		DIAMONDBLOCK_6 = register("diamondblock_6", Diamondblock6Block::new);
		DIAMONDBLOCK_7 = register("diamondblock_7", Diamondblock7Block::new);
		DIAMONDBLOCK_8 = register("diamondblock_8", Diamondblock8Block::new);
		DIAMONDBLOCK_9 = register("diamondblock_9", Diamondblock9Block::new);
		RED_LIGHT = register("red_light", RedLightBlock::new);
		RED_DIRT = register("red_dirt", RedDirtBlock::new);
		REDLIGHT_BLOCK = register("redlight_block", RedlightBlockBlock::new);
		DEEPSLATEBREADORE = register("deepslatebreadore", DeepslatebreadoreBlock::new);
		DEEPSLATECARROTORE = register("deepslatecarrotore", DeepslatecarrotoreBlock::new);
		DEEPSLATEENCHANTEDGOLDENAPPLEORE = register("deepslateenchantedgoldenappleore", DeepslateenchantedgoldenappleoreBlock::new);
		DEEPSLATEGOLDENCARROTORE = register("deepslategoldencarrotore", DeepslategoldencarrotoreBlock::new);
		DEEPSLATEPOTATOORE = register("deepslatepotatoore", DeepslatepotatooreBlock::new);
		APPLEORE = register("appleore", AppleoreBlock::new);
		BREADORE = register("breadore", BreadoreBlock::new);
		CARROTORE = register("carrotore", CarrotoreBlock::new);
		CHORUSFRUITORE = register("chorusfruitore", ChorusfruitoreBlock::new);
		GOLDENCARROTORE = register("goldencarrotore", GoldencarrotoreBlock::new);
		POTATOORE = register("potatoore", PotatooreBlock::new);
		BAKEDBREADBLOCK = register("bakedbreadblock", BakedbreadblockBlock::new);
		BAKEDPOTATOBLOCK = register("bakedpotatoblock", BakedpotatoblockBlock::new);
		POPPEDCHORUSFRUITBLOCK = register("poppedchorusfruitblock", PoppedchorusfruitblockBlock::new);
		RAWAPPLEBLOCK = register("rawappleblock", RawappleblockBlock::new);
		RAWBREADBLOCK = register("rawbreadblock", RawbreadblockBlock::new);
		RAWCARROTBLOCK = register("rawcarrotblock", RawcarrotblockBlock::new);
		RAWCHORUSFRUITBLOCK = register("rawchorusfruitblock", RawchorusfruitblockBlock::new);
		RAWPOISONOUSPOTATOBLOCK = register("rawpoisonouspotatoblock", RawpoisonousblockBlock::new);
		RAWPOTATOBLOCK = register("rawpotatoblock", RawpotatoblockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}