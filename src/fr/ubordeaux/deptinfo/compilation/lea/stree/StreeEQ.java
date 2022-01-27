package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeEQ extends Stree {

	private BINOP exp;

	public StreeEQ(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new BINOP(BINOP.Code.EQ, left.getExp(), right.getExp());
	}

	@Override
	public Exp getExp(){
		return exp;
	}
}
