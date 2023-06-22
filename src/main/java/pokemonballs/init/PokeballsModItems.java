
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokemonballs.init;

import pokemonballs.item.LightningItem;

import pokemonballs.PokeballsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class PokeballsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PokeballsMod.MODID);
	public static final RegistryObject<Item> GYOZA_SPAWN_EGG = REGISTRY.register("gyoza_spawn_egg", () -> new ForgeSpawnEggItem(PokeballsModEntities.GYOZA, -2512077, -2847027, new Item.Properties()));
	public static final RegistryObject<Item> LIGHTNING = REGISTRY.register("lightning", () -> new LightningItem());
	public static final RegistryObject<Item> APALUGI_SPAWN_EGG = REGISTRY.register("apalugi_spawn_egg", () -> new ForgeSpawnEggItem(PokeballsModEntities.APALUGI, -13012458, -2943980, new Item.Properties()));
	public static final RegistryObject<Item> AMITA_SPAWN_EGG = REGISTRY.register("amita_spawn_egg", () -> new ForgeSpawnEggItem(PokeballsModEntities.AMITA, -16777216, -12305900, new Item.Properties()));
}
