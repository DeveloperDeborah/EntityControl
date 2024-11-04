package no.runsafe.entitycontrol.shulker;

import net.minecraft.server.v1_12_R1.EntityShulker;
import net.minecraft.server.v1_12_R1.EnumDifficulty;
import net.minecraft.server.v1_12_R1.World;

public class EntityAzurenShulker extends EntityShulker
{
	public EntityAzurenShulker(World world)
	{
		super(world);
		//by -> shulker colour
		//by = EnumColor.BLACK; // TODO: reflection

		// TODO : disable persistence
	}

	@Override
	public boolean canSpawn()
	{
		return world.getDifficulty() != EnumDifficulty.PEACEFUL
			&& random.nextInt(100) == 0;
			// TODO check world
	}
}
