package net.ikaru.platinummod.client;

import net.ikaru.platinummod.CommonProxy;
import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PlatinumMod.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new ForgeHooksClient.ClientEvents());
    }

    @Override
    public void postInit() {

    }

    @Override
    public void clientInit() {
        super.clientInit();
        ClientSetup.clientInit();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public Player getClientSidePlayer() {
        return Minecraft.getInstance().player;
    }
}
