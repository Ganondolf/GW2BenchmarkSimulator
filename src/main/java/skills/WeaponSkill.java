package skills;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public abstract class WeaponSkill {
    Double damage;
    Double aftercast;
    Double castTime;
    Double cooldown;
}