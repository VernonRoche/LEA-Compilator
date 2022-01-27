package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;

public class NAME extends Exp {
	public Label label;

	public NAME(Label label) {
		super();
		this.label = label;
	}

	@Override
	public String getDotLabel() {
		return "NAME: " + label.toString();
	}
}
