
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokemonballs.init;

import pokemonballs.client.renderer.GyozaRenderer;
import pokemonballs.client.renderer.ApalugiRenderer;
import pokemonballs.client.renderer.AmitaRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeballsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PokeballsModEntities.GYOZA.get(), GyozaRenderer::new);
		event.registerEntityRenderer(PokeballsModEntities.LIGHTNING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PokeballsModEntities.APALUGI.get(), ApalugiRenderer::new);
		event.registerEntityRenderer(PokeballsModEntities.AMITA.get(), AmitaRenderer::new);
	}
}
