/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allthesimplechallenges.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.allthesimplechallenges.AllTheSimpleChallengesMod;

public class AllTheSimpleChallengesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllTheSimpleChallengesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUSTOM_ATS = REGISTRY.register("custom_ats",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.all_the_simple_challenges.custom_ats")).icon(() -> new ItemStack(Blocks.TARGET)).displayItems((parameters, tabData) -> {
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_9.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_8.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_7.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_6.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_5.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_4.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_3.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_2.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.COBBLESTONE_1.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_1.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_2.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_3.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_4.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_5.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_6.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_7.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_8.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DIAMONDBLOCK_9.get().asItem());
				tabData.accept(AllTheSimpleChallengesModItems.NETHERITENETHERSTAR.get());
				tabData.accept(AllTheSimpleChallengesModItems.PRIMARY_CORE.get());
				tabData.accept(AllTheSimpleChallengesModItems.ALLTHESIMPLE_CORE.get());
			}).build());
}