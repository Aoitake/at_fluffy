package net.aoitake.fluffy.block;


import net.aoitake.fluffy.Fluffy;
import net.aoitake.fluffy.block.custom.shinzoBerryBush;
import net.aoitake.fluffy.item.modItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modBlocks {

    public static final Block SYSTITE_ORE = registerBlock("systite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), modItemGroup.BLOCKS);

    public static final Block SYSTITE_BLOCK = registerBlock("systite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), modItemGroup.BLOCKS);

    public static final Block SHINZO_BERRY_BUSH = registerBlockWithoutBlockItem("shinzo_berry_bush",
            new shinzoBerryBush(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()), modItemGroup.BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Fluffy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block , ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Fluffy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Fluffy.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        Fluffy.LOGGER.info("Registering ModBLocks for " + Fluffy.MOD_ID);
    }
}
