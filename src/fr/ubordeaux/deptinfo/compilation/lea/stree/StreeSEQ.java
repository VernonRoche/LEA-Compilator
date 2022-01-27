package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.SEQ;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeSEQ extends Stree {
	
	private Stm stm;

	public StreeSEQ(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.stm = new SEQ(left.getStm(), right.getStm());
	}

	@Override
	public String toString() {
		return getLeft().toString() + '\n' + getRight().toString();
	}

	@Override
	public Stm getStm() {
		return stm;
	}

	@Override
	public boolean checkType() {
		return true;
	}

}
