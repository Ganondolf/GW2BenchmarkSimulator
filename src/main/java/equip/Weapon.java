package equip;

import lombok.Getter;
import lombok.experimental.Accessors;
import skills.WeaponSkill;

@Accessors(fluent = true)
@Getter
public abstract class Weapon {

    RarityEnum rarity;
    StatsEnum stats;

    WeaponSkill one;
    WeaponSkill two;
    WeaponSkill three;
    WeaponSkill four;
    WeaponSkill five;

    public Weapon() {
        this(RarityEnum.ASCENDED, StatsEnum.BERSERKER);
    }

    public Weapon(RarityEnum rarity, StatsEnum stats) {
        this.rarity = rarity;
        this.stats = stats;
    }
}