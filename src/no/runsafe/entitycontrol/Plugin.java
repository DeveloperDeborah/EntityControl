package no.runsafe.entitycontrol;

import no.runsafe.entitycontrol.customEntities.*;
import no.runsafe.entitycontrol.customEntities.commands.Spawn;
import no.runsafe.entitycontrol.horseHolder.HorseHolderHandler;
import no.runsafe.entitycontrol.horseHolder.SpawnHorseFromString;
import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.api.command.Command;
import no.runsafe.framework.features.Commands;
import no.runsafe.framework.features.Database;
import no.runsafe.framework.features.Events;

public class Plugin extends RunsafeConfigurablePlugin
{
	@Override
	protected void pluginSetup()
	{
		addComponent(Commands.class);
		addComponent(Events.class);
		addComponent(Database.class);

		this.addComponent(Options.class);
		this.addComponent(EntityPortalCreation.class);
		this.addComponent(EntityDeath.class);
		//this.addComponent(EntitySpawn.class);

		addComponent(HorseHolderHandler.class);
		addComponent(SpawnHorseFromString.class);

		// Custom entity stuff
		addComponent(NPCHandler.class);

		Command npcCommand = new Command("npc", "NPC related commands", null);
		addComponent(npcCommand);

		npcCommand.addSubCommand(getInstance(Spawn.class));
	}
}
