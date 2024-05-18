package net.ikaru.platinummod.datagen;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.block.ModBlocks;
import net.ikaru.platinummod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
                        (ModBlocks.RAW_PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_ORE.get()),
                        (ModBlocks.PLATINUM_DEEPORE.get()));
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PLATINUM_CUT.get(),
                        (ModBlocks.PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_STAIRS.get()),
                        (ModBlocks.PLATINUM_SLAB.get()),
                        (ModBlocks.RAW_PLATINUM_BLOCK.get()),
                        (ModBlocks.PLATINUM_ORE.get()),
                        (ModBlocks.PLATINUM_DEEPORE.get()));
    }
}
