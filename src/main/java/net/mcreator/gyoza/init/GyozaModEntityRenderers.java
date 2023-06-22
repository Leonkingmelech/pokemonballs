
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gyoza.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.gyoza.client.renderer.GyozaRenderer;
import net.mcreator.gyoza.client.renderer.ApalugiRenderer;
import net.mcreator.gyoza.client.renderer.AmitaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GyozaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GyozaModEntities.GYOZA.get(), GyozaRenderer::new);
		event.registerEntityRenderer(GyozaModEntities.LIGHTNING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GyozaModEntities.APALUGI.get(), ApalugiRenderer::new);
		event.registerEntityRenderer(GyozaModEntities.AMITA.get(), AmitaRenderer::new);
	}
}
