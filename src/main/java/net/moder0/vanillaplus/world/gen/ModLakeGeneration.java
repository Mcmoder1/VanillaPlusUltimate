package net.moder0.vanillaplus.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.moder0.vanillaplus.world.ModPlacedFeatures;

public class ModLakeGeneration {
    public static void generateLakes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.LAKES, ModPlacedFeatures.OASIS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.LAKES, ModPlacedFeatures.QUICKSAND_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.RAW_GENERATION, ModPlacedFeatures.FALLEN_LOG_PLACED_KEY);
    }
}
