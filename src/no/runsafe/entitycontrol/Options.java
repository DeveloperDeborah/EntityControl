package no.runsafe.entitycontrol;

import no.runsafe.framework.api.IConfiguration;
import no.runsafe.framework.api.event.plugin.IConfigurationChanged;

public class Options implements IConfigurationChanged
{
	public boolean disableEnderPortalCreation()
	{
		return this.disableEnderPortalCreation;
	}

	public boolean enderDragonDropsEgg()
	{
		return this.enderDragonDropsEgg;
	}

	public String getAzurenWorldName()
	{
		return this.azurenWorldName;
	}

	@Override
	public void OnConfigurationChanged(IConfiguration configuration)
	{
		this.disableEnderPortalCreation = configuration.getConfigValueAsBoolean("disableEnderPortalCreation");
		this.enderDragonDropsEgg = configuration.getConfigValueAsBoolean("enderDragonDropsEgg");
		this.azurenWorldName = configuration.getConfigValueAsString("azurenWorldName");
	}

	private boolean disableEnderPortalCreation;
	private boolean enderDragonDropsEgg;
	private String azurenWorldName;
}
