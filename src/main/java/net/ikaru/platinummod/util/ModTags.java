package net.ikaru.platinummod.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = tag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_NEOPLATINUM_TOOL = tag("needs_neoplatinum_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("needs_copper_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PlatinumMod.MOD_ID, name));
        }
    }

}
