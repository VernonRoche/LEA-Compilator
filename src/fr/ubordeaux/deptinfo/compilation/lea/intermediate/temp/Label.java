package fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp;

/**
 * A Label represents an address in assembly language.
 */

public class Label {
	private String name;
	private static int count;

	/**
	 * Makes a new label that prints as "name". Warning: avoid repeated calls to
	 * <tt>new Label(s)</tt> with the same name <tt>s</tt>.
	 */
	public Label(String n) {
		name = n;
	}

	/**
	 * Makes a new label with an arbitrary name.
	 */
	public Label() {
		this("L" + count++);
	}

	@Override
	public String toString() {
		return name;
	}

	public void toDot(StringBuffer str) {
		str.append("Label_" + name + " [shape=\"ellipse\", label=\""+ name +"\"];\n");
	}

}
