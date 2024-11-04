package no.runsafe.entitycontrol;

import net.minecraft.server.v1_12_R1.Entity;
import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.event.entity.INaturalSpawn;
import no.runsafe.framework.internal.wrapper.ObjectUnwrapper;
import no.runsafe.framework.minecraft.entity.RunsafeEntity;

public class SpawnBlocker implements INaturalSpawn
{
	@Override
	public boolean OnNaturalSpawn(RunsafeEntity entity, ILocation location)
	{
		Entity rawEntity = ObjectUnwrapper.getMinecraft(entity);
		return !(rawEntity != null && Config.spawnBlockerWorlds.contains(location.getWorld().getName()));
	}
}
