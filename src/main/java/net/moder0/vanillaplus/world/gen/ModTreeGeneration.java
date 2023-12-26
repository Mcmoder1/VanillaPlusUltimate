package net.moder0.vanillaplus.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.moder0.vanillaplus.world.ModPlacedFeatures;

public class ModTreeGeneration {

    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_PLACED_KEY);
    }

}
