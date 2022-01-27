package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.*;

public class TEMP extends Exp {
	private Temp temp;

	public TEMP(Temp temp) {
		super();
		this.temp = temp;
	}

	@Override
	public String getDotLabel() {
		return temp.toString();
	}
}
