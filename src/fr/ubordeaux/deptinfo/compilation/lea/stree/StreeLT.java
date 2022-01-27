package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeLT extends Stree {

	private BINOP exp;

	public StreeLT(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new BINOP(BINOP.Code.LT, left.getExp(), right.getExp());
	}

	@Override
	public Exp getExp(){
		return exp;
	}

}
