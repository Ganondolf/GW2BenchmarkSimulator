package equip;

import skills.Chop;
import skills.CycloneAxe;
import skills.DualStrike;
import skills.ThrowAxe;
import skills.WhirlingAxe;

public class WarriorAxe extends Weapon {
    public WarriorAxe() {
        this.one = new Chop();
        this.two = new CycloneAxe();
        this.three = new ThrowAxe();
        this.four = new DualStrike();
        this.five = new WhirlingAxe();
    }
}