package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class MEM extends Exp {

	private Exp exp;

	public MEM(Exp exp) {
		super();
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "MEM [exp=" + exp + "]";
	}

	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		exp.toDot(str);
		str.append("Exp_" + getId() + " -> Exp_" + exp.getId() + ";\n");
	}

	@Override
	public String getDotLabel() {
		return "MEM";
	}

}
