package net.moder0.vanillaplus.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.moder0.vanillaplus.VanillaPlus;
import net.moder0.vanillaplus.entity.custom.SculkZombieEntity;

public class SculkZombieRenderer extends MobEntityRenderer<SculkZombieEntity, SculkZombieModel<SculkZombieEntity>> {
    private static final Identifier TEXTURE = new Identifier(VanillaPlus.MOD_ID, "textures/entity/sculk/sculk_zombie.png");

    public SculkZombieRenderer(EntityRendererFactory.Context context) {
        super(context, new SculkZombieModel<>(context.getPart(ModModelLayers.SCULK_ZOMBIE)), 1.0f);
    }

    @Override
    public Identifier getTexture(SculkZombieEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SculkZombieEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()){
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
