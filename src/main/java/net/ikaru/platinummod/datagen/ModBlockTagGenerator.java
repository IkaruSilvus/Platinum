package net.ikaru.platinummod.datagen;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.block.ModBlocks;
import net.ikaru.platinummod.item.ModToolTiers;
import net.ikaru.platinummod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PlatinumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PLATINUM_CUT.get(),
                        (ModBlocks.PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_STAIRS.get()),
                        (ModBlocks.PLATINUM_SLAB.get()),
                        (ModBlocks.RAW_PLATINUM_BLOCK.get()));
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PLATINUM_ORE.get(), ModBlocks.PLATINUM_DEEPORE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PLATINUM_CUT.get(),
                        (ModBlocks.PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_STAIRS.get()),
                        (ModBlocks.PLATINUM_SLAB.get()),
                        (ModBlocks.RAW_PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_ORE.get()),
                        (ModBlocks.PLATINUM_DEEPORE.get()));
        this.tag(ModTags.Blocks.NEEDS_COPPER_TOOL)
                .add(Blocks.GOLD_BLOCK,
                        Blocks.GOLD_ORE,
                        Blocks.DEEPSLATE_GOLD_ORE,
                        Blocks.RAW_GOLD_BLOCK,
                        Blocks.IRON_BLOCK,
                        Blocks.IRON_BARS,
                        Blocks.IRON_DOOR,
                        Blocks.IRON_BLOCK,
                        Blocks.IRON_ORE,
                        Blocks.IRON_TRAPDOOR,
                        Blocks.RAW_IRON_BLOCK,
                        Blocks.DEEPSLATE_IRON_ORE,
                        Blocks.EMERALD_BLOCK,
                        Blocks.EMERALD_ORE,
                        Blocks.DEEPSLATE_EMERALD_ORE,
                        Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE,
                        Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
    }
}
