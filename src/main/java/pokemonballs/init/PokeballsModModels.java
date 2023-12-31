
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokemonballs.init;

import pokemonballs.client.model.ModelGyoza;
import pokemonballs.client.model.ModelApalugi;
import pokemonballs.client.model.ModelAmita;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PokeballsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGyoza.LAYER_LOCATION, ModelGyoza::createBodyLayer);
		event.registerLayerDefinition(ModelAmita.LAYER_LOCATION, ModelAmita::createBodyLayer);
		event.registerLayerDefinition(ModelApalugi.LAYER_LOCATION, ModelApalugi::createBodyLayer);
	}
}
