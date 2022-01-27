package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class ESEQ extends Exp {
	private Stm stm;
	private Exp exp;

	public ESEQ(Stm stm, Exp exp) {
		super();
		this.stm = stm;
		this.exp = exp;
	}

	@Override
	public String getDotLabel() {
		return "ESEQ(" + stm.toString() + ',' + exp.toString() + ')';
	}
}
