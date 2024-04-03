package net.moder0.vanillaplus.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.moder0.vanillaplus.entity.animation.SculkZombieAnimations;
import net.moder0.vanillaplus.entity.animation.SentryAnimations;
import net.moder0.vanillaplus.entity.custom.SentryEntity;

public class SentryModel<T extends SentryEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Sentry;
	private final ModelPart head;

	public SentryModel(ModelPart root) {
		this.Sentry = root.getChild("Sentry");
		this.head = Sentry.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Sentry = modelPartData.addChild("Sentry", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData left_leg = Sentry.addChild("left_leg", ModelPartBuilder.create().uv(30, 30).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, -30.0F, 0.0F));

		ModelPartData right_leg = Sentry.addChild("right_leg", ModelPartBuilder.create().uv(30, 30).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -30.0F, 0.0F));

		ModelPartData left_arm = Sentry.addChild("left_arm", ModelPartBuilder.create().uv(30, 30).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -37.0F, 0.0F));

		ModelPartData right_arm = Sentry.addChild("right_arm", ModelPartBuilder.create().uv(30, 30).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -37.0F, 0.0F));

		ModelPartData head = Sentry.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -39.0F, 0.0F));

		ModelPartData body = Sentry.addChild("body", ModelPartBuilder.create().uv(0, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -39.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}



	@Override
	public void setAngles(SentryEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.updateAnimation(entity.idleAnimationState, SentryAnimations.IDLE, ageInTicks, 1f);
		this.animateMovement(SentryAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	private void setHeadAngles(float headYaw, float headPitch){
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Sentry.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Sentry;
	}
}