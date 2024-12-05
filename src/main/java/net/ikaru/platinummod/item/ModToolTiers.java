package net.ikaru.platinummod.item;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(4,1797,8.5f, .5f,12,
                    ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM.get())),
            new ResourceLocation(PlatinumMod.MOD_ID, "platinum"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    public static final Tier NEOPLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(6,10000,12f, 0f,12,
                    ModTags.Blocks.NEEDS_NEOPLATINUM_TOOL, () -> Ingredient.of(ModItems.NEOPLATINUM.get())),
            new ResourceLocation(PlatinumMod.MOD_ID, "neoplatinum"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,175,4.0f, -.5f,8,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(PlatinumMod.MOD_ID, "copper"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    public static final Tier OBSIDIAN = TierSortingRegistry.registerTier(
            new ForgeTier(1,3,4.0f, 0f,8,
                    ModTags.Blocks.NEEDS_OBSIDIAN_TOOL, () -> Ingredient.of(Items.OBSIDIAN)),
            new ResourceLocation(PlatinumMod.MOD_ID, "obsidian"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

}
