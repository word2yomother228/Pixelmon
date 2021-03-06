package pixelmon.battles.attacks.specialAttacks;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityLiving;

public class Guillotine extends SpecialAttackBase {

	public Guillotine() {
		super(SpecialAttackType.Guillotine, ApplyStage.During, false);
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target, Attack a, ArrayList<String> attackList, ArrayList<String> targetAttackList) {
		ChatHandler.sendChat(user.getOwner(), target.getOwner(), "It's a one-hit-KO!");
		target.attackEntityFrom(DamageSource.causeMobDamage(user), target.getHealth());
		return true;
	}
	
	public boolean hasSpecialAccuracyEffect() {
		return true;
	}

	public double getAccuracy(EntityPixelmon user, EntityPixelmon target) {
		if (target.getLvl().getLevel() > user.getLvl().getLevel()) return 0;
		
		return (user.getLvl().getLevel() - target.getLvl().getLevel()) + 30;
	}
}
