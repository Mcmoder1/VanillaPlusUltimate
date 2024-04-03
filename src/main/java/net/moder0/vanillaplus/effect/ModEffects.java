package net.moder0.vanillaplus.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;

public class ModEffects {

    public static final StatusEffect SCULK = registerStatusEffect("sculk",
            new SculkEffect(StatusEffectCategory.HARMFUL, 0x000242)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,"7107DE5E-7CE8-4030-940E-514C1F160890", -0.25f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(VanillaPlus.MOD_ID, name), statusEffect);
    }

    public static void registerModEffects(){
        VanillaPlus.LOGGER.info("registering mod effects for " + VanillaPlus.MOD_ID);
    }

}
