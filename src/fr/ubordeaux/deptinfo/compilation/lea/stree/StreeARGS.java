package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.ExpList;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.SEQ;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeARGS extends Stree {
	
	private ExpList expList;

	public StreeARGS(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.expList = (right != null) ? new ExpList(left.getExp(), right.getExpList()) : new ExpList(left.getExp());
	}

	public StreeARGS(Stree left) throws StreeException, TypeException {
		this(left, null);
	}

	@Override
	public String toString() {
		return getLeft().toString() + '\n' + getRight().toString();
	}

	@Override
	public ExpList getExpList() {
		return expList;
	}

	@Override
	public boolean checkType() throws StreeException {
		return true;
	}
}
