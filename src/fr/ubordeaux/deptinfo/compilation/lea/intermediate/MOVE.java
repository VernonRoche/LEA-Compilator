package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class MOVE extends Stm {

	private Exp target;
	private Exp source;

	public MOVE(Exp target, Exp source) {
		super();
		this.target = target;
		this.source = source;
	}

	@Override
	public String toString() {
		return "MOVE [target=" + target + ", source=" + source + "]";
	}

	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		target.toDot(str);
		source.toDot(str);
		str.append("Stm_" + getId() + " -> Exp_" + target.getId() + ";\n");
		str.append("Stm_" + getId() + " -> Exp_" + source.getId() + ";\n");
	}

}
