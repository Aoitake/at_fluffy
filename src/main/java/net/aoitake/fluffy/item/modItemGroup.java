package net.aoitake.fluffy.item;

import net.aoitake.fluffy.Fluffy;
import net.aoitake.fluffy.block.modBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class modItemGroup {

    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.build(new Identifier(Fluffy.MOD_ID, "blocks"),
            () -> new ItemStack(modBlocks.SYSTITE_ORE));

    public static final ItemGroup MISCELLANEOUS = FabricItemGroupBuilder.build(new Identifier(Fluffy.MOD_ID, "miscellaneous"),
            () -> new ItemStack(modItems.SYSTITE));

    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(new Identifier(Fluffy.MOD_ID, "food"),
            () -> new ItemStack(modItems.CHEESE));
}

