package net.ikaru.platinummod.effect;

import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

public class ModEffect  extends MobEffect implements net.minecraftforge.common.extensions.IForgeMobEffect{

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, PlatinumMod.MOD_ID);

    protected ModEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }


    @Override
    public void applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if (this == ModEffects.BLEED) {
            pLivingEntity.hurt(pLivingEntity.damageSources().wither(), 1.0F);
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        if (this == ModEffects.BLEED) {
            int i = 30 >> pAmplifier;
            if (i > 0) {
                return pDuration % i == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
