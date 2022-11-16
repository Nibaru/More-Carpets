package games.twinhead.morecarpets.datagen;

import games.twinhead.morecarpets.MoreCarpets;
import games.twinhead.morecarpets.block.CarpetTypes;
import games.twinhead.morecarpets.block.RotatableCarpetBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

import java.util.Optional;

public class ModelGenerator extends FabricModelProvider {


    public ModelGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (CarpetTypes carpet: CarpetTypes.values()) {
            if(carpet.getBlock() instanceof RotatableCarpetBlock){
                blockStateModelGenerator.blockStateCollector.accept(createRotatedCarpetState(carpet));
                getModel(blockStateModelGenerator, carpet);
            } else {

                blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(carpet.getBlock(), getModel(blockStateModelGenerator, carpet)));
            }

        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public Identifier getModel(BlockStateModelGenerator blockStateModelGenerator, CarpetTypes carpet){

        TextureMap texture = TextureMap.wool(new Identifier(Registry.BLOCK.getId(carpet.copyBlock).getNamespace(), "block/" + switch(carpet){
            case MAGMA_BLOCK_CARPET -> "magma";
            case GRASS_CARPET -> "grass_block_top";
            case PODZOL_CARPET -> "podzol_top";
            case MYCELIUM_CARPET -> "mycelium_top";
            case HONEY_CARPET -> "honey_block_bottom";
            case HAY_BLOCK_CARPET -> "hay_block_top";

            default -> Registry.BLOCK.getId(carpet.copyBlock).getPath();
        }));

        return switch (carpet){
            case OAK_LEAVES_CARPET,
                ACACIA_LEAVES_CARPET,
                BIRCH_LEAVES_CARPET,
                DARK_OAK_LEAVES_CARPET,
                JUNGLE_LEAVES_CARPET,
                MANGROVE_LEAVES_CARPET,
                SPRUCE_LEAVES_CARPET,
                    GRASS_CARPET -> new Model(Optional.of(new Identifier(MoreCarpets.MOD_ID, "block/tinted_carpet")), Optional.empty(), TextureKey.WOOL).upload(carpet.getBlock(), texture, blockStateModelGenerator.modelCollector);
            default -> Models.CARPET.uploadWithoutVariant(carpet.getBlock(), "", texture, blockStateModelGenerator.modelCollector);
        };
    }

    public BlockStateSupplier createRotatedCarpetState(CarpetTypes type){
        Identifier id = new Identifier(MoreCarpets.MOD_ID, "block/" + type);
        return VariantsBlockStateSupplier.create(type.getBlock()).coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING).register(
                Direction.NORTH, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R0).put(VariantSettings.MODEL, id)
        ).register(
                Direction.SOUTH, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R180).put(VariantSettings.MODEL, id)
        ).register(
                Direction.EAST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R90).put(VariantSettings.MODEL, id)
        ).register(
                Direction.WEST, BlockStateVariant.create().put(VariantSettings.Y, VariantSettings.Rotation.R270).put(VariantSettings.MODEL, id)
        ));
    }
}
