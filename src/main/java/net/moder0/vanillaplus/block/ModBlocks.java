package net.moder0.vanillaplus.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.moder0.vanillaplus.VanillaPlus;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.block.custom.PalmSapling;
import net.moder0.vanillaplus.block.custom.Quicksand;
import net.moder0.vanillaplus.world.tree.PalmSaplingGenerator;


public class ModBlocks {
//-----------------------------------------------------------------------------

    //silver group

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.0f).requiresTool()));

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.5f).requiresTool()));

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0f).requiresTool()));

    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).strength(5.0f).requiresTool()));

    //misc

    public static final Block SOUL_JACK_O_LANTERN = registerBlock("soul_jack_o_lantern",
            new CarvedPumpkinBlock(FabricBlockSettings.copyOf(Blocks.JACK_O_LANTERN).strength(1.0f).luminance(state -> 15).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block QUICKSAND = registerBlock("quicksand",
            new Quicksand(FabricBlockSettings.copyOf(Blocks.POWDER_SNOW).strength(0.25f).requiresTool().sounds(BlockSoundGroup.SAND).suffocates(Blocks::always)));

    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).strength(2f).sounds(BlockSoundGroup.NETHER_BRICKS), WoodType.WARPED));

    //workbenches

    public static final Block USABLE_BEEHIVE = registerBlock("usable_beehive",
            new BeehiveBlock(FabricBlockSettings.copyOf(Blocks.BEEHIVE).strength(0.6f).burnable()));

    public static final Block MINING_BENCH = registerBlock("mining_bench",
            new Block(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)));

    //bricks

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(DIORITE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ANDESITE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(GRANITE_BRICKS).strength(1.5f).requiresTool()));

    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).strength(1.5f).requiresTool()));

    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).strength(1.5f).requiresTool()));

    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).strength(1.5f).requiresTool()));

    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).strength(1.5f).requiresTool()));

    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).strength(1.5f).requiresTool()));

    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).strength(1.5f).requiresTool()));

    //palm wood group

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));

    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new PalmSapling(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_PALM_SAPLING = Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, "potted_palm_sapling"),
            new FlowerPotBlock(PALM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));


    //sign textures
    public static final Identifier PALM_SIGN_TEXTURE = new Identifier(VanillaPlus.MOD_ID, "entity/signs/palm");
    public static final Identifier PALM_HANGING_SIGN_TEXTURE = new Identifier(VanillaPlus.MOD_ID, "entity/signs/hanging/palm");
    public static final Identifier PALM_HANGING_GUI_SIGN_TEXTURE = new Identifier(VanillaPlus.MOD_ID, "textures/gui/hanging_signs/palm");

    public static final Block STANDING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, "palm_standing_sign"),
            new TerraformSignBlock(PALM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, "palm_wall_sign"),
            new TerraformWallSignBlock(PALM_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, "palm_hanging_sign"),
            new TerraformHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_PALM_SIGN = Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, "palm_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(PALM_HANGING_SIGN_TEXTURE, PALM_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily PALM_FAMILY = BlockFamilies.register(ModBlocks.PALM_PLANKS)
            .sign(ModBlocks.STANDING_PALM_SIGN, ModBlocks.WALL_PALM_SIGN)
            .slab(ModBlocks.PALM_SLAB)
            .stairs(ModBlocks.PALM_STAIRS)
            .fence(ModBlocks.PALM_FENCE)
            .fenceGate(ModBlocks.PALM_FENCE_GATE)
            .button(ModBlocks.PALM_BUTTON)
            .pressurePlate(ModBlocks.PALM_PRESSURE_PLATE)
            .door(ModBlocks.PALM_DOOR)
            .trapdoor(ModBlocks.PALM_TRAPDOOR)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).strength(2f)));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).strength(2f)));

    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).strength(2f), WoodType.OAK));

    public static final Block PALM_DOOR = registerBlock("palm_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR).strength(3f), BlockSetType.OAK));

    public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).strength(3f), BlockSetType.OAK));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).strength(2f), BlockSetType.OAK, 15, true));

    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).strength(2f)));

    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).strength(0.5f), BlockSetType.OAK));




//concrete
    //stairs
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
        new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).strength(1.8f)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
        new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.RED_CONCRETE).strength(1.8f)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
        new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE).strength(1.8f)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
        new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE).strength(1.8f)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
        new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE).strength(1.8f)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
        new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE).strength(1.8f)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
        new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE).strength(1.8f)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
        new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
        new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE).strength(1.8f)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
        new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE).strength(1.8f)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
        new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).strength(1.8f)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
        new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE).strength(1.8f)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
        new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE).strength(1.8f)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
        new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
        new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE).strength(1.8f)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
        new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE).strength(1.8f)));

    //slabs
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).strength(1.8f)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE).strength(1.8f)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE).strength(1.8f)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE).strength(1.8f)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE).strength(1.8f)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE).strength(1.8f)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE).strength(1.8f)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE).strength(1.8f)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE).strength(1.8f)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).strength(1.8f)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE).strength(1.8f)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE).strength(1.8f)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE).strength(1.8f)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE).strength(1.8f)));

    //walls
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).strength(1.8f)));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE).strength(1.8f)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE).strength(1.8f)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE).strength(1.8f)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE).strength(1.8f)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE).strength(1.8f)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE).strength(1.8f)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE).strength(1.8f)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE).strength(1.8f)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE).strength(1.8f)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE).strength(1.8f)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE).strength(1.8f)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE).strength(1.8f)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE).strength(1.8f)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE).strength(1.8f).strength(1.8f)));


    //-----------------------------------------------------------------------------
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        Item item = Registry.register(Registries.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks(){
        VanillaPlus.LOGGER.info("registering mod blocks for " + VanillaPlus.MOD_ID);
    }
}