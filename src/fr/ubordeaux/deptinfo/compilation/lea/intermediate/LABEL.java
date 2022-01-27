package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;

public class LABEL extends Stm {
	private Label label;

	public LABEL(Label label) {
		super();
		this.label = label;
	}

	@Override
	public String toString() {
		return "LABEL [label=" + label + "]";
	}

	@Override
	public String getDotLabel() {
		return super.getDotLabel() + ':' + label;
	}


}
