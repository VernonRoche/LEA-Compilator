package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.MEM;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.NAME;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreeVARIABLE extends Stree {

	private String name;
	private Type type;
	private Exp exp;

	public StreeVARIABLE(String name, Type type) throws TypeException, StreeException {
		super();
		this.name = name;
		this.type = type;
		this.exp = new MEM(new NAME(new Label(name)));
	}

	@Override
	public String toString() {
		return "StreeVAR [string=" + name + ", type=" + type + "]";
	}

	@Override
	public Exp getExp(){
		return exp;
	}

	@Override
	public Type getType() throws StreeException {
		return type;
	}

	@Override
	public boolean checkType() throws StreeException {
		return true;
	}

}
