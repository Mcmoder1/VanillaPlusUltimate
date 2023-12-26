package net.moder0.vanillaplus.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.block.ModBlocks;
import net.moder0.vanillaplus.item.ModItems;

public class ModBoats {

    public static final Identifier PALM_BOAT_ID = new Identifier(VanillaPlus.MOD_ID, "palm_boat");
    public static final Identifier PALM_CHEST_BOAT_ID = new Identifier(VanillaPlus.MOD_ID, "palm_chest_boat");

    public static final RegistryKey<TerraformBoatType> PALM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALM_BOAT_ID);

    public static void registerBoats(){
        TerraformBoatType palmBoat = new TerraformBoatType.Builder()
                .item(ModItems.PALM_BOAT)
                .chestItem(ModItems.PALM_CHEST_BOAT)
                .planks(ModBlocks.PALM_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE,PALM_BOAT_KEY, palmBoat);
    }
}
