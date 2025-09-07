package net.mcreator.allthesimplechallenges.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.allthesimplechallenges.init.AllTheSimpleChallengesModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements AllTheSimpleChallengesModBiomes.AllTheSimpleChallengesModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> all_the_simple_challenges_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.all_the_simple_challenges_dimensionTypeReference != null) {
			retval = AllTheSimpleChallengesModBiomes.adaptSurfaceRule(retval, this.all_the_simple_challenges_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setall_the_simple_challengesDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.all_the_simple_challenges_dimensionTypeReference = dimensionType;
	}
}