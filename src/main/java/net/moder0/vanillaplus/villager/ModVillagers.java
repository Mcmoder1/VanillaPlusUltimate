package net.moder0.vanillaplus.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.block.ModBlocks;

public class ModVillagers {

//---------------------------------------------------------------------------------------------------------------------------------------

    public static final PointOfInterestType BEEHIVE_POI = registerPOI("beehive_poi", ModBlocks.USABLE_BEEHIVE);
    public static final VillagerProfession BEEKEEPER = registerProfession("beekeeper",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(VanillaPlus.MOD_ID, "beehive_poi")));

    public static final PointOfInterestType BUILDER_POI = registerPOI("builder_poi", Blocks.CRAFTING_TABLE);
    public static final VillagerProfession BUILDER = registerProfession("builder",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(VanillaPlus.MOD_ID, "builder_poi")));

    public static final PointOfInterestType MINER_POI = registerPOI("miner_poi", ModBlocks.MINING_BENCH);
    public static final VillagerProfession MINER = registerProfession("miner",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(VanillaPlus.MOD_ID, "miner_poi")));

//---------------------------------------------------------------------------------------------------------------------------------------

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(VanillaPlus.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(VanillaPlus.MOD_ID, name))
                        .workstation(type).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(VanillaPlus.MOD_ID, name), 1, 1,
                ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

//----------------------------------------------------------------TRADES------------------------------------------------------------------


    public static void registerVilllagers(){
        VanillaPlus.LOGGER.debug("registring villagers for: "+VanillaPlus.MOD_ID);
    }
    public static void registerTrades(){
        //BEEKEEPER
        TradeOfferHelper.registerVillagerOffers(BEEKEEPER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.HONEY_BOTTLE),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SUNFLOWER, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.CORNFLOWER, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROSE_BUSH, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ALLIUM, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POPPY, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AZURE_BLUET, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DANDELION, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LILAC, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.RED_TULIP, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ORANGE_TULIP, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.PINK_TULIP, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.WHITE_TULIP, 3),
                            new ItemStack(Items.EMERALD),
                            16, 2, 0.02f
                    ));
        });

        TradeOfferHelper.registerVillagerOffers(BEEKEEPER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HONEYCOMB, 4),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.HONEYCOMB_BLOCK),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HONEY_BOTTLE, 2),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.HONEY_BLOCK),
                            16, 2, 0.02f
                    ));

        });
        //BUILDER
        TradeOfferHelper.registerVillagerOffers(BUILDER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COBBLESTONE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.STONE),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BRICKS, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BRICK, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 2, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(BUILDER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STONE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.STONE_BRICKS),
                            16, 4, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_SHOVEL, 1),
                            new ItemStack(Items.EMERALD, 4),
                            6, 10, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_PICKAXE, 1),
                            new ItemStack(Items.EMERALD, 4),
                            6, 10, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(BUILDER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STONE_BRICKS, 1),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.CHISELED_STONE_BRICKS),
                            16, 6, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_SHOVEL, 1),
                            new ItemStack(Items.EMERALD, 6),
                            6, 12, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_PICKAXE, 1),
                            new ItemStack(Items.EMERALD, 6),
                            6, 12, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(BUILDER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.QUARTZ_BLOCK, 3),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.SMOOTH_QUARTZ, 4),
                            16, 7, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SMOOTH_QUARTZ, 3),
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.QUARTZ_PILLAR, 4),
                            16, 7, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_PICKAXE, 1),
                            new ItemStack(Items.EMERALD, 6),
                            6, 12, 0.02f
                    ));

                });
        //MINER
        TradeOfferHelper.registerVillagerOffers(MINER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 15),
                            new ItemStack(Items.EMERALD, 3),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COBBLESTONE, 32),
                            new ItemStack(Items.EMERALD, 3),
                            16, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.STONE_PICKAXE, 1),
                            10, 2, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.STONE_SHOVEL, 1),
                            10, 2, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(MINER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 14),
                            new ItemStack(Items.IRON_INGOT, 3),
                            16, 5, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 7, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(MINER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LAPIS_LAZULI, 24),
                            new ItemStack(Items.IRON_INGOT, 2),
                            16, 6, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.REDSTONE, 32),
                            new ItemStack(Items.EMERALD, 1),
                            16, 7, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_PICKAXE, 1),
                            new ItemStack(Items.EMERALD, 16),
                            5, 9, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_SHOVEL, 1),
                            new ItemStack(Items.EMERALD, 16),
                            5, 9, 0.02f
                    ));

                });

        TradeOfferHelper.registerVillagerOffers(MINER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.AMETHYST_SHARD, 1),
                            16, 10, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 23),
                            new ItemStack(Items.COPPER_INGOT, 1),
                            10, 10, 0.02f
                    ));


                });

        TradeOfferHelper.registerVillagerOffers(MINER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 2),
                            new ItemStack(Items.EMERALD, 32),
                            16, 10, 0.02f
                    ));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 32),
                            new ItemStack(Items.DIAMOND, 1),
                            10, 10, 0.02f
                    ));


                });
    }

}
