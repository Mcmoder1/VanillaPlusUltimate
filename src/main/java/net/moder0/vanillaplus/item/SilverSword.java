package net.moder0.vanillaplus.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class SilverSword extends SwordItem {
    public SilverSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()){
            if (entity instanceof PlayerEntity player){
                ItemStack main_hand = player.getEquippedStack(EquipmentSlot.MAINHAND);

                if (main_hand.isOf(ModItems.SILVER_SWORD)){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0, false, false, true));
                }

            }


        }

        super.inventoryTick(stack, world, entity, slot, selected);

    }

}