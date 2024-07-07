package net.ikaru.platinummod.datagen;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.nbt.TagType;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, PlatinumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PLATINUM_HELMET.get(),
                        ModItems.PLATINUM_CHESTPLATE.get(),
                        ModItems.PLATINUM_LEGGINGS.get(),
                        ModItems.PLATINUM_BOOTS.get())
                .add(ModItems.NEOPLATINUM_HELMET.get(),
                        ModItems.NEOPLATINUM_CHESTPLATE.get(),
                        ModItems.NEOPLATINUM_LEGGINGS.get(),
                        ModItems.NEOPLATINUM_BOOTS.get())
                .add(ModItems.COPPER_HELMET.get(),
                        ModItems.COPPER_CHESTPLATE.get(),
                        ModItems.COPPER_LEGGINGS.get(),
                        ModItems.COPPER_BOOTS.get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.PLATINUM_PICKAXE.get(),
                        ModItems.COPPER_PICKAXE.get(),
                        ModItems.NEOPLATINUM_PICKAXE.get());
        this.tag(ItemTags.AXES)
                .add(ModItems.PLATINUM_AXE.get(),
                        ModItems.COPPER_AXE.get(),
                        ModItems.NEOPLATINUM_AXE.get());
        this.tag(ItemTags.SHOVELS)
                .add(ModItems.PLATINUM_SHOVEL.get(),
                        ModItems.COPPER_SHOVEL.get(),
                        ModItems.NEOPLATINUM_SHOVEL.get());
        this.tag(ItemTags.HOES)
                .add(ModItems.PLATINUM_HOE.get(),
                        ModItems.COPPER_HOE.get(),
                        ModItems.NEOPLATINUM_HOE.get());
        this.tag(ItemTags.SWORDS)
                .add(ModItems.PLATINUM_SWORD.get(),
                        ModItems.COPPER_SWORD.get(),
                        ModItems.NEOPLATINUM_SWORD.get());
    }
}
