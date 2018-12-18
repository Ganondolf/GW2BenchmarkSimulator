package equip;

import lombok.Getter;
import lombok.experimental.Accessors;
import skills.WeaponSkill;

@Accessors(fluent = true)
@Getter
public abstract class Weapon {
    WeaponSkill one;
    WeaponSkill two;
    WeaponSkill three;
    WeaponSkill four;
    WeaponSkill five;
}