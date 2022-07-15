package net.aoitake.fluffy;

import net.aoitake.fluffy.block.modBlocks;
import net.aoitake.fluffy.item.modItems;
import net.aoitake.fluffy.util.modRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fluffy implements ModInitializer {
	public static final String MOD_ID = "fluffy";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		modItems.registerModItems();
		modBlocks.registerModBlocks();
		modRegistries.registerModStuffs();
		modRegistries.registerModStuffs();
	}
}
