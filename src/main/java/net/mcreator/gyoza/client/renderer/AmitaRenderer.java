
package net.mcreator.gyoza.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.gyoza.entity.AmitaEntity;
import net.mcreator.gyoza.client.model.ModelAmita;

public class AmitaRenderer extends MobRenderer<AmitaEntity, ModelAmita<AmitaEntity>> {
	public AmitaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAmita(context.bakeLayer(ModelAmita.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmitaEntity entity) {
		return new ResourceLocation("gyoza:textures/entities/a.png");
	}
}
