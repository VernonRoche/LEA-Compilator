package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class CONST extends Exp {
	private int value;

	public CONST(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "CONST [value=" + value + "]";
	}

	@Override
	public String getDotLabel() {
		return String.valueOf(value);
	}
}
