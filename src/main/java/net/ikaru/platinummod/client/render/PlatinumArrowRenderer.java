package net.ikaru.platinummod.client.render;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class PlatinumArrowRenderer extends ArrowRenderer {
    private static final ResourceLocation TEXTURE = new ResourceLocation("platinum_mod:textures/models/misc/platinum_arrow.png");


    public PlatinumArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Entity entity) {
        return TEXTURE;
    }
}
