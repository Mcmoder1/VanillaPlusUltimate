package net.moder0.vanillaplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.moder0.vanillaplus.block.ModBlocks;

public class ModItemGroup {

    public static void registerItemGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
            entries.add(ModBlocks.RED_CONCRETE_STAIRS);
            entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
            entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
            entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
            entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
            entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
            entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
            entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
            entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
            entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
            entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
            entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
            entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);

            entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
            entries.add(ModBlocks.RED_CONCRETE_SLAB);
            entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
            entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
            entries.add(ModBlocks.LIME_CONCRETE_SLAB);
            entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
            entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
            entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
            entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
            entries.add(ModBlocks.PINK_CONCRETE_SLAB);
            entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
            entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
            entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
            entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
            entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);

            entries.add(ModBlocks.WHITE_CONCRETE_WALL);
            entries.add(ModBlocks.RED_CONCRETE_WALL);
            entries.add(ModBlocks.ORANGE_CONCRETE_WALL);
            entries.add(ModBlocks.YELLOW_CONCRETE_WALL);
            entries.add(ModBlocks.LIME_CONCRETE_WALL);
            entries.add(ModBlocks.GREEN_CONCRETE_WALL);
            entries.add(ModBlocks.BLUE_CONCRETE_WALL);
            entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
            entries.add(ModBlocks.CYAN_CONCRETE_WALL);
            entries.add(ModBlocks.PURPLE_CONCRETE_WALL);
            entries.add(ModBlocks.PINK_CONCRETE_WALL);
            entries.add(ModBlocks.MAGENTA_CONCRETE_WALL);
            entries.add(ModBlocks.BLACK_CONCRETE_WALL);
            entries.add(ModBlocks.BROWN_CONCRETE_WALL);
            entries.add(ModBlocks.GRAY_CONCRETE_WALL);
            entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

            entries.add(ModBlocks.PALM_LOG);
            entries.add(ModBlocks.PALM_WOOD);
            entries.add(ModBlocks.STRIPPED_PALM_LOG);
            entries.add(ModBlocks.STRIPPED_PALM_WOOD);
            entries.add(ModBlocks.PALM_PLANKS);
            entries.add(ModBlocks.PALM_STAIRS);
            entries.add(ModBlocks.PALM_SLAB);
            entries.add(ModBlocks.PALM_FENCE);
            entries.add(ModBlocks.PALM_FENCE_GATE);
            entries.add(ModBlocks.PALM_DOOR);
            entries.add(ModBlocks.PALM_TRAPDOOR);
            entries.add(ModBlocks.PALM_PRESSURE_PLATE);
            entries.add(ModBlocks.PALM_BUTTON);

            entries.add(ModBlocks.SCULK_LOG);
            entries.add(ModBlocks.SCULK_WOOD);
            entries.add(ModBlocks.STRIPPED_SCULK_LOG);
            entries.add(ModBlocks.STRIPPED_SCULK_WOOD);
            entries.add(ModBlocks.SCULK_PLANKS);
            entries.add(ModBlocks.SCULK_STAIRS);
            entries.add(ModBlocks.SCULK_SLAB);
            entries.add(ModBlocks.SCULK_FENCE);
            entries.add(ModBlocks.SCULK_FENCE_GATE);
            entries.add(ModBlocks.SCULK_DOOR);
            entries.add(ModBlocks.SCULK_TRAPDOOR);
            entries.add(ModBlocks.SCULK_PRESSURE_PLATE);
            entries.add(ModBlocks.SCULK_BUTTON);

            entries.add(ModBlocks.ANDESITE_BRICKS);
            entries.add(ModBlocks.GRANITE_BRICKS);
            entries.add(ModBlocks.DIORITE_BRICKS);
            entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
            entries.add(ModBlocks.GRANITE_BRICK_SLAB);
            entries.add(ModBlocks.DIORITE_BRICK_SLAB);
            entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
            entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
            entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
            entries.add(ModBlocks.ANDESITE_BRICK_WALL);
            entries.add(ModBlocks.GRANITE_BRICK_WALL);
            entries.add(ModBlocks.DIORITE_BRICK_WALL);

            entries.add(ModBlocks.SILVER_BLOCK);

            entries.add(ModBlocks.NETHER_BRICK_FENCE_GATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.CHERRIES);
            entries.add(ModItems.COCONUT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.SILVER_ORE);
            entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
            entries.add(ModBlocks.RAW_SILVER_BLOCK);
            entries.add(ModBlocks.SOUL_JACK_O_LANTERN);
            entries.add(ModBlocks.PALM_LOG);
            entries.add(ModBlocks.SCULK_LOG);
            entries.add(ModBlocks.PALM_LEAVES);
            entries.add(ModBlocks.SCULK_LEAVES);
            entries.add(ModBlocks.PALM_SAPLING);
            entries.add(ModBlocks.SCULK_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.RAW_SILVER);
            entries.add(ModItems.SILVER_INGOT);
            entries.add(ModItems.SILVER_NUGGET);
            entries.add(ModItems.WARDEN_HEART);
            entries.add(ModItems.WARDEN_SKIN);
            entries.add(ModItems.KEY);
            entries.add(ModItems.ACTIVATED_KEY);
            entries.add(ModItems.SCULK_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
        //silver
            entries.add(ModItems.SILVER_SHOVEL);
            entries.add(ModItems.SILVER_PICKAXE);
            entries.add(ModItems.SILVER_AXE);
            entries.add(ModItems.SILVER_HOE);
        //copper
            entries.add(ModItems.COPPER_SHOVEL);
            entries.add(ModItems.COPPER_PICKAXE);
            entries.add(ModItems.COPPER_AXE);
            entries.add(ModItems.COPPER_HOE);
        //amethyst
            entries.add(ModItems.AMETHYST_SHOVEL);
            entries.add(ModItems.AMETHYST_PICKAXE);
            entries.add(ModItems.AMETHYST_AXE);
            entries.add(ModItems.AMETHYST_HOE);

            entries.add(ModItems.METAL_DETECTOR);
            entries.add(ModItems.QUICKSAND_BUCKET);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
        //swords
            entries.add(ModItems.AMETHYST_SWORD);
            entries.add(ModItems.SILVER_SWORD);
            entries.add(ModItems.COPPER_SWORD);
            //silver
            entries.add(ModItems.SILVER_HELMET);
            entries.add(ModItems.SILVER_CHESTPLATE);
            entries.add(ModItems.SILVER_LEGGINGS);
            entries.add(ModItems.SILVER_BOOTS);
        //copper
            entries.add(ModItems.COPPER_HELMET);
            entries.add(ModItems.COPPER_CHESTPLATE);
            entries.add(ModItems.COPPER_LEGGINGS);
            entries.add(ModItems.COPPER_BOOTS);
        //amethyst
            entries.add(ModItems.AMETHYST_HELMET);
            entries.add(ModItems.AMETHYST_CHESTPLATE);
            entries.add(ModItems.AMETHYST_LEGGINGS);
            entries.add(ModItems.AMETHYST_BOOTS);
        //warden
            entries.add(ModItems.WARDEN_HELMET);
            entries.add(ModItems.WARDEN_CHESTPLATE);
            entries.add(ModItems.WARDEN_LEGGINGS);
            entries.add(ModItems.WARDEN_BOOTS);
        //warden_skin
            entries.add(ModItems.WARDEN_SKIN_HELMET);
            entries.add(ModItems.WARDEN_SKIN_CHESTPLATE);
            entries.add(ModItems.WARDEN_SKIN_LEGGINGS);
            entries.add(ModItems.WARDEN_SKIN_BOOTS);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.MINING_BENCH);
            entries.add(ModBlocks.USABLE_BEEHIVE);
            entries.add(ModItems.PALM_SIGN);
            entries.add(ModItems.HANGING_PALM_SIGN);
            entries.add(ModItems.SCULK_SIGN);
            entries.add(ModItems.HANGING_SCULK_SIGN);
            entries.add(ModItems.PALM_BOAT);
            entries.add(ModItems.PALM_CHEST_BOAT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(ModItems.SCULK_ZOMBIE_SPAWN_EGG);
            entries.add(ModItems.SENTRY_SPAWN_EGG);
        });
    }
}
