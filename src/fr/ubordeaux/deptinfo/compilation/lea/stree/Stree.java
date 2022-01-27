package fr.ubordeaux.deptinfo.compilation.lea.stree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.ExpList;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Stm;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public abstract class Stree {

	private int id; // used in toDot
	private static int uniqId = 0;
	private Stree left;
	private Stree right;
	
	public Stree(Stree left, Stree right) throws TypeException, StreeException {
		this.id = uniqId++;
		this.left = left;
		this.right = right;
		if (!checkType()) {
			throw new TypeException("Type error while checking " + this.getClass().getSimpleName());
		}
	}

	public Stree() throws TypeException, StreeException {
		this(null, null);
	}

	public Stree(Stree left) throws TypeException, StreeException {
		this(left, null);
	}

	public int getId() {
		return id;
	}

	public Stree getLeft() {
		return left;
	}

	public Stree getRight() {
		return right;
	}

	public String toString() {
		String result = new String();
		result += this.getClass().getSimpleName();
		if ((left != null) || (right != null)) {
			result += "(";
			if (left != null)
				result += left.toString();
			if (right != null) {
				result += ", " + right.toString();
			}
			result += ")";
		}
		return result;
	}

	public void toDot(StringBuffer str) {
		str.append("a_" + id + " [");
		str.append("shape=\"ellipse\", label=\"" + this.getClass().getSimpleName());
		str.append("\"];\n");
		if (left != null) {
			left.toDot(str);
			str.append("a_" + id + " -> a_" + left.id + ";\n");
		}
		if (right != null) {
			right.toDot(str);
			str.append("a_" + id + " -> a_" + right.id + ";\n");
		}
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

	public Stm getStm() throws StreeException {
		throw new StreeException("Not yet implemented: getStm() in " + this.getClass().getSimpleName());
	}

	public Exp getExp() throws StreeException {
		throw new StreeException("Not yet implemented: getExp() in " + this.getClass().getSimpleName());
	}

	public Type getType() throws StreeException {
		throw new StreeException("Not yet implemented: getType() in " + this.getClass().getSimpleName());
	}

	public ExpList getExpList() throws StreeException {
		throw new StreeException("Not yet implemented: getExpList() in " + this.getClass().getSimpleName());
	}

	public Stm generateIntermediateCode() throws StreeException {
		throw new StreeException("Not yet implemented: generateIntermediateCode() in " + this.getClass().getSimpleName());
	}

	public boolean checkType() throws StreeException {
		throw new StreeException("Not yet implemented: checkType() in " + this.getClass().getSimpleName());
	}

}
