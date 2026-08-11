package net.ikaru.platinummod.entity;

import net.ikaru.platinummod.effect.ModEffects;
import net.ikaru.platinummod.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class PlatinumArrow extends AbstractArrow {

    public PlatinumArrow(EntityType<? extends AbstractArrow> type, Level worldIn) {
        super(type, worldIn);
        this.setBaseDamage(2.5F);
    }

    public PlatinumArrow(EntityType<? extends AbstractArrow> type, Level worldIn, double x, double y,
                                 double z) {
        this(type, worldIn);
        this.setPos(x, y, z);
        this.setBaseDamage(2.5F);
    }

    public PlatinumArrow(PlayMessages.SpawnEntity spawnEntity, Level world) {
        this(ModEntities.PLATINUM_ARROW.get(), world);
    }

    public PlatinumArrow(EntityType type, LivingEntity shooter, Level worldIn) {
        super(type, shooter, worldIn);
        this.setBaseDamage(2.5F);
    }


    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide && !this.inGround) {
            this.level().addParticle(ParticleTypes.CRIMSON_SPORE, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void doPostHurtEffects(@NotNull LivingEntity livingEntity) {
        super.doPostHurtEffects(livingEntity);
        MobEffectInstance mobEffectInstance = new MobEffectInstance(ModEffects.BLEED.get(), 200, 0);
        livingEntity.addEffect(mobEffectInstance, this.getEffectSource());
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.PLATINUM_ARROW.get());
    }
}