package net.jpsama.cohcustomitem;

import net.fabricmc.api.ModInitializer;

import net.jpsama.cohcustomitem.item.ModItemGroups;
import net.jpsama.cohcustomitem.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cohcustomitem implements ModInitializer {
	public static final String MOD_ID = "cohcustomitem";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("It burns when I pee");
	}
}