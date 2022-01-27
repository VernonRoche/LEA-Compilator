package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;

public class CJUMP extends Stm {

	public enum Op {
		EQ("=="), NE("!="), LT("<"), GT(">"), LE("<="), GE(">=");
		private String memo;
		Op(String memo) {this.memo = memo;}

		public String toString() {return memo;}
	}

	private Op relop;
	private Exp left;
	private Exp right;
	private Label iftrue;
	private Label iffalse;

	public CJUMP(Op relop, Exp left, Exp right, Label iftrue, Label iffalse) {
		super();
		this.relop = relop;
		this.left = left;
		this.right = right;
		this.iftrue = iftrue;
		this.iffalse = iffalse;
	}

	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		left.toDot(str);
		right.toDot(str);
		str.append("Stm_" + getId() + " -> Exp_" + left.getId() + ";\n");
		str.append("Stm_" + getId() + " -> Exp_" + right.getId() + ";\n");
		str.append("Stm_" + getId() + " -> " + iftrue + ";\n");
		str.append("Stm_" + getId() + " -> " + iffalse + ";\n");
	}

	@Override
	public String getDotLabel() {
		return super.getDotLabel() + ' ' + relop.toString();
	}


}
