package com.zing.zingsorestiers.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;

import com.zing.zingsorestiers.entity.CoalFireballEntity;
import com.zing.zingsorestiers.client.model.Modelcoal_fireball;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

public class CoalFireballRenderer extends EntityRenderer<CoalFireballEntity, LivingEntityRenderState> {
	private static final Identifier texture = Identifier.parse("zings_ores_and_tiers:textures/entities/coal_fireball.png");
	private final Modelcoal_fireball model;

	public CoalFireballRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelcoal_fireball(context.bakeLayer(Modelcoal_fireball.LAYER_LOCATION));
	}

	@Override
	public void submit(LivingEntityRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(state.yRot - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + state.xRot));
		model.setupAnim(state);
		submitNodeCollector.submitModel(this.model, state, poseStack, texture, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor, null);
		poseStack.popPose();
		super.submit(state, poseStack, submitNodeCollector, camera);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CoalFireballEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.xRot = entity.getXRot(partialTicks);
		state.yRot = entity.getYRot(partialTicks);
	}
}