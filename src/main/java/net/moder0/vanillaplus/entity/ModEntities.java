package net.moder0.vanillaplus.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.entity.custom.SculkZombieEntity;
import net.moder0.vanillaplus.entity.custom.SentryEntity;

public class ModEntities {
    public static final EntityType<SculkZombieEntity> SCULK_ZOMBIE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(VanillaPlus.MOD_ID, "sculk_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SculkZombieEntity::new).dimensions(EntityDimensions.fixed(1, 2)).build());

    public static final EntityType<SentryEntity> SENTRY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(VanillaPlus.MOD_ID, "sentry"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SentryEntity::new).dimensions(EntityDimensions.fixed(1, 3)).build());
}
