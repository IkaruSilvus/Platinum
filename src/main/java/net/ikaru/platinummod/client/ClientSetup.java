package net.ikaru.platinummod.client;

import net.ikaru.platinummod.PlatinumMod;
import net.ikaru.platinummod.client.render.PlatinumArrowRenderer;
import net.ikaru.platinummod.entity.ModEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = PlatinumMod.MOD_ID)
public class ClientSetup {

    public static void clientInit() {
        EntityRenderers.register(ModEntities.PLATINUM_ARROW.get(), PlatinumArrowRenderer::new);
    }
}
