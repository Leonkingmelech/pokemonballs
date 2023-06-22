
package pokemonballs.client.renderer;

import pokemonballs.entity.GyozaEntity;

import pokemonballs.client.model.ModelGyoza;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GyozaRenderer extends MobRenderer<GyozaEntity, ModelGyoza<GyozaEntity>> {
	public GyozaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGyoza(context.bakeLayer(ModelGyoza.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GyozaEntity entity) {
		return new ResourceLocation("pokeballs:textures/entities/pigman.png");
	}
}
