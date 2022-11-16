package games.twinhead.morecarpets.client;

import games.twinhead.morecarpets.block.CarpetTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MoreCarpetsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //if(!FabricLoader.getInstance().isModLoaded("sodium")){
            registerColors();
        //}
        registerBlockRenderLayers();
    }

    private void registerBlockRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.ACACIA_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.BIRCH_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.DARK_OAK_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.JUNGLE_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.MANGROVE_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.OAK_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.SPRUCE_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.AZALEA_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.FLOWERING_AZALEA_LEAVES_CARPET.getBlock(), RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.SLIME_CARPET.getBlock(), RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.HONEY_CARPET.getBlock(), RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock( CarpetTypes.ICE_CARPET.getBlock(), RenderLayer.getTranslucent());
    }


    public void registerColors(){

        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor()),
                CarpetTypes.OAK_LEAVES_CARPET.getBlock(),
                CarpetTypes.JUNGLE_LEAVES_CARPET.getBlock(),
                CarpetTypes.ACACIA_LEAVES_CARPET.getBlock(),
                CarpetTypes.DARK_OAK_LEAVES_CARPET.getBlock(),
                CarpetTypes.MANGROVE_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> FoliageColors.getDefaultColor()),
                CarpetTypes.OAK_LEAVES_CARPET.getBlock(),
                CarpetTypes.JUNGLE_LEAVES_CARPET.getBlock(),
                CarpetTypes.ACACIA_LEAVES_CARPET.getBlock(),
                CarpetTypes.DARK_OAK_LEAVES_CARPET.getBlock(),
                CarpetTypes.MANGROVE_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> FoliageColors.getSpruceColor()),
                CarpetTypes.SPRUCE_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> FoliageColors.getSpruceColor()),
                CarpetTypes.SPRUCE_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> FoliageColors.getBirchColor()),
                CarpetTypes.BIRCH_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> FoliageColors.getBirchColor()),
                CarpetTypes.BIRCH_LEAVES_CARPET.getBlock()
        );

        ColorProviderRegistry.BLOCK.register(((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0)),
                CarpetTypes.GRASS_CARPET.getBlock()
        );

        ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> GrassColors.getColor(0.5, 1.0)),
                CarpetTypes.GRASS_CARPET.getBlock()
        );

    }
}
