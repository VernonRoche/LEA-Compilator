package fr.ubordeaux.deptinfo.compilation.lea.intermediate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract public class Stm {
	private int id;
	private static int uniqId = 0;

	public Stm() {
		id = uniqId++;
	}

	public int getId() {
		return id;
	}

	public void toDot(StringBuffer str) {
		str.append("Stm_" + id + " [shape=\"ellipse\", label=\""+ getDotLabel() +"\"];\n");
	}

	public String getDotLabel() {
		return this.getClass().getSimpleName();
	}
	
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
