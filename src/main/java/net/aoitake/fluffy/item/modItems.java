package net.aoitake.fluffy.item;

import net.aoitake.fluffy.Fluffy;
import net.aoitake.fluffy.block.modBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modItems {

    public static final Item SYSTITE = registerItem("systite",
            new Item(new FabricItemSettings().group(modItemGroup.MISCELLANEOUS)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(modItemGroup.MISCELLANEOUS)));

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(modItemGroup.FOOD).food(modFoodComponents.CHEESE)));

    public static final Item SHINZO_BERRY = registerItem("shinzo_berry",
            new Item(new FabricItemSettings().group(modItemGroup.FOOD).food(modFoodComponents.SHINZO_BERRY)));

    public static final Item SHINZO_SEEDS = registerItem("shinzo_seeds",
            new AliasedBlockItem(modBlocks.SHINZO_BERRY_BUSH, new FabricItemSettings().group(modItemGroup.MISCELLANEOUS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Fluffy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Fluffy.LOGGER.info("Registering Mod Items for " + Fluffy.MOD_ID);
    }
}
