package games.twinhead.morecarpets.datagen;

import games.twinhead.morecarpets.MoreCarpets;
import games.twinhead.morecarpets.block.CarpetTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class LootTableGenerator extends SimpleFabricLootTableProvider {
    public LootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        for (CarpetTypes carpet: CarpetTypes.values()) {
            identifierBuilderBiConsumer.accept(new Identifier(MoreCarpets.MOD_ID, "blocks/" + carpet.toString()), BlockLootTableGenerator.drops(carpet.getBlock(), carpet.getBlock().asItem(), ConstantLootNumberProvider.create(1.0F)));
        }
    }
}
