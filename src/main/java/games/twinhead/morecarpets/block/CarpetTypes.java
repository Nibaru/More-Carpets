package games.twinhead.morecarpets.block;

import games.twinhead.morecarpets.MoreCarpets;
import games.twinhead.morecarpets.registry.ModTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;

public enum CarpetTypes {
    OAK_VENEER(Blocks.OAK_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    ACACIA_VENEER(Blocks.ACACIA_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    DARK_OAK_VENEER(Blocks.DARK_OAK_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    BIRCH_VENEER(Blocks.BIRCH_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    JUNGLE_VENEER(Blocks.JUNGLE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    MANGROVE_VENEER(Blocks.MANGROVE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    SPRUCE_VENEER(Blocks.SPRUCE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    CRIMSON_VENEER(Blocks.CRIMSON_STEM, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    WARPED_VENEER(Blocks.WARPED_STEM, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),

    STRIPPED_OAK_VENEER(Blocks.STRIPPED_OAK_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_ACACIA_VENEER(Blocks.STRIPPED_ACACIA_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_DARK_OAK_VENEER(Blocks.STRIPPED_DARK_OAK_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_BIRCH_VENEER(Blocks.STRIPPED_BIRCH_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_JUNGLE_VENEER(Blocks.STRIPPED_JUNGLE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_MANGROVE_VENEER(Blocks.STRIPPED_MANGROVE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_SPRUCE_VENEER(Blocks.STRIPPED_SPRUCE_LOG, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_CRIMSON_VENEER(Blocks.STRIPPED_CRIMSON_STEM, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    STRIPPED_WARPED_VENEER(Blocks.STRIPPED_WARPED_STEM, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),

    OAK_PLANKS_VENEER(Blocks.OAK_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    ACACIA_PLANKS_VENEER(Blocks.ACACIA_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    DARK_OAK_PLANKS_VENEER(Blocks.DARK_OAK_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    BIRCH_PLANKS_VENEER(Blocks.BIRCH_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    JUNGLE_PLANKS_VENEER(Blocks.JUNGLE_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    MANGROVE_PLANKS_VENEER(Blocks.MANGROVE_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    SPRUCE_PLANKS_VENEER(Blocks.SPRUCE_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    CRIMSON_PLANKS_VENEER(Blocks.CRIMSON_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),
    WARPED_PLANKS_VENEER(Blocks.WARPED_PLANKS, BlockTags.AXE_MINEABLE, ModTags.WOOD_CARPETS),

    OAK_LEAVES_CARPET(Blocks.OAK_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    ACACIA_LEAVES_CARPET(Blocks.ACACIA_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    DARK_OAK_LEAVES_CARPET(Blocks.DARK_OAK_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    BIRCH_LEAVES_CARPET(Blocks.BIRCH_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    JUNGLE_LEAVES_CARPET(Blocks.JUNGLE_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    MANGROVE_LEAVES_CARPET(Blocks.MANGROVE_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    SPRUCE_LEAVES_CARPET(Blocks.SPRUCE_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    FLOWERING_AZALEA_LEAVES_CARPET(Blocks.FLOWERING_AZALEA_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),
    AZALEA_LEAVES_CARPET(Blocks.AZALEA_LEAVES, BlockTags.HOE_MINEABLE, ModTags.LEAF_CARPETS),

    NETHER_WART_CARPET(Blocks.NETHER_WART_BLOCK, BlockTags.HOE_MINEABLE),
    WARPED_WART_CARPET(Blocks.WARPED_WART_BLOCK, BlockTags.HOE_MINEABLE),

    MAGMA_BLOCK_CARPET(Blocks.MAGMA_BLOCK, BlockTags.PICKAXE_MINEABLE),

    SOUL_SAND_CARPET(Blocks.SOUL_SAND, BlockTags.SHOVEL_MINEABLE, BlockTags.SOUL_SPEED_BLOCKS, ModTags.SOUL_CARPETS),
    SOUL_SOIL_CARPET(Blocks.SOUL_SOIL, BlockTags.SHOVEL_MINEABLE, BlockTags.SOUL_SPEED_BLOCKS, ModTags.SOUL_CARPETS),

    GRASS_CARPET(Blocks.GRASS_BLOCK, BlockTags.SHOVEL_MINEABLE, ModTags.SOIL_CARPETS),
    PODZOL_CARPET(Blocks.PODZOL, BlockTags.SHOVEL_MINEABLE, ModTags.SOIL_CARPETS),
    MYCELIUM_CARPET(Blocks.MYCELIUM, BlockTags.SHOVEL_MINEABLE, ModTags.SOIL_CARPETS),
    WARPED_NYLIUM_CARPET(Blocks.WARPED_NYLIUM, BlockTags.PICKAXE_MINEABLE),
    CRIMSON_NYLIUM_CARPET(Blocks.CRIMSON_NYLIUM, BlockTags.PICKAXE_MINEABLE),

    SLIME_CARPET(Blocks.SLIME_BLOCK),
    HONEY_CARPET(Blocks.HONEY_BLOCK),

    ICE_CARPET(Blocks.ICE, BlockTags.PICKAXE_MINEABLE),
    PACKED_ICE_CARPET(Blocks.PACKED_ICE, BlockTags.PICKAXE_MINEABLE),

    HAY_BLOCK_CARPET(Blocks.HAY_BLOCK, BlockTags.HOE_MINEABLE),
    MUSHROOM_STEM_CARPET(Blocks.MUSHROOM_STEM, BlockTags.AXE_MINEABLE),
    RED_MUSHROOM_CARPET(Blocks.RED_MUSHROOM_BLOCK, BlockTags.AXE_MINEABLE),
    BROWN_MUSHROOM_CARPET(Blocks.BROWN_MUSHROOM_BLOCK, BlockTags.AXE_MINEABLE),
    ;


    public final Block copyBlock;
    public final TagKey<Block>[] blockTags;

    @SafeVarargs
    CarpetTypes(Block block, TagKey<Block>... tags){
        this.copyBlock = block;
        blockTags = tags;
    }


    public Block getBlock(){
        if(!MoreCarpets.BLOCKS.containsKey(this)){
            MoreCarpets.BLOCKS.put(this, this.getBaseBlock());
        }
        return MoreCarpets.BLOCKS.get(this);
    }

    public Identifier getId(){
        return new Identifier(MoreCarpets.MOD_ID, this.toString());
    }

    Block getBaseBlock(){

        FabricBlockSettings settings = FabricBlockSettings.of(copyBlock.getDefaultState().getMaterial()).sounds(copyBlock.getDefaultState().getSoundGroup()).hardness(0.2f);

        return switch (this){
            case
                    OAK_LEAVES_CARPET,
                    ACACIA_LEAVES_CARPET,
                    BIRCH_LEAVES_CARPET,
                    DARK_OAK_LEAVES_CARPET,
                    MANGROVE_LEAVES_CARPET,
                    SPRUCE_LEAVES_CARPET,
                    AZALEA_LEAVES_CARPET,
                    JUNGLE_LEAVES_CARPET,
                    FLOWERING_AZALEA_LEAVES_CARPET
                    -> new CarpetBlock(settings.nonOpaque());
            case MAGMA_BLOCK_CARPET -> new MagmaBlockCarpet(settings);
            case SOUL_SAND_CARPET -> new SoulSandCarpetBlock(settings.velocityMultiplier(0.4F));
            case SOUL_SOIL_CARPET -> new FunctionalCarpetBlock(settings);
            case SLIME_CARPET -> new SlimeCarpetBlock(settings.nonOpaque().breakInstantly());
            case HONEY_CARPET -> new HoneyCarpetBlock(settings.velocityMultiplier(0.4F).jumpVelocityMultiplier(0.5F).nonOpaque().sounds(BlockSoundGroup.HONEY).breakInstantly());
            case ICE_CARPET, PACKED_ICE_CARPET -> new FunctionalCarpetBlock(settings.nonOpaque().slipperiness(0.98f));
            default -> new RotatableCarpetBlock(settings);
        };
    }

    public String toString(){
        return this.name().toLowerCase();
    }

}
