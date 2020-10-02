package party.lemons.biomemakeover.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;
import party.lemons.biomemakeover.entity.MushroomVillagerEntity;
import party.lemons.biomemakeover.util.RegistryHelper;

public class BMEntities
{
	public static final EntityType<MushroomVillagerEntity> MUSHROOM_TRADER = FabricEntityTypeBuilder.<MushroomVillagerEntity>create(SpawnGroup.MISC, (t, w)->new MushroomVillagerEntity(w)).dimensions(EntityDimensions.fixed(0.6F, 1.95F)).trackRangeBlocks(12).build();

	public static void init()
	{
		RegistryHelper.register(Registry.ENTITY_TYPE, EntityType.class, BMEntities.class);
		initSpawns();
	}

	private static void initSpawns()
	{
	}
}
