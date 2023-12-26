package net.moder0.vanillaplus.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilverEffects extends ArmorItem {
    public SilverEffects(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()){
            if (entity instanceof PlayerEntity player){
                ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
                ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
                ItemStack leg = player.getEquippedStack(EquipmentSlot.LEGS);
                ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);
                if (head.isOf(ModItems.SILVER_HELMET) && (chest.isOf(ModItems.SILVER_CHESTPLATE) &&
                        (leg.isOf(ModItems.SILVER_LEGGINGS) && (boots.isOf(ModItems.SILVER_BOOTS))))){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, false, false, true));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0, false, false, true));
                }
            }


        }

        super.inventoryTick(stack, world, entity, slot, selected);

    }


}
