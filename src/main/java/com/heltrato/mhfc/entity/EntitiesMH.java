package com.heltrato.mhfc.entity;

import com.heltrato.mhfc.MainMH;
import com.heltrato.mhfc.generator.LanguagesMH;
import com.heltrato.mhfc.generator.LootTableMH;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntitiesMH {

	public static DeferredRegister<EntityType<?>> MOD_ENTITY = DeferredRegister.create(ForgeRegistries.ENTITIES,
			MainMH.MODID);

	static int TRACKINGRANGE = 80;// DEFAULT for Projectiles.
	static int UPDATEINTERVAL = 3;// DEFAULT for Projectiles.
	static boolean RECEIVEDUPDATES = true; // DEFAULT for Projectiles.

	// TODO PERHAPS MOVE THIS IN THEM ENTITY CLASS.
	//static EntityType<FelyneEntity> FELYNE_ENTITY_TYPE = EntityType.Builder.create(FelyneEntity::new, EntityClassification.CREATURE).size(0.4F, 0.4F).build("felyne");
	//static RegistryObject<EntityType<FelyneEntity>> FELYNE_OBJECT = MOD_ENTITY.register("felyne",() -> FELYNE_ENTITY_TYPE);
	//static EntityType<PopoEntity> POPO_ENTITY_TYPE = EntityType.Builder.create(PopoEntity::new, EntityClassification.CREATURE).size(1.0F,1.0f).build("popo");
	// RegistryObject<EntityType<PopoEntity>> POPO_OBJECT = MOD_ENTITY.register("popo", () -> POPO_ENTITY_TYPE);



	public static void addEntityLanguage(final LanguagesMH arg) {
		//arg.addEntityType(FELYNE_OBJECT, "Felyne");
		//arg.addEntityType(POPO_OBJECT, "Popo");

	}
	
	public static void addEntityLoot(final LootTableMH.AddEntityLoots arg) {
		//arg.registerLootTables(FELYNE_OBJECT, LootTable.builder());
		//arg.registerLootTables(POPO_OBJECT, LootTable.builder());
	}

	public static void addEntitySpawnPlacement() {
		//EntitySpawnPlacementRegistry.register(FELYNE_ENTITY_TYPE, PlacementType.ON_GROUND,Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, FelyneEntity::canSpawnOn);
		//EntitySpawnPlacementRegistry.register(POPO_ENTITY_TYPE, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PopoEntity::canSpawnOn);

	}

	@OnlyIn(Dist.CLIENT)
	public static void addEntityRenderer() {
		//RenderingRegistry.registerEntityRenderingHandler(FELYNE_ENTITY_TYPE, m -> new FelyneRenderer(m));
		//RenderingRegistry.registerEntityRenderingHandler(POPO_ENTITY_TYPE, m -> new PopoRenderer(m, 2.0f));
	}

	public static void addEntityAttributes(){
		//GlobalEntityTypeAttributes.put(FELYNE_ENTITY_TYPE, FelyneEntity.registerAttributes().create());
		//GlobalEntityTypeAttributes.put(POPO_ENTITY_TYPE, PopoEntity.registerAttributes().create());

	}

}
