package equip;

import skills.WarriorAxeAA;
import skills.CycloneAxe;
import skills.DualStrike;
import skills.ThrowAxe;
import skills.WhirlingAxe;

public class WarriorAxe extends Weapon {

    public WarriorAxe() {
        super();
    }

    public WarriorAxe(RarityEnum rarity, StatsEnum stats) {
        super(rarity, stats);
        this.one = new WarriorAxeAA();
        this.two = new CycloneAxe();
        this.three = new ThrowAxe();
        this.four = new DualStrike();
        this.five = new WhirlingAxe();
    }

}
