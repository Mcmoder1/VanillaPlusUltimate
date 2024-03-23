package net.moder0.vanillaplus.world;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.BiasedToBottomIntProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registryKey("silver_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registryKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SCULK_TREE_KEY = registryKey("sculk_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OASIS_KEY = registryKey("oasis_surface");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUICKSAND_KEY = registryKey("quicksand");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FALLEN_LOG_KEY = registryKey("fallen_log");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>>context){
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldSilverOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILVER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

        register(context, SILVER_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSilverOres, 9));
        register(context, OASIS_KEY, Feature.LAKE, new LakeFeature.Config(BlockStateProvider.of(Blocks.GRASS_BLOCK), BlockStateProvider.of(Blocks.WATER)));
        register(context, QUICKSAND_KEY, Feature.LAKE, new LakeFeature.Config(BlockStateProvider.of(Blocks.SAND), BlockStateProvider.of(ModBlocks.QUICKSAND)));
        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new StraightTrunkPlacer(3, 5, 6),
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.SAND)).build()
        );
        register(context, SCULK_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.REINFORCED_DEEPSLATE),
                new MegaJungleTrunkPlacer(3, 5, 6),
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 10),
                new TwoLayersFeatureSize(1, 0, 2)).build()
        );
        register(context, FALLEN_LOG_KEY, Feature.BLOCK_COLUMN, new BlockColumnFeatureConfig(List.of(BlockColumnFeatureConfig.createLayer(BiasedToBottomIntProvider.create(1, 2), SimpleBlockStateProvider.of(Blocks.OAK_LOG))), Direction.NORTH, BlockPredicate.matchingBlocks(Blocks.AIR), false));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(VanillaPlus.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>>void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
