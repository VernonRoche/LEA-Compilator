package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

public class ExpList {
	private Exp head;
	private ExpList tail;

	public ExpList(Exp head, ExpList tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	public ExpList(Exp head) {
		this(head, null);
	}
}
