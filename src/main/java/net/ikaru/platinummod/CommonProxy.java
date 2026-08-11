package net.ikaru.platinummod;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = PlatinumMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {


    public void preInit() {

    }

    public void init() {

    }

    public void postInit() {
    }


    public Player getClientSidePlayer() {
        return null;
    }

    public void clientInit() {
    }
}