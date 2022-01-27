package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class BINOP extends Exp {

	public enum Code {
		PLUS("+"), MINUS("-"), MUL("*"), DIV("/"), AND("&&"), OR("||"), LSHIFT("<<"), RSHIFT(">>"), LT("<"), LE("<="),
		GT(">"), GE(">="), EQ("=="), NOT("!"), NE("!=");

		private String memo;

		Code(String memo) {
			this.memo = memo;
		}

		@Override
		public String toString() {
			return memo;
		}

	}

	private Code binop;
	private Exp left;
	private Exp right;

	public BINOP(Code binop, Exp left, Exp right) {
		super();
		this.binop = binop;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "BINOP [binop=" + binop + ", left=" + left + ", right=" + right + "]";
	}

	@Override
	public void toDot(StringBuffer str) {
		super.toDot(str);
		left.toDot(str);
		right.toDot(str);
		str.append("Exp_" + getId() + " -> Exp_" + left.getId() + ";\n");
		str.append("Exp_" + getId() + " -> Exp_" + right.getId() + ";\n");
	}

	@Override
	public String getDotLabel() {
		return binop.toString();
	}


}
