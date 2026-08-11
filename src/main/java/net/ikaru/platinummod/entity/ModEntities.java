package net.ikaru.platinummod.entity;

import net.ikaru.platinummod.PlatinumMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = PlatinumMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            PlatinumMod.MOD_ID);

    public static final RegistryObject<EntityType<PlatinumArrow>> PLATINUM_ARROW = registerEntity(EntityType.Builder.<PlatinumArrow>of(PlatinumArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).setCustomClientFactory(PlatinumArrow::new), "platinum_arrow");

    private static final <T extends Entity> RegistryObject<EntityType<T>> registerEntity(EntityType.Builder<T> builder, String entityName) {
        return ENTITIES.register(entityName, () -> builder.build(entityName));
    }
}
