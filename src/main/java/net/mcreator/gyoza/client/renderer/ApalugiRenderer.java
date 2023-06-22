
package net.mcreator.gyoza.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gyoza.entity.ApalugiEntity;
import net.mcreator.gyoza.client.model.ModelApalugi;

public class ApalugiRenderer extends MobRenderer<ApalugiEntity, ModelApalugi<ApalugiEntity>> {
	public ApalugiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelApalugi(context.bakeLayer(ModelApalugi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ApalugiEntity entity) {
		return new ResourceLocation("gyoza:textures/entities/1.png");
	}
}
