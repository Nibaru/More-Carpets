package games.twinhead.morecarpets.datagen;

import games.twinhead.morecarpets.block.CarpetTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

public class TagGenerator extends FabricTagProvider<Block> {

    public TagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    @Override
    protected void generateTags() {

        for (CarpetTypes carpet: CarpetTypes.values()) {
            for (TagKey<Block> tag: carpet.blockTags) {
                getOrCreateTagBuilder(tag).add(carpet.getId());
            }
        }
    }
}
