/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allthesimplechallenges.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.allthesimplechallenges.item.PrimaryCoreItem;
import net.mcreator.allthesimplechallenges.item.NetheritenetherstarItem;
import net.mcreator.allthesimplechallenges.item.AllthesimpleCoreItem;
import net.mcreator.allthesimplechallenges.AllTheSimpleChallengesMod;

public class AllTheSimpleChallengesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AllTheSimpleChallengesMod.MODID);
	public static final DeferredItem<Item> COBBLESTONE_9 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_9);
	public static final DeferredItem<Item> COBBLESTONE_8 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_8);
	public static final DeferredItem<Item> COBBLESTONE_7 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_7);
	public static final DeferredItem<Item> COBBLESTONE_6 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_6);
	public static final DeferredItem<Item> COBBLESTONE_5 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_5);
	public static final DeferredItem<Item> COBBLESTONE_4 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_4);
	public static final DeferredItem<Item> COBBLESTONE_3 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_3);
	public static final DeferredItem<Item> COBBLESTONE_2 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_2);
	public static final DeferredItem<Item> COBBLESTONE_1 = block(AllTheSimpleChallengesModBlocks.COBBLESTONE_1);
	public static final DeferredItem<Item> DIAMONDBLOCK_1 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_1);
	public static final DeferredItem<Item> DIAMONDBLOCK_2 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_2);
	public static final DeferredItem<Item> DIAMONDBLOCK_3 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_3);
	public static final DeferredItem<Item> DIAMONDBLOCK_4 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_4);
	public static final DeferredItem<Item> DIAMONDBLOCK_5 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_5);
	public static final DeferredItem<Item> DIAMONDBLOCK_6 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_6);
	public static final DeferredItem<Item> DIAMONDBLOCK_7 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_7);
	public static final DeferredItem<Item> DIAMONDBLOCK_8 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_8);
	public static final DeferredItem<Item> DIAMONDBLOCK_9 = block(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_9);
	public static final DeferredItem<Item> NETHERITENETHERSTAR = REGISTRY.register("netheritenetherstar", NetheritenetherstarItem::new);
	public static final DeferredItem<Item> PRIMARY_CORE = REGISTRY.register("primary_core", PrimaryCoreItem::new);
	public static final DeferredItem<Item> ALLTHESIMPLE_CORE = REGISTRY.register("allthesimple_core", AllthesimpleCoreItem::new);
	public static final DeferredItem<Item> RED_LIGHT = block(AllTheSimpleChallengesModBlocks.RED_LIGHT);
	public static final DeferredItem<Item> RED_DIRT = block(AllTheSimpleChallengesModBlocks.RED_DIRT);
	public static final DeferredItem<Item> REDLIGHT_BLOCK = block(AllTheSimpleChallengesModBlocks.REDLIGHT_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}