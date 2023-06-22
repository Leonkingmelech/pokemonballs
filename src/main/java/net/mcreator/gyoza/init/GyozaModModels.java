
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gyoza.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.gyoza.client.model.ModelGyoza;
import net.mcreator.gyoza.client.model.ModelApalugi;
import net.mcreator.gyoza.client.model.ModelAmita;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GyozaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGyoza.LAYER_LOCATION, ModelGyoza::createBodyLayer);
		event.registerLayerDefinition(ModelAmita.LAYER_LOCATION, ModelAmita::createBodyLayer);
		event.registerLayerDefinition(ModelApalugi.LAYER_LOCATION, ModelApalugi::createBodyLayer);
	}
}
