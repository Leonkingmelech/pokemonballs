package net.mcreator.gyoza.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelAmita<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("gyoza", "model_amita"), "main");
	public final ModelPart Leg2;
	public final ModelPart Leg;
	public final ModelPart Body;
	public final ModelPart Arm;
	public final ModelPart Arm2;
	public final ModelPart Head;

	public ModelAmita(ModelPart root) {
		this.Leg2 = root.getChild("Leg2");
		this.Leg = root.getChild("Leg");
		this.Body = root.getChild("Body");
		this.Arm = root.getChild("Arm");
		this.Arm2 = root.getChild("Arm2");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Leg2 = partdefinition.addOrReplaceChild("Leg2", CubeListBuilder.create().texOffs(-4, -4).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 250.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-72.0F, -247.0F, 0.0F));
		PartDefinition cube_r1 = Leg2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 247.0F, 0.0F, -2.663F, -0.0806F, -3.1081F));
		PartDefinition cube_r2 = Leg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 247.0F, 0.0F, 0.4152F, 0.3215F, 0.1384F));
		PartDefinition cube_r3 = Leg2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 247.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Leg2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 247.0F, 0.0F, 0.4152F, -0.3215F, -0.1384F));
		PartDefinition Leg = partdefinition.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(-4, -4).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 250.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, -247.0F, 0.0F));
		PartDefinition cube_r5 = Leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 247.0F, 0.0F, -2.663F, -0.0806F, -3.1081F));
		PartDefinition cube_r6 = Leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 247.0F, 0.0F, 0.4152F, 0.3215F, 0.1384F));
		PartDefinition cube_r7 = Leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 247.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 59).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 3.0F, -57.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 247.0F, 0.0F, 0.4152F, -0.3215F, -0.1384F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(177, 39).addBox(-26.0F, -311.0F, -23.0F, 139.0F, 311.0F, 50.0F, new CubeDeformation(0.0F)), PartPose.offset(-72.0F, -247.0F, 0.0F));
		PartDefinition Arm = partdefinition.addOrReplaceChild("Arm", CubeListBuilder.create(), PartPose.offset(0.0F, -103.0F, 0.0F));
		PartDefinition cube_r9 = Arm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(634, 14).addBox(0.0F, -12.0F, -23.0F, 133.0F, 466.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0F, -429.0F, 0.0F, 0.2161F, -0.149F, -0.9761F));
		PartDefinition Arm2 = partdefinition.addOrReplaceChild("Arm2", CubeListBuilder.create(), PartPose.offset(-268.0F, -103.0F, 0.0F));
		PartDefinition cube_r10 = Arm2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(633, 0).addBox(-126.843F, -12.0F, -19.5759F, 133.0F, 466.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(162.0F, -429.0F, 0.0F, 0.2095F, 0.1582F, 0.933F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 778).addBox(-89.0F, -703.0F, -60.0F, 119.0F, 122.0F, 100.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 1000, 1000);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Arm2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
