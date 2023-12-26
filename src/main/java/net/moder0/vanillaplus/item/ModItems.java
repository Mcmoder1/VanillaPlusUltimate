package net.moder0.vanillaplus.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.block.ModBlocks;
import net.moder0.vanillaplus.entity.ModBoats;
import net.moder0.vanillaplus.entity.ModEntities;
import net.moder0.vanillaplus.item.custom.MetalDetectorItem;
import net.moder0.vanillaplus.item.custom.ModAxeItem;
import net.moder0.vanillaplus.item.custom.ModHoeItem;
import net.moder0.vanillaplus.item.custom.ModPickaxeItem;

public class ModItems {
//-----------------------------------------------------------------------------------------------------

    //food

    public static final Item CHERRIES = registerItem("cherries",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(8.6f).build())));

    public static final Item COCONUT = registerItem("coconut",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(8.6f).build())));

    //silver group

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings()));

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));

    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(16)));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SilverSword(ModToolMaterials.SILVER, 3, -2.7f, new FabricItemSettings()));

    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new ModPickaxeItem(ModToolMaterials.SILVER, 1, -3.1f, new FabricItemSettings()));

    public static final Item SILVER_AXE = registerItem("silver_axe",
            new ModAxeItem(ModToolMaterials.SILVER, 6, -3.4f, new FabricItemSettings()));

    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterials.SILVER, 1.5f, -3.3f, new FabricItemSettings()));

    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new ModHoeItem(ModToolMaterials.SILVER, -2, -1.3f, new FabricItemSettings()));

    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new SilverEffects(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //copper group

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 3, -2.1f, new FabricItemSettings()));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 1, -2.5f, new FabricItemSettings()));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 6, -2.8f, new FabricItemSettings()));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.5f, -2.7f, new FabricItemSettings()));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, -2, -0.7f, new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new CopperEffects(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //amethyst

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST, 3, -2.4f, new FabricItemSettings()));

    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new ModPickaxeItem(ModToolMaterials.AMETHYST, 1, -2.8f, new FabricItemSettings()));

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new ModAxeItem(ModToolMaterials.AMETHYST, 5.0f, -3.0f, new FabricItemSettings()));

    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -3.0f, new FabricItemSettings()));

    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new ModHoeItem(ModToolMaterials.AMETHYST, -3, 0.0f, new FabricItemSettings()));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new CopperEffects(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //sign items
    public static final Item PALM_SIGN = registerItem("palm_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PALM_SIGN, ModBlocks.WALL_PALM_SIGN));

    public static final Item HANGING_PALM_SIGN = registerItem("palm_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PALM_SIGN, ModBlocks.WALL_HANGING_PALM_SIGN, new FabricItemSettings().maxCount(16)));

//deep_dark
    //misc
    public static final Item WARDEN_SKIN = registerItem("warden_skin",
            new Item(new FabricItemSettings().maxCount(16)));

    public static final Item WARDEN_HEART = registerItem("warden_heart",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item SCULK_ZOMBIE_SPAWN_EGG = registerItem("sculk_zombie_spawn_egg",
            new SpawnEggItem(ModEntities.SCULK_ZOMBIE,0x008B42,0x0055D1 , new FabricItemSettings()));

    //armor
    public static final Item WARDEN_HELMET = registerItem("warden_helmet",
            new CopperEffects(ModArmorMaterials.WARDEN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item WARDEN_CHESTPLATE = registerItem("warden_chestplate",
            new ArmorItem(ModArmorMaterials.WARDEN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item WARDEN_LEGGINGS = registerItem("warden_leggings",
            new ArmorItem(ModArmorMaterials.WARDEN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item WARDEN_BOOTS = registerItem("warden_boots",
            new ArmorItem(ModArmorMaterials.WARDEN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WARDEN_SKIN_HELMET = registerItem("warden_skin_helmet",
            new CopperEffects(ModArmorMaterials.WARDEN_SKIN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item WARDEN_SKIN_CHESTPLATE = registerItem("warden_skin_chestplate",
            new ArmorItem(ModArmorMaterials.WARDEN_SKIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item WARDEN_SKIN_LEGGINGS = registerItem("warden_skin_leggings",
            new ArmorItem(ModArmorMaterials.WARDEN_SKIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item WARDEN_SKIN_BOOTS = registerItem("warden_skin_boots",
            new ArmorItem(ModArmorMaterials.WARDEN_SKIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //misc

    public static final Item QUICKSAND_BUCKET = registerItem("quicksand_bucket",
            new PowderSnowBucketItem(ModBlocks.QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new FabricItemSettings()));

    public static final Item PALM_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_BOAT_ID, ModBoats.PALM_BOAT_KEY, false);
    public static final Item PALM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PALM_CHEST_BOAT_ID, ModBoats.PALM_BOAT_KEY, true);


//-----------------------------------------------------------------------------------------------------
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }


    public static void registerModItems(){
        VanillaPlus.LOGGER.debug("Registering items for " + VanillaPlus.MOD_ID);
    }

}
