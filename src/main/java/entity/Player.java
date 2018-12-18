package entity;

import build.Specialization;
import equip.WeaponSet;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public abstract class Player {
	@Setter(AccessLevel.NONE)
	ProfessionEnum profession;
	Specialization first;
	Specialization second;
	Specialization third;
	WeaponSet principalWeaponSet;
	WeaponSet secondaryWeaponSet;

	@Override
	public String toString() {
		return "Player " + profession + " [" + first + ", " + second + ", " + third + "]";
	}
}
