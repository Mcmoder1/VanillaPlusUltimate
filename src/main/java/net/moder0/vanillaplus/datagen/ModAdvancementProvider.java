package net.moder0.vanillaplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        //AdvancementEntry metalDetector = Advancement.Builder.create()
        //        .display(new AdvancementDisplay(new ItemStack(ModItems.METAL_DETECTOR),
        //                Text.literal("Metal Detective"), Text.literal("Comes with a 10 day warranty!"),
        //                new Identifier(VanillaPlus.MOD_ID, "block/silver_block"), AdvancementFrame.GOAL,
        //                true, true, false))
        //        .criterion("has_used_metal_detector", InventoryChangedCriterion.Conditions.items(ModItems.METAL_DETECTOR))
        //        .build(consumer, VanillaPlus.MOD_ID + ":metal_detector");
    }
}
