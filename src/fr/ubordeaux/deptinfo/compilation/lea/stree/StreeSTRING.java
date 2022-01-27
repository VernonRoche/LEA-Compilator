package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.NAME;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.temp.Label;
import fr.ubordeaux.deptinfo.compilation.lea.type.Tag;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeExpression;

public class StreeSTRING extends Stree {

	private String value;
	private NAME exp;
	private static int count;
	private Type type;

	public StreeSTRING(String value) throws TypeException, StreeException {
		super();
		this.value = value;
		this.exp = new NAME(new Label("STR_" + count++));
		this.type = new TypeExpression(Tag.STRING);
	}

	@Override
	public Exp getExp(){
		return exp;
	}
	
	@Override
	public boolean checkType() {
		return true;
	}

	public Type getType() throws StreeException {
		return type;
	}

}
