package net.moder0.vanillaplus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.block.ModBlocks;
import net.moder0.vanillaplus.effect.ModEffects;
import net.moder0.vanillaplus.entity.ModBoats;
import net.moder0.vanillaplus.entity.ModEntities;
import net.moder0.vanillaplus.entity.custom.SculkZombieEntity;
import net.moder0.vanillaplus.entity.custom.SentryEntity;
import net.moder0.vanillaplus.item.ModItemGroup;
import net.moder0.vanillaplus.item.ModItems;
import net.moder0.vanillaplus.particle.ModParticles;
import net.moder0.vanillaplus.potion.ModPotions;
import net.moder0.vanillaplus.villager.ModVillagers;
import net.moder0.vanillaplus.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaPlus implements ModInitializer {
	public static final String MOD_ID = "vanillaplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModWorldGeneration.generateModWorldGen();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();

		ModParticles.registerParticles();

		ModVillagers.registerVilllagers();
		ModVillagers.registerTrades();

		ModBoats.registerBoats();
		ModEffects.registerModEffects();
		ModPotions.registerModPotions();

		FabricDefaultAttributeRegistry.register(ModEntities.SCULK_ZOMBIE, SculkZombieEntity.createSculkZombieAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SENTRY, SentryEntity.createSentryAttributes());

		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.REINFORCED_DEEPSLATE)
				.lightWithItem(ModItems.ACTIVATED_KEY)
				.destDimID(new Identifier(VanillaPlus.MOD_ID, "deep_dark"))
				.tintColor(29, 62, 128)
				.registerPortal();


	}
}
