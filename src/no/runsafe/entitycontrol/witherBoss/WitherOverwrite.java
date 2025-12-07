package no.runsafe.entitycontrol.witherBoss;

import no.runsafe.framework.api.event.IServerReady;
import no.runsafe.framework.tools.nms.EntityRegister;

public class WitherOverwrite implements IServerReady
{
	@Override
	public void OnServerReady()
	{
		EntityRegister.registerOverrideEntity(RunsafeWitherBoss.class, "Slime", 64);
	}
}
