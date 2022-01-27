package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeSUCC extends Stree {

	public static final Boolean RIGHT = false;
	public static final Boolean LEFT = true;
	private Boolean rank;

	public StreeSUCC(Stree left, Boolean rank) throws TypeException, StreeException {
		super(left);
		this.rank = rank;
	}

}
