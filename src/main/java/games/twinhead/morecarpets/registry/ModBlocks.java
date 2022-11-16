package games.twinhead.morecarpets.registry;

import games.twinhead.morecarpets.block.CarpetTypes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static void register(){
        for (CarpetTypes carpet: CarpetTypes.values()) {
            Registry.register(Registry.BLOCK, carpet.getId(), carpet.getBlock());
            Registry.register(Registry.ITEM, carpet.getId(), new BlockItem(carpet.getBlock(), new Item.Settings().group(ItemGroup.DECORATIONS)));
        }
    }
}
