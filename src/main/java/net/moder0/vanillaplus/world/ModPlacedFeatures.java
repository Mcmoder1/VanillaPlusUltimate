package net.moder0.vanillaplus.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registryKey("silver_ore_placed");
    public static final RegistryKey<PlacedFeature> PALM_PLACED_KEY = registryKey("palm_placed");
    public static final RegistryKey<PlacedFeature> OASIS_PLACED_KEY = registryKey("oasis_placed");
    public static final RegistryKey<PlacedFeature> QUICKSAND_PLACED_KEY = registryKey("quicksand_placed");
    public static final RegistryKey<PlacedFeature> FALLEN_LOG_PLACED_KEY = registryKey("fallen_log_placed");

    public static void bootstrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(20, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(52))));

        register(context, OASIS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OASIS_KEY),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP);

        register(context, QUICKSAND_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.QUICKSAND_KEY),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP);

        register(context, PALM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PALM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1),
                        ModBlocks.PALM_SAPLING));
        register(context, FALLEN_LOG_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.FALLEN_LOG_KEY),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP);
    }

    public static RegistryKey<PlacedFeature> registryKey(String name){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(VanillaPlus.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers){
        register(context, key, configuration, List.of(modifiers));
    }

}
