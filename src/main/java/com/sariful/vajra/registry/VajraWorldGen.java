package com.sariful.vajra.registry;

import com.sariful.vajra.VajraMod;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class VajraWorldGen {
	private VajraWorldGen() {
	}

	public static final ResourceKey<PlacedFeature> VAJRA_ORE_PLACED =
			ResourceKey.create(Registries.PLACED_FEATURE, VajraMod.id("vajra_ore"));

	public static void register() {
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				VAJRA_ORE_PLACED
		);
	}
}
