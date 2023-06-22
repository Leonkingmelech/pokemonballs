
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokemonballs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeballsModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(PokeballsModItems.LIGHTNING.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PokeballsModItems.GYOZA_SPAWN_EGG.get());
			tabData.accept(PokeballsModItems.APALUGI_SPAWN_EGG.get());
			tabData.accept(PokeballsModItems.AMITA_SPAWN_EGG.get());
		}
	}
}
