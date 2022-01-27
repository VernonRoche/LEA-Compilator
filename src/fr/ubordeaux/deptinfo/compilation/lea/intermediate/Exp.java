package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract public class Exp {
	private int id; // used in toDot
	private static int uniqId = 0;

	public Exp() {
		id = uniqId++;
	}

	public int getId() {
		return id;
	}

	public void toDot(StringBuffer str) {
		str.append("Exp_" + id + " [shape=\"ellipse\", label=\"" + getDotLabel() + "\"];\n");
	}

	abstract public String getDotLabel();
	
	public void toDotFile(String file) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write("digraph Stree {\n");
			StringBuffer str = new StringBuffer();
			toDot(str);
			out.write(str.toString());
			out.write("}\n");
			out.close();
		} catch (IOException e) {
			System.err.println("ERROR: build dot");
		}
	}
}