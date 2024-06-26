package net.moder0.vanillaplus.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.moder0.vanillaplus.world.ModConfiguredFeatures;
import net.moder0.vanillaplus.world.ModPlacedFeatures;
import org.jetbrains.annotations.Nullable;

public class PalmSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.PALM_KEY;
    }
}
