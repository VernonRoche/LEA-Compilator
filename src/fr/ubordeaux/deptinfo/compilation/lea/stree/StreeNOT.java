package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeNOT extends Stree {

	private Exp exp;

	public StreeNOT(Stree left) throws StreeException, TypeException {
		super(left);
		this.exp = new BINOP(BINOP.Code.NOT, left.getExp(), null);
	}

	@Override
	public Exp getExp(){
		return exp;
	}

}
