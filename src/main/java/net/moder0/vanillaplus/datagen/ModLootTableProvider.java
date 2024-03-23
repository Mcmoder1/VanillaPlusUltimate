package net.moder0.vanillaplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.moder0.vanillaplus.block.ModBlocks;
import net.moder0.vanillaplus.entity.ModEntities;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        //addDrop(ModBlocks.WALL_PALM_SIGN, drops(ModBlocks.STANDING_PALM_SIGN));
        //addDrop(ModBlocks.WALL_HANGING_PALM_SIGN, drops(ModBlocks.HANGING_PALM_SIGN));


    }
}
