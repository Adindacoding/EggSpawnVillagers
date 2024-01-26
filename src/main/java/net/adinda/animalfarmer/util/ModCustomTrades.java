package net.adinda.animalfarmer.util;

import net.adinda.animalfarmer.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIVESTOCK_FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.CHICKEN_SPAWN_EGG,1 ),
                            4, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.PIG_SPAWN_EGG,1 ),
                            4, 5, 0.075f));

        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIVESTOCK_FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.COW_SPAWN_EGG,1 ),
                            4, 20, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SHEEP_SPAWN_EGG,1 ),
                            4, 20, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIVESTOCK_FARMER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.CAT_SPAWN_EGG,1 ),
                            4, 40, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.WOLF_SPAWN_EGG,1 ),
                            4, 40, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIVESTOCK_FARMER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.RABBIT_SPAWN_EGG,1 ),
                            4, 50, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.DONKEY_SPAWN_EGG,1 ),
                            4, 50, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIVESTOCK_FARMER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.HORSE_SPAWN_EGG,1 ),
                            4, 50, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.LLAMA_SPAWN_EGG,1 ),
                            4, 50, 0.075f));

                });



        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.BEE_SPAWN_EGG,1 ),
                            4, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.PARROT_SPAWN_EGG,1 ),
                            4, 5, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.FOX_SPAWN_EGG,1 ),
                            4, 10, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.GOAT_SPAWN_EGG,1 ),
                            4, 10, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_FARMER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.OCELOT_SPAWN_EGG,1 ),
                            4, 20, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.PANDA_SPAWN_EGG,1 ),
                            4, 20, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_FARMER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.POLAR_BEAR_SPAWN_EGG,1 ),
                            4, 30, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.CAMEL_SPAWN_EGG,1 ),
                            4, 30, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.EXOTIC_FARMER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.MOOSHROOM_SPAWN_EGG,1 ),
                            4, 40, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.SNIFFER_SPAWN_EGG,1 ),
                            4, 40, 0.075f));

                });



        TradeOfferHelper.registerVillagerOffers(ModVillagers.ADVENTURER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ZOMBIE_SPAWN_EGG,1 ),
                            4, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.CREEPER_SPAWN_EGG,1 ),
                            4, 5, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ADVENTURER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SKELETON_SPAWN_EGG,1 ),
                            4, 10, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SPIDER_SPAWN_EGG,1 ),
                            4, 10, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ADVENTURER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.STRAY_SPAWN_EGG,1 ),
                            4, 20, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.PHANTOM_SPAWN_EGG,1 ),
                            4, 20, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ADVENTURER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.WITCH_SPAWN_EGG,1 ),
                            4, 30, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.SLIME_SPAWN_EGG,1 ),
                            4, 30, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ADVENTURER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.BLAZE_SPAWN_EGG,1 ),
                            4, 40, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(Items.ENDERMAN_SPAWN_EGG,1 ),
                            4, 40, 0.075f));

                });


        TradeOfferHelper.registerVillagerOffers(ModVillagers.AQUATIC_FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.COD_SPAWN_EGG, 1),
                            4, 5, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            4, 5, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AQUATIC_FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.TROPICAL_FISH_SPAWN_EGG, 1),
                            4, 10, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SALMON_SPAWN_EGG, 1),
                            4, 10, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AQUATIC_FARMER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.FROG_SPAWN_EGG, 1),
                            4, 20, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.SQUID_SPAWN_EGG, 1),
                            4, 20, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AQUATIC_FARMER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.AXOLOTL_SPAWN_EGG, 1),
                            4, 30, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(Items.DOLPHIN_SPAWN_EGG, 1),
                            4, 30, 0.075f));

                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.AQUATIC_FARMER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 20),
                        new ItemStack(Items.TURTLE_SPAWN_EGG, 1),
                        4, 40, 0.075f)));




    }


}
