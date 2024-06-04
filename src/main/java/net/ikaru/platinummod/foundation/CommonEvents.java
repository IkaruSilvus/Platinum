package net.ikaru.platinummod.foundation;

import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.forgespi.language.IModFileInfo;
import net.minecraftforge.forgespi.locating.IModFile;

@EventBusSubscriber
public class CommonEvents {

    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
    public static class ModBusEvents {
        @SubscribeEvent
        public static void addPackFinders(AddPackFindersEvent event) {
            if (event.getPackType() == PackType.CLIENT_RESOURCES) {
                IModFileInfo modFileInfo = ModList.get().getModFileById(PlatinumMod.MOD_ID);
                if (modFileInfo == null) {
                    PlatinumMod.LOGGER.error("Could not find Platinum mod file info; built-in resource packs will be missing!");
                    return;
                }
                IModFile modFile = modFileInfo.getFile();
                event.addRepositorySource(consumer -> {
                    Pack pack = Pack.readMetaAndCreate(PlatinumMod.asResource("old_platinum").toString(), Components.literal("Old Platinum"), false, id -> new ModFilePackResources(id, modFile, "resourcepacks/old_platinum"), PackType.CLIENT_RESOURCES, Pack.Position.TOP, PackSource.BUILT_IN);
                    if (pack != null) {
                        consumer.accept(pack);
                    }
                });
                event.addRepositorySource(consumer -> {
                    Pack pack = Pack.readMetaAndCreate(PlatinumMod.asResource("legacy_copper_platinum").toString(), Components.literal("Create Legacy Copper Tools"), false, id -> new ModFilePackResources(id, modFile, "resourcepacks/legacy_copper_platinum"), PackType.CLIENT_RESOURCES, Pack.Position.TOP, PackSource.BUILT_IN);
                    if (pack != null) {
                        consumer.accept(pack);
                    }
                });
            }
        }
    }


}
