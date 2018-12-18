package skills;

import java.util.Arrays;

public class WarriorAxeAA extends AutoAttackChain {

    public WarriorAxeAA() {
        this.chain = Arrays.asList(new Chop(), new DoubleChop(), new TripleChop());
    }

    public class Chop extends AutoAttackSkill {
        Double damage = 0.7;
        Double castTime = 0.25;
    }

    public class DoubleChop extends AutoAttackSkill {
        Double damage = 3.0;
        Double castTime = 0.0;
    }

    public class TripleChop extends AutoAttackSkill {
        Double damage = 4.6;
        Double castTime = 1.50;
    }

}