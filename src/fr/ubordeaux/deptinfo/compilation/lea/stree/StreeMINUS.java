package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeMINUS extends Stree {

	private Exp exp;

	public StreeMINUS(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new BINOP(BINOP.Code.MINUS, left.getExp(), right.getExp());
	}

	public StreeMINUS(Stree left) throws StreeException, TypeException {
		super(left);
		this.exp = new BINOP(BINOP.Code.MINUS, left.getExp(), null);
	}

	@Override
	public Exp getExp(){
		return exp;
	}

}
