package net.ikaru.platinummod.block;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlatinumMod.MOD_ID);


    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,9)));
    public static final RegistryObject<Block> PLATINUM_DEEPORE = registerBlock("PLATINUM_DEEPORE",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops(), UniformInt.of(3,9)));
    public static final RegistryObject<Block> PLATINUM_STAIRS = registerBlock("cut_platinum_stairs",
            () -> new StairBlock(() -> ModBlocks.PLATINUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PLATINUM_SLAB = registerBlock("cut_platinum_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SoundType.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> PLATINUM_CUT = registerBlock("cut_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).sound(SoundType.NETHERITE_BLOCK)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
