package net.jpsama.acm;

import net.fabricmc.api.ModInitializer;

import net.jpsama.acm.item.ModItemGroups;
import net.jpsama.acm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Acm implements ModInitializer {
	public static final String MOD_ID = "acm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		net.jpsama.acm.effect.ModEffects.registerEffects();

		LOGGER.info("It burns when I pee");
	}
}