package net.moder0.vanillaplus.world.gen;

public class ModWorldGeneration {

    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
        ModLakeGeneration.generateLakes();
    }
}
