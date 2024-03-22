package net.moder0.vanillaplus.world.biome;

import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.entity.ModEntities;

public class ModBiomes {

    public static final RegistryKey<Biome> DEEP_DARK_WASTELAND = RegistryKey.of(RegistryKeys.BIOME, new Identifier(VanillaPlus.MOD_ID, "deep_dark_wasteland"));

    public static void boostrap(Registerable<Biome> context){
        context.register(DEEP_DARK_WASTELAND, deep_dark(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome deep_dark(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(ModEntities.SCULK_ZOMBIE, 100, 4, 4));

        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));


        globalOverworldGeneration(biomeBuilder);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x022873)
                        .waterFogColor(0x022873)
                        .skyColor(0x022873)
                        .grassColor(0x7f03fc)
                        .foliageColor(0xd203fc)
                        .fogColor(0x022873)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(RegistryEntry.of(SoundEvents.ENTITY_WARDEN_ANGRY))).build())
                .build();
    }
}
