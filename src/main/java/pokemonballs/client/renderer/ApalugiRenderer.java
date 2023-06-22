
package pokemonballs.client.renderer;

import pokemonballs.entity.ApalugiEntity;

import pokemonballs.client.model.ModelApalugi;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ApalugiRenderer extends MobRenderer<ApalugiEntity, ModelApalugi<ApalugiEntity>> {
	public ApalugiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelApalugi(context.bakeLayer(ModelApalugi.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ApalugiEntity entity) {
		return new ResourceLocation("pokeballs:textures/entities/1.png");
	}
}
