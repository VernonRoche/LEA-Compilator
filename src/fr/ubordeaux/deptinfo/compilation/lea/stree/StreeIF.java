package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeIF extends Stree {

	private Stm stm;

	public StreeIF(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.stm = generateIntermediateCode();
	}

	@Override
	public Stm getStm() {
		return stm;
	}

}
