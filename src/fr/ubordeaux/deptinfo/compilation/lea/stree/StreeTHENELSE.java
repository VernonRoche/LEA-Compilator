package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeTHENELSE extends Stree {

	public StreeTHENELSE(Stree left, Stree right) throws TypeException, StreeException {
		super(left, right);
	}

	public StreeTHENELSE(Stree left) throws TypeException, StreeException {
		this(left, null);
	}

}
