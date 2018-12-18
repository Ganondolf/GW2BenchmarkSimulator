package equip;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import skills.WeaponSkill;

@Accessors(fluent = true)
@Getter
@Setter
public class WeaponSet {

    WeaponSkill one;
    WeaponSkill two;
    WeaponSkill three;
    WeaponSkill four;
    WeaponSkill five;

    public WeaponSet(Weapon mainHand, Weapon offHand) {
        this.one = mainHand.one;
        this.two = mainHand.two;
        this.three = mainHand.three;
        this.four = offHand.four;
        this.five = offHand.five;
    }

    public WeaponSet(MainHand mainHand, OffHand offHand) {
        this.one = mainHand.one;
        this.two = mainHand.two;
        this.three = mainHand.three;
        this.four = offHand.four;
        this.five = offHand.five;
    }

    public WeaponSet(Weapon twoHanded) {
        this.one = twoHanded.one;
        this.two = twoHanded.two;
        this.three = twoHanded.three;
        this.four = twoHanded.four;
        this.five = twoHanded.five;
    }

}