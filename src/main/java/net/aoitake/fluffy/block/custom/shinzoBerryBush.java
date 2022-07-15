package net.aoitake.fluffy.block.custom;

import net.aoitake.fluffy.item.modItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class shinzoBerryBush extends CropBlock{

    public shinzoBerryBush(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return modItems.SHINZO_SEEDS;
    }
}
