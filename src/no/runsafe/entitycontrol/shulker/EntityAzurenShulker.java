package no.runsafe.entitycontrol.shulker;

import net.minecraft.server.v1_12_R1.*;
import no.runsafe.entitycontrol.Config;
import no.runsafe.framework.tools.reflection.ReflectionHelper;

public class EntityAzurenShulker extends EntityShulker
{
	public EntityAzurenShulker(World world)
	{
		super(world);
		//by -> shulker colour
		ReflectionHelper.setField(this, "by", EnumColor.BLACK);
		this.persistent = false;
	}

	@Override
	public boolean canSpawn()
	{
		return world.getDifficulty() != EnumDifficulty.PEACEFUL
			&& world.getWorldData().getName().equals(Config.azurenWorldName)
			&& random.nextInt(100) == 0;
	}

	@Override
	protected void dropDeathLoot(boolean flag, int i)
	{
		a(Items.COOKIE, 3);
	}
}
