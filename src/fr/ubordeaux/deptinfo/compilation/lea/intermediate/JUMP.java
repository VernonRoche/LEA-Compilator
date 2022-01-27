package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.LabelList;

public class JUMP extends Stm {
	private Exp exp;
	private LabelList targets;

	public JUMP(Exp exp, LabelList targets) {
		super();
		this.exp = exp;
		this.targets = targets;
	}

	public JUMP(Label target) {
		this(new NAME(target), new LabelList(target));
	}
	
	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		exp.toDot(str);
		str.append("Stm_" + getId() + " -> Exp_" + exp.getId() + ";\n");
	}

}
