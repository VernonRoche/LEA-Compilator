package fr.ubordeaux.deptinfo.compilation.lea.stree;

import fr.ubordeaux.deptinfo.compilation.lea.intermediate.BINOP;
import fr.ubordeaux.deptinfo.compilation.lea.intermediate.Exp;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;

public class StreePLUS extends Stree {

	private BINOP exp;
	private Type type;

	public StreePLUS(Stree left, Stree right) throws StreeException, TypeException {
		super(left, right);
		this.exp = new BINOP(BINOP.Code.PLUS, left.getExp(), right.getExp());
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
		Type typeLeft = getLeft().getType();
		Type typeRight = getRight().getType();
		type = typeLeft;
		if ((typeLeft != null) && (typeRight != null))
			return typeLeft.assertEqual(typeRight);
		else
			throw new StreeException("Type error while checking null types !");
	}

}
