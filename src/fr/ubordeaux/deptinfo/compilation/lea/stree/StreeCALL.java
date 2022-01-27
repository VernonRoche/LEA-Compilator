package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.CALL;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.EXPSTM;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeCALL extends Stree {

	private Exp exp;
	private Stm stm;

	public StreeCALL(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new CALL(left.getExp(), right.getExpList());
		this.stm = new EXPSTM(exp);
	}

	@Override
	public Exp getExp(){
		return exp;
	}

	@Override
	public Stm getStm(){
		return stm;
	}

	@Override
	public boolean checkType() throws StreeException {
		return true;
	}

}
