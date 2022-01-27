package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.type.Tag;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeExpression;

public class StreeIDENTIFIER extends Stree {

	private String value;
	private Type type;

	public StreeIDENTIFIER(String value) throws TypeException, StreeException {
		super();
		this.value = value;
	}

}
