package net.aoitake.fluffy;

import net.aoitake.fluffy.block.modBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class fluffyClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(modBlocks.SHINZO_BERRY_BUSH, RenderLayer.getCutout());
    }
}
