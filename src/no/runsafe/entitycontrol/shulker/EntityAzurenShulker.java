package no.runsafe.entitycontrol.shulker;

import net.minecraft.server.v1_12_R1.*;
import no.runsafe.entitycontrol.Config;
import no.runsafe.entitycontrol.Plugin;
import no.runsafe.framework.tools.reflection.ReflectionHelper;

import java.util.logging.Level;

public class EntityAzurenShulker extends EntityShulker
{
	public EntityAzurenShulker(World world)
	{
		super(world);
		//by -> shulker colour
		ReflectionHelper.setField(this, "by", EnumColor.BLACK);
		this.persistent = false;
		Plugin.Debugger.outputDebugToConsole("Spawning in Azuren Shulker", Level.FINE);
	}

	@Override
	public boolean canSpawn()
	{
		Plugin.Debugger.outputDebugToConsole("Attemping to spawn azuren shukler in world: " + world.getWorldData().getName(), Level.FINE);

		return world.getDifficulty() != EnumDifficulty.PEACEFUL
			&& world.getWorldData().getName().equals(Config.azurenWorldName)
			&& random.nextInt(100) == 0;
	}

	@Override
	protected void dropDeathLoot(boolean flag, int i)
	{
		Plugin.Debugger.outputDebugToConsole("Running death loot for azuren shulker.", Level.FINE);
		a(Items.COOKIE, 3);
	}
}
