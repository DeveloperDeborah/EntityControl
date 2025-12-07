package no.runsafe.entitycontrol.witherBoss;

import com.google.common.base.Predicate;
import net.minecraft.server.v1_12_R1.*;
import no.runsafe.framework.tools.reflection.ReflectionHelper;

public class RunsafeWitherBoss extends EntityWither
{
	public RunsafeWitherBoss(World world)
	{
		super(world);
	}

	@Override
	protected void r()
	{
		this.goalSelector.a(0, (dm() > 0));
		this.goalSelector.a(2, new PathfinderGoalArrowAttack(this, 1.0F, 40, 20.0F));
		this.goalSelector.a(5, new PathfinderGoalRandomStrollLand(this, 1.0F));
		this.goalSelector.a(6, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
		this.goalSelector.a(7, new PathfinderGoalRandomLookaround(this));
		this.targetSelector.a(1, new PathfinderGoalHurtByTarget(this, false, new Class[0]));
		this.targetSelector.a(
			2, new PathfinderGoalNearestAttackableTarget(this, EntityInsentient.class, 0, false, false,
			(Predicate) ReflectionHelper.getObjectField(this, "bH"))
		);
	}
}
