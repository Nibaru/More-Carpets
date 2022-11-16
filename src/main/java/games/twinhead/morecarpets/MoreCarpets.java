package games.twinhead.morecarpets;

import games.twinhead.morecarpets.block.CarpetTypes;
import games.twinhead.morecarpets.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;

import java.util.HashMap;

public class MoreCarpets implements ModInitializer {

    public static final String MOD_ID = "more_carpets";

    public static final HashMap<CarpetTypes, Block> BLOCKS = new HashMap<>();

    @Override
    public void onInitialize() {
        ModBlocks.register();
    }
}
