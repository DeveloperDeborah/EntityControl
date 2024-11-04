package no.runsafe.entitycontrol;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.event.entity.IEntityDeathEvent;
import no.runsafe.framework.minecraft.Item;
import no.runsafe.framework.minecraft.entity.LivingEntity;
import no.runsafe.framework.minecraft.entity.RunsafeEntity;
import no.runsafe.framework.minecraft.event.entity.RunsafeEntityDeathEvent;

public class EntityDeath implements IEntityDeathEvent
{
	public EntityDeath()
	{
	}

	@Override
	public void OnEntityDeath(RunsafeEntityDeathEvent event)
	{
		RunsafeEntity entity = event.getEntity();
		if (entity.getEntityType() == LivingEntity.EnderDragon && Config.enderDragonDropsEgg)
		{
			ILocation location = entity.getLocation();
			if (location != null)
			{
				Item.Special.DragonEgg.Drop(location, 1);
			}
		}
	}
}
