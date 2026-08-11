package net.ikaru.platinummod.effect;

import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import org.jetbrains.annotations.NotNull;

public class ModEffects extends MobEffects{

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PlatinumMod.MOD_ID);

    public static final RegistryObject<ModEffect> BLEED = MOB_EFFECTS.register("bleed", () ->
            new ModEffect(MobEffectCategory.HARMFUL, 9643043));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
