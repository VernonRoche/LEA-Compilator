package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeNEW extends Stree {

	private Type pointerType;

	public StreeNEW(Type pointerType, Stree left) throws TypeException, StreeException {
		super(left);
		this.pointerType = pointerType;
	}

}
