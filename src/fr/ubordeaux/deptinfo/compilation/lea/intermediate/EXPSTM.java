package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class EXPSTM extends Stm {
	
	private Exp exp;

	public EXPSTM(Exp exp) {
		super();
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "EXPSTM [exp=" + exp + "]";
	}

}
