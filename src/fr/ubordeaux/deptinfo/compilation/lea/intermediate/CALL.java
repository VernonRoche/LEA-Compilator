package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class CALL extends Exp {

	private Exp function;
	private ExpList args;

	public CALL(Exp function, ExpList args) {
		super();
		this.function = function;
		this.args = args;
	}

	@Override
	public String getDotLabel() {
		return "CALL(" + function + ',' + args + ')';
	}

}
