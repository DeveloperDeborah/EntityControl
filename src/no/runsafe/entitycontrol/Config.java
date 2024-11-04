package no.runsafe.entitycontrol;

import no.runsafe.framework.api.IConfiguration;
import no.runsafe.framework.api.event.plugin.IConfigurationChanged;

import java.util.ArrayList;
import java.util.List;

public class Config implements IConfigurationChanged
{
	@Override
	public void OnConfigurationChanged(IConfiguration configuration)
	{
		disableEnderPortalCreation = configuration.getConfigValueAsBoolean("disableEnderPortalCreation");
		enderDragonDropsEgg = configuration.getConfigValueAsBoolean("enderDragonDropsEgg");
		azurenWorldName = configuration.getConfigValueAsString("azurenWorldName");
		spawnBlockerWorlds = configuration.getConfigValueAsList("preventNaturalSpawning");
	}

	public static boolean disableEnderPortalCreation;
	public static boolean enderDragonDropsEgg;
	public static String azurenWorldName;
	public static List<String> spawnBlockerWorlds = new ArrayList<>(0);
}
