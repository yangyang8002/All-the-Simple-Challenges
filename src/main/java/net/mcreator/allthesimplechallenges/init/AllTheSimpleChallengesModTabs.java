/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allthesimplechallenges.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.allthesimplechallenges.AllTheSimpleChallengesMod;

@EventBusSubscriber
public class AllTheSimpleChallengesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllTheSimpleChallengesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUSTOM_ATS = REGISTRY.register("custom_ats",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.all_the_simple_challenges.custom_ats")).icon(() -> new ItemStack(AllTheSimpleChallengesModItems.ALLTHESIMPLE_CORE.get())).displayItems((parameters, tabData) -> {
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
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUSTOM_ATS_BLOCKS = REGISTRY.register("custom_ats_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.all_the_simple_challenges.custom_ats_blocks")).icon(() -> new ItemStack(AllTheSimpleChallengesModBlocks.RED_DIRT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllTheSimpleChallengesModBlocks.RED_LIGHT.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RED_DIRT.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.REDLIGHT_BLOCK.get().asItem());
			}).withTabsBefore(CUSTOM_ATS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUSTOM_ATS_FOOD = REGISTRY.register("custom_ats_food", () -> CreativeModeTab.builder().title(Component.translatable("item_group.all_the_simple_challenges.custom_ats_food"))
			.icon(() -> new ItemStack(AllTheSimpleChallengesModItems.ENCHANTEDGOLDENAPPLEFRAGMENT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllTheSimpleChallengesModItems.RAWBREAD.get());
				tabData.accept(AllTheSimpleChallengesModItems.ENCHANTEDGOLDENAPPLEFRAGMENT.get());
				tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEBREADORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATECARROTORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEENCHANTEDGOLDENAPPLEORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEGOLDENCARROTORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEPOTATOORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.APPLEORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.BREADORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.CARROTORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.CHORUSFRUITORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.GOLDENCARROTORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.POTATOORE.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.BAKEDBREADBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.BAKEDPOTATOBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.POPPEDCHORUSFRUITBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWAPPLEBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWBREADBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWCARROTBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWCHORUSFRUITBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWPOISONOUSPOTATOBLOCK.get().asItem());
				tabData.accept(AllTheSimpleChallengesModBlocks.RAWPOTATOBLOCK.get().asItem());
			}).withTabsBefore(CUSTOM_ATS_BLOCKS.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AllTheSimpleChallengesModItems.RAWBREAD.get());
			tabData.accept(AllTheSimpleChallengesModItems.ENCHANTEDGOLDENAPPLEFRAGMENT.get());
			tabData.accept(AllTheSimpleChallengesModBlocks.BAKEDBREADBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.BAKEDPOTATOBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.POPPEDCHORUSFRUITBLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEBREADORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATECARROTORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEENCHANTEDGOLDENAPPLEORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEGOLDENCARROTORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.DEEPSLATEPOTATOORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.APPLEORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.BREADORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.CARROTORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.CHORUSFRUITORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.GOLDENCARROTORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.POTATOORE.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWAPPLEBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWBREADBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWCARROTBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWCHORUSFRUITBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWPOISONOUSPOTATOBLOCK.get().asItem());
			tabData.accept(AllTheSimpleChallengesModBlocks.RAWPOTATOBLOCK.get().asItem());
		}
	}
}