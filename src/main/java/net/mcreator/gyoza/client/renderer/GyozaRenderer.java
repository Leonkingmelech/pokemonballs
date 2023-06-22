
package net.mcreator.gyoza.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gyoza.entity.GyozaEntity;
import net.mcreator.gyoza.client.model.ModelGyoza;

public class GyozaRenderer extends MobRenderer<GyozaEntity, ModelGyoza<GyozaEntity>> {
	public GyozaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGyoza(context.bakeLayer(ModelGyoza.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GyozaEntity entity) {
		return new ResourceLocation("gyoza:textures/entities/pigman.png");
	}
}
