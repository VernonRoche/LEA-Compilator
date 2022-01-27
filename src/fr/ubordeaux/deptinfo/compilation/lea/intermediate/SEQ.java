package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class SEQ extends Stm {
	
	private Stm left;
	private Stm right;

	public SEQ(Stm left, Stm right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "SEQ [left=" + left + ", right=" + right + "]";
	}

	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		left.toDot(str);
		right.toDot(str);
		str.append("Stm_" + getId() + " -> Stm_" + left.getId() + ";\n");
		str.append("Stm_" + getId() + " -> Stm_" + right.getId() + ";\n");
	}

}
