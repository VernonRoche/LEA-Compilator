package fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp;

public class TempList {
	private Temp head;
	private TempList tail;

	public TempList(Temp head, TempList tail) {
		this.head = head;
		this.tail = tail;
	}
}
