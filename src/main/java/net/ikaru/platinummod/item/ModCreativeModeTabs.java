package net.ikaru.platinummod.item;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlatinumMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLATINUM_TAB = CREATIVE_MODE_TABS.register("platinum_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PLATINUM.get()))
                    .title(Component.translatable("creativetab.platinum_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PLATINUM.get());
                        pOutput.accept(ModItems.NEOPLATINUM.get());
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModItems.ENDER_TEAR.get());
                        pOutput.accept(ModItems.DRAGON_CHARGE.get());
                        pOutput.accept(ModItems.DRAGON_CORE.get());
                        pOutput.accept(ModItems.SYNTHETIC_DRAGON_CORE.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> PLATINUM_BLOCKS = CREATIVE_MODE_TABS.register("platinum_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PLATINUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.platinum_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.PLATINUM_DEEPORE.get());
                        pOutput.accept(ModBlocks.PLATINUM_CUT.get());
                        pOutput.accept(ModBlocks.PLATINUM_STAIRS.get());
                        pOutput.accept(ModBlocks.PLATINUM_SLAB.get());
                        pOutput.accept(ModBlocks.NEOPLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.NEOPLATINUM_CUT.get());
                        pOutput.accept(ModBlocks.NEOPLATINUM_STAIRS.get());
                        pOutput.accept(ModBlocks.NEOPLATINUM_SLAB.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> PLATINUM_GEAR = CREATIVE_MODE_TABS.register("platinum_gear",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PLATINUM_SWORD.get()))
                    .title(Component.translatable("creativetab.platinum_gear"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PLATINUM_SWORD.get());
                        pOutput.accept(ModItems.PLATINUM_PICKAXE.get());
                        pOutput.accept(ModItems.PLATINUM_AXE.get());
                        pOutput.accept(ModItems.PLATINUM_SHOVEL.get());
                        pOutput.accept(ModItems.PLATINUM_HOE.get());
                        pOutput.accept(ModItems.PLATINUM_HELMET.get());
                        pOutput.accept(ModItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(ModItems.PLATINUM_BOOTS.get());
                        pOutput.accept(ModItems.NEOPLATINUM_SWORD.get());
                        pOutput.accept(ModItems.NEOPLATINUM_PICKAXE.get());
                        pOutput.accept(ModItems.NEOPLATINUM_AXE.get());
                        pOutput.accept(ModItems.NEOPLATINUM_SHOVEL.get());
                        pOutput.accept(ModItems.NEOPLATINUM_HOE.get());
                        pOutput.accept(ModItems.NEOPLATINUM_HELMET.get());
                        pOutput.accept(ModItems.NEOPLATINUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.NEOPLATINUM_LEGGINGS.get());
                        pOutput.accept(ModItems.NEOPLATINUM_BOOTS.get());
                        pOutput.accept(ModItems.NEOPLATINUM_BATTLEAXE.get());
                        pOutput.accept(ModItems.WRENCH.get());
                        pOutput.accept(ModItems.WOODEN_BAT.get());
                        pOutput.accept(ModItems.METAL_BAT.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
