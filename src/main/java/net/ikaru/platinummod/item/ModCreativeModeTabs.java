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
                        pOutput.accept(ModItems.RAW_PLATINUM.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
