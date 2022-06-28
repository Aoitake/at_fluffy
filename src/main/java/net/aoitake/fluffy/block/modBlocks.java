package net.aoitake.fluffy.block;


import net.aoitake.fluffy.Fluffy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modBlocks {

    public static final Block SYSTITE_ORE = registerBlock("systite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

    public static final Block SYSTITE_BLOCK = registerBlock("systite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Fluffy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block , ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Fluffy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        Fluffy.LOGGER.info("Registering ModBLocks for " + Fluffy.MOD_ID);
    }
}