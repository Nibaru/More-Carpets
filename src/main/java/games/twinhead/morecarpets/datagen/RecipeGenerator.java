package games.twinhead.morecarpets.datagen;

import games.twinhead.morecarpets.block.CarpetTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        for (CarpetTypes carpet: CarpetTypes.values()) {
            switch (carpet){
                case ACACIA_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.ACACIA_SLAB);
                case BIRCH_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.BIRCH_SLAB);
                case CRIMSON_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.CRIMSON_SLAB);
                case DARK_OAK_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.DARK_OAK_SLAB);
                case JUNGLE_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.JUNGLE_SLAB);
                case MANGROVE_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.MANGROVE_SLAB);
                case OAK_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.OAK_SLAB);
                case SPRUCE_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.SPRUCE_SLAB);
                case WARPED_PLANKS_VENEER -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), Blocks.WARPED_SLAB);
                default -> RecipeProvider.offerCarpetRecipe(exporter, carpet.getBlock(), carpet.copyBlock);
            }
        }
    }
}
