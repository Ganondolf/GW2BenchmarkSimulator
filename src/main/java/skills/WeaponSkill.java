package skills;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public abstract class WeaponSkill {
    boolean autoattack = false;
    Double aftercast;
    Double castTime;
    Double cooldown;
}