package net.adinda.animalfarmer;

import net.adinda.animalfarmer.util.ModCustomTrades;
import net.adinda.animalfarmer.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFarmer implements ModInitializer {
	public static final String MOD_ID = "animalfarmer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModVillagers.registerVillagers();
		ModCustomTrades.registerCustomTrades();


	}
}