package net.aoitake.fluffy.util;

import net.aoitake.fluffy.Fluffy;
import net.aoitake.fluffy.block.modBlocks;
import net.aoitake.fluffy.item.modItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class modRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        Fluffy.LOGGER.info("Registering Fuels for " + Fluffy.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(modItems.SYSTITE, 1600);
        registry.add(modBlocks.SYSTITE_BLOCK, 16000);
    }
}
