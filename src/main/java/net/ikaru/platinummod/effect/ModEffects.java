package net.ikaru.platinummod.effect;

import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModEffects extends MobEffects{

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, PlatinumMod.MOD_ID);

    public static final ModEffect BLEED = register(32, "bleed", new ModEffect(MobEffectCategory.HARMFUL, 9643043));

    private static ModEffect register(int pId, String pKey, MobEffect pEffect) {
        return Registry.registerMapping(ModEffects.MOB_EFFECTS, pId, pKey, pEffect);
    }


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
