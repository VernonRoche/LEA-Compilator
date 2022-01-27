package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeLSHIFT extends Stree {

	private BINOP exp;

	public StreeLSHIFT(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new BINOP(BINOP.Code.LSHIFT, left.getExp(), right.getExp());
	}

	@Override
	public Exp getExp(){
		return exp;
	}

}
