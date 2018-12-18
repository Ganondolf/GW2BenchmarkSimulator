package entity;

import build.ProfessionEnum;
import build.Traitline;

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
	Traitline first;
	Traitline second;
	Traitline third;

	@Override
	public String toString() {
		return "Player [" + profession + ", first=" + first + ", second=" + second + ", third=" + third + "]";
	}
}
