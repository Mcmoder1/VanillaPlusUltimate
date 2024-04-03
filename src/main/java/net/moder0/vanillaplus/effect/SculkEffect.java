package net.moder0.vanillaplus.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.Random;

public class SculkEffect extends StatusEffect {
    public SculkEffect(StatusEffectCategory statusEffectCategory, int color){
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity.isAlive()){
            Random randomNum = new Random();
            int randX = randomNum. nextInt(3);
            int randZ = randomNum. nextInt(3);
            entity.teleport(entity.getPos().x + (randX - 1), entity.getPos().y, entity.getPos().z + (randZ - 1));

        }
        super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
