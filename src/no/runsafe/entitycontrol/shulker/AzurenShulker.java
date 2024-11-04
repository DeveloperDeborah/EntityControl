package no.runsafe.entitycontrol.shulker;

import no.runsafe.framework.api.event.IServerReady;
import no.runsafe.framework.tools.nms.EntityRegister;

public class AzurenShulker implements IServerReady
{
	@Override
	public void OnServerReady()
	{
		EntityRegister.registerOverrideEntity(EntityAzurenShulker.class, "Shulker", 69);
	}
}
