/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allthesimplechallenges.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.allthesimplechallenges.item.RawbreadItem;
import net.mcreator.allthesimplechallenges.item.PrimaryCoreItem;
import net.mcreator.allthesimplechallenges.item.NetheritenetherstarItem;
import net.mcreator.allthesimplechallenges.item.EnchantedgoldenapplefragmentItem;
import net.mcreator.allthesimplechallenges.item.AllthesimpleCoreItem;
import net.mcreator.allthesimplechallenges.AllTheSimpleChallengesMod;

public class AllTheSimpleChallengesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AllTheSimpleChallengesMod.MODID);
	public static final DeferredItem<Item> COBBLESTONE_9;
	public static final DeferredItem<Item> COBBLESTONE_8;
	public static final DeferredItem<Item> COBBLESTONE_7;
	public static final DeferredItem<Item> COBBLESTONE_6;
	public static final DeferredItem<Item> COBBLESTONE_5;
	public static final DeferredItem<Item> COBBLESTONE_4;
	public static final DeferredItem<Item> COBBLESTONE_3;
	public static final DeferredItem<Item> COBBLESTONE_2;
	public static final DeferredItem<Item> COBBLESTONE_1;
	public static final DeferredItem<Item> DIAMONDBLOCK_1;
	public static final DeferredItem<Item> DIAMONDBLOCK_2;
	public static final DeferredItem<Item> DIAMONDBLOCK_3;
	public static final DeferredItem<Item> DIAMONDBLOCK_4;
	public static final DeferredItem<Item> DIAMONDBLOCK_5;
	public static final DeferredItem<Item> DIAMONDBLOCK_6;
	public static final DeferredItem<Item> DIAMONDBLOCK_7;
	public static final DeferredItem<Item> DIAMONDBLOCK_8;
	public static final DeferredItem<Item> DIAMONDBLOCK_9;
	public static final DeferredItem<Item> NETHERITENETHERSTAR;
	public static final DeferredItem<Item> PRIMARY_CORE;
	public static final DeferredItem<Item> ALLTHESIMPLE_CORE;
	public static final DeferredItem<Item> RED_LIGHT;
	public static final DeferredItem<Item> RED_DIRT;
	public static final DeferredItem<Item> REDLIGHT_BLOCK;
	public static final DeferredItem<Item> RAWBREAD;
	public static final DeferredItem<Item> ENCHANTEDGOLDENAPPLEFRAGMENT;
	public static final DeferredItem<Item> DEEPSLATEBREADORE;
	public static final DeferredItem<Item> DEEPSLATECARROTORE;
	public static final DeferredItem<Item> DEEPSLATEENCHANTEDGOLDENAPPLEORE;
	public static final DeferredItem<Item> DEEPSLATEGOLDENCARROTORE;
	public static final DeferredItem<Item> DEEPSLATEPOTATOORE;
	public static final DeferredItem<Item> APPLEORE;
	public static final DeferredItem<Item> BREADORE;
	public static final DeferredItem<Item> CARROTORE;
	public static final DeferredItem<Item> CHORUSFRUITORE;
	public static final DeferredItem<Item> GOLDENCARROTORE;
	public static final DeferredItem<Item> POTATOORE;
	public static final DeferredItem<Item> BAKEDBREADBLOCK;
	public static final DeferredItem<Item> BAKEDPOTATOBLOCK;
	public static final DeferredItem<Item> POPPEDCHORUSFRUITBLOCK;
	public static final DeferredItem<Item> RAWAPPLEBLOCK;
	public static final DeferredItem<Item> RAWBREADBLOCK;
	public static final DeferredItem<Item> RAWCARROTBLOCK;
	public static final DeferredItem<Item> RAWCHORUSFRUITBLOCK;
	public static final DeferredItem<Item> RAWPOISONOUSPOTATOBLOCK;
	public static final DeferredItem<Item> RAWPOTATOBLOCK;
	static {
		COBBLESTONE_9 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_9);
		COBBLESTONE_8 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_8);
		COBBLESTONE_7 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_7);
		COBBLESTONE_6 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_6);
		COBBLESTONE_5 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_5);
		COBBLESTONE_4 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_4);
		COBBLESTONE_3 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_3);
		COBBLESTONE_2 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_2);
		COBBLESTONE_1 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_1);
		DIAMONDBLOCK_1 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_1);
		DIAMONDBLOCK_2 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_2);
		DIAMONDBLOCK_3 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_3);
		DIAMONDBLOCK_4 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_4);
		DIAMONDBLOCK_5 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_5);
		DIAMONDBLOCK_6 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_6);
		DIAMONDBLOCK_7 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_7);
		DIAMONDBLOCK_8 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_8);
		DIAMONDBLOCK_9 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_9);
		NETHERITENETHERSTAR = REGISTRY.register("netheritenetherstar", NetheritenetherstarItem::new);
		PRIMARY_CORE = REGISTRY.register("primary_core", PrimaryCoreItem::new);
		ALLTHESIMPLE_CORE = REGISTRY.register("allthesimple_core", AllthesimpleCoreItem::new);
		RED_LIGHT = block(AllTheSimpleChallengesModBlocks.RED_LIGHT);
		RED_DIRT = block(AllTheSimpleChallengesModBlocks.RED_DIRT);
		REDLIGHT_BLOCK = block(AllTheSimpleChallengesModBlocks.REDLIGHT_BLOCK);
		RAWBREAD = REGISTRY.register("rawbread", RawbreadItem::new);
		ENCHANTEDGOLDENAPPLEFRAGMENT = REGISTRY.register("enchantedgoldenapplefragment", EnchantedgoldenapplefragmentItem::new);
		DEEPSLATEBREADORE = block(AllTheSimpleChallengesModBlocks.DEEPSLATEBREADORE);
		DEEPSLATECARROTORE = block(AllTheSimpleChallengesModBlocks.DEEPSLATECARROTORE);
		DEEPSLATEENCHANTEDGOLDENAPPLEORE = block(AllTheSimpleChallengesModBlocks.DEEPSLATEENCHANTEDGOLDENAPPLEORE, new Item.Properties().rarity(Rarity.RARE));
		DEEPSLATEGOLDENCARROTORE = block(AllTheSimpleChallengesModBlocks.DEEPSLATEGOLDENCARROTORE);
		DEEPSLATEPOTATOORE = block(AllTheSimpleChallengesModBlocks.DEEPSLATEPOTATOORE);
		APPLEORE = block(AllTheSimpleChallengesModBlocks.APPLEORE);
		BREADORE = block(AllTheSimpleChallengesModBlocks.BREADORE);
		CARROTORE = block(AllTheSimpleChallengesModBlocks.CARROTORE);
		CHORUSFRUITORE = block(AllTheSimpleChallengesModBlocks.CHORUSFRUITORE);
		GOLDENCARROTORE = block(AllTheSimpleChallengesModBlocks.GOLDENCARROTORE);
		POTATOORE = block(AllTheSimpleChallengesModBlocks.POTATOORE);
		BAKEDBREADBLOCK = block(AllTheSimpleChallengesModBlocks.BAKEDBREADBLOCK);
		BAKEDPOTATOBLOCK = block(AllTheSimpleChallengesModBlocks.BAKEDPOTATOBLOCK);
		POPPEDCHORUSFRUITBLOCK = block(AllTheSimpleChallengesModBlocks.POPPEDCHORUSFRUITBLOCK);
		RAWAPPLEBLOCK = block(AllTheSimpleChallengesModBlocks.RAWAPPLEBLOCK);
		RAWBREADBLOCK = block(AllTheSimpleChallengesModBlocks.RAWBREADBLOCK);
		RAWCARROTBLOCK = block(AllTheSimpleChallengesModBlocks.RAWCARROTBLOCK);
		RAWCHORUSFRUITBLOCK = block(AllTheSimpleChallengesModBlocks.RAWCHORUSFRUITBLOCK);
		RAWPOISONOUSPOTATOBLOCK = block(AllTheSimpleChallengesModBlocks.RAWPOISONOUSPOTATOBLOCK);
		RAWPOTATOBLOCK = block(AllTheSimpleChallengesModBlocks.RAWPOTATOBLOCK);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}