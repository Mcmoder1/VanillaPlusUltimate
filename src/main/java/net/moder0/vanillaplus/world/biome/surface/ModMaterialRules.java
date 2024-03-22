package net.moder0.vanillaplus.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.moder0.vanillaplus.world.biome.ModBiomes;

public class ModMaterialRules {

    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.SCULK);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.SCULK);
    private static final MaterialRules.MaterialRule SCULK = makeStateRule(Blocks.SCULK);
    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-10, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.DEEP_DARK_WASTELAND),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, DIRT)),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, DIRT)),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30, DIRT),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

}
