package net.moder0.vanillaplus.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.effect.ModEffects;

public class ModPotions {

    public static final Potion SCULK_POTION = registerPotion("sculk_potion",
            new Potion(new StatusEffectInstance(ModEffects.SCULK, 200, 0)));

    private static Potion registerPotion(String name, Potion potion){
        return Registry.register(Registries.POTION, new Identifier(VanillaPlus.MOD_ID, name), potion);
    }

    public static void registerModPotions(){
        VanillaPlus.LOGGER.info("registering mod potions for " + VanillaPlus.MOD_ID);
    }

}
