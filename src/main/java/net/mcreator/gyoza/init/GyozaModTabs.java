
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gyoza.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GyozaModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(GyozaModItems.LIGHTNING.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GyozaModItems.GYOZA_SPAWN_EGG.get());
			tabData.accept(GyozaModItems.APALUGI_SPAWN_EGG.get());
			tabData.accept(GyozaModItems.AMITA_SPAWN_EGG.get());
		}
	}
}
