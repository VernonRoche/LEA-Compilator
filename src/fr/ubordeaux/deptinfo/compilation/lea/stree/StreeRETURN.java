package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.MEM;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.MOVE;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.NAME;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeRETURN extends Stree {

	private MOVE stm;

	public StreeRETURN(Stree left) throws StreeException, TypeException {
		super(left);
		this.stm = new MOVE(new MEM(new NAME(new Label("returnValue"))), left.getExp());
	}

	@Override
	public Stm getStm() {
		return stm;
	}

}
