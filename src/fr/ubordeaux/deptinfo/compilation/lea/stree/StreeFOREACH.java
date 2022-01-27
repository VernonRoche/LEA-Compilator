package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeFOREACH extends Stree {

	public StreeFOREACH(Stree left, StreeFOREACHCONT right) throws TypeException, StreeException {
		super(left, right);
	}

}
