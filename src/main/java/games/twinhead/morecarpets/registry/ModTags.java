package games.twinhead.morecarpets.registry;

import games.twinhead.morecarpets.MoreCarpets;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {


    public static final TagKey<Block> WOOD_CARPETS = TagKey.of(Registry.BLOCK_KEY, new Identifier(MoreCarpets.MOD_ID, "wood_carpets"));
    public static final TagKey<Block> SOUL_CARPETS = TagKey.of(Registry.BLOCK_KEY, new Identifier(MoreCarpets.MOD_ID, "soul_carpets"));
    public static final TagKey<Block> SOIL_CARPETS = TagKey.of(Registry.BLOCK_KEY, new Identifier(MoreCarpets.MOD_ID, "soil_carpets"));
    public static final TagKey<Block> LEAF_CARPETS = TagKey.of(Registry.BLOCK_KEY, new Identifier(MoreCarpets.MOD_ID, "leaf_carpets"));
}
