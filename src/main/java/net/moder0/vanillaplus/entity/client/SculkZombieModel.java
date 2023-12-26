package net.moder0.vanillaplus.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.moder0.vanillaplus.entity.animation.SculkZombieAnimations;
import net.moder0.vanillaplus.entity.custom.SculkZombieEntity;

public class SculkZombieModel<T extends SculkZombieEntity> extends SinglePartEntityModel<T> {
	private final ModelPart sculk_zombie;

	private final ModelPart head;

	public SculkZombieModel(ModelPart root) {
		this.sculk_zombie = root.getChild("sculk_zombie");
		this.head = sculk_zombie.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData sculk_zombie = modelPartData.addChild("sculk_zombie", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData right_leg = sculk_zombie.addChild("right_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData left_leg = sculk_zombie.addChild("left_leg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData right_arm = sculk_zombie.addChild("right_arm", ModelPartBuilder.create().uv(40, 16).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData left_arm = sculk_zombie.addChild("left_arm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData body = sculk_zombie.addChild("body", ModelPartBuilder.create().uv(16, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		//ModelPartData headwear = sculk_zombie.addChild("headwear", ModelPartBuilder.create().uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData head = sculk_zombie.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(SculkZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.updateAnimation(entity.idleAnimationState, SculkZombieAnimations.MODEL_IDLE, ageInTicks, 1f);
		this.animateMovement(SculkZombieAnimations.MODEL_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);

	}

	private void setHeadAngles(float headYaw, float headPitch){
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		sculk_zombie.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return sculk_zombie;
	}
}