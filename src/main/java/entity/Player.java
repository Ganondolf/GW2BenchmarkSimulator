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
	Specialization firstSpec;
	Specialization secondSpec;
	Specialization thirdSpec;
	WeaponSet principalWeaponSet;
	WeaponSet secondaryWeaponSet;

	@Override
	public String toString() {
		return "Player " + profession + " [" + firstSpec + ", " + secondSpec + ", " + thirdSpec + "]";
	}
}
