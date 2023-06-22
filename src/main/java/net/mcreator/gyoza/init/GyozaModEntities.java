
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gyoza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gyoza.entity.LightningEntity;
import net.mcreator.gyoza.entity.GyozaEntity;
import net.mcreator.gyoza.entity.ApalugiEntity;
import net.mcreator.gyoza.entity.AmitaEntity;
import net.mcreator.gyoza.GyozaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GyozaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GyozaMod.MODID);
	public static final RegistryObject<EntityType<GyozaEntity>> GYOZA = register("gyoza",
			EntityType.Builder.<GyozaEntity>of(GyozaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GyozaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightningEntity>> LIGHTNING = register("projectile_lightning",
			EntityType.Builder.<LightningEntity>of(LightningEntity::new, MobCategory.MISC).setCustomClientFactory(LightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ApalugiEntity>> APALUGI = register("apalugi",
			EntityType.Builder.<ApalugiEntity>of(ApalugiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApalugiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmitaEntity>> AMITA = register("amita",
			EntityType.Builder.<AmitaEntity>of(AmitaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmitaEntity::new)

					.sized(10f, 50f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GyozaEntity.init();
			ApalugiEntity.init();
			AmitaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GYOZA.get(), GyozaEntity.createAttributes().build());
		event.put(APALUGI.get(), ApalugiEntity.createAttributes().build());
		event.put(AMITA.get(), AmitaEntity.createAttributes().build());
	}
}
