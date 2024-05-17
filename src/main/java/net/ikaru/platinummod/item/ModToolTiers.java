package net.ikaru.platinummod.item;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(4,1797,8.5f,3.5f,12,
                    ModTags.Blocks.NEEDS_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM.get())),
            new ResourceLocation(PlatinumMod.MOD_ID, "platinum"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
}
