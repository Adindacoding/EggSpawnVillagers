package net.adinda.animalfarmer.villager;

import com.google.common.collect.ImmutableSet;
import net.adinda.animalfarmer.AnimalFarmer;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;


public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> LIVESTOCK_POI_KEY = poiKey("livestockpoi");
    public static final PointOfInterestType LIVESTOCK_POI = registerPoi("livestockpoi", Blocks.HAY_BLOCK);
    public static final VillagerProfession LIVESTOCK_FARMER = registerProfession("livestock_farmer", LIVESTOCK_POI_KEY);

    public static final RegistryKey<PointOfInterestType> EXOTIC_POI_KEY = poiKey("exoticpoi");
    public static final PointOfInterestType EXOTIC_POI = registerPoi("exoticpoi", Blocks.BAMBOO_BLOCK);
    public static final VillagerProfession EXOTIC_FARMER = registerProfession("exotic_farmer", EXOTIC_POI_KEY);

    public static final RegistryKey<PointOfInterestType> ADVENTURER_POI_KEY = poiKey("adventurerpoi");
    public static final PointOfInterestType ADVENTURER_POI = registerPoi("adventurerpoi", Blocks.BONE_BLOCK);
    public static final VillagerProfession ADVENTURER = registerProfession("adventurer", ADVENTURER_POI_KEY);

    public static final RegistryKey<PointOfInterestType> AQUATIC_POI_KEY = poiKey("aquaticpoi");
    public static final PointOfInterestType AQUATIC_POI = registerPoi("aquaticpoi", Blocks.DRIED_KELP_BLOCK);
    public static final VillagerProfession AQUATIC_FARMER = registerProfession("aquatic_farmer", AQUATIC_POI_KEY);


        private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
            return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(AnimalFarmer.MOD_ID, name),
                    new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                            ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));
        }

        private static PointOfInterestType registerPoi(String name, Block block){
            return PointOfInterestHelper.register(new Identifier(AnimalFarmer.MOD_ID, name), 1,1,block);
        }

        private static RegistryKey<PointOfInterestType> poiKey(String name) {
            return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(AnimalFarmer.MOD_ID, name));
        }

        public static void registerVillagers() {
            AnimalFarmer.LOGGER.info("Registering Villagers " + AnimalFarmer.MOD_ID);
        }
}
