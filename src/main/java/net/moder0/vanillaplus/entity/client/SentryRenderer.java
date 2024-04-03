package net.moder0.vanillaplus.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.entity.custom.SentryEntity;

public class SentryRenderer extends MobEntityRenderer <SentryEntity, SentryModel<SentryEntity>> {
    private static final Identifier TEXTURE = new Identifier(VanillaPlus.MOD_ID, "textures/entity/sculk/sentry.png");

    public SentryRenderer(EntityRendererFactory.Context context) {
        super(context, new SentryModel<>(context.getPart(ModModelLayers.SENTRY)), 1.0f);
    }

    @Override
    public Identifier getTexture(SentryEntity entity) {
        return TEXTURE;
    }
}
