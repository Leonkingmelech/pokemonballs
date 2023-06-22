
package pokemonballs.client.renderer;

import pokemonballs.entity.AmitaEntity;

import pokemonballs.client.model.ModelAmita;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AmitaRenderer extends MobRenderer<AmitaEntity, ModelAmita<AmitaEntity>> {
	public AmitaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAmita(context.bakeLayer(ModelAmita.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AmitaEntity entity) {
		return new ResourceLocation("pokeballs:textures/entities/a.png");
	}
}
