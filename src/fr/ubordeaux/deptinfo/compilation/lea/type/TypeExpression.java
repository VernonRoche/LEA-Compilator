package fr.ubordeaux.deptinfo.compilation.lea.type;

public class TypeExpression implements Type {

	private Tag tag;
	private String name;
	private Type left;
	private Type right;
	private int size;
	private int offset;

	public TypeExpression(Tag ttype, String name, Type left, Type right) {
		this.tag = ttype;
		this.name = name;
		this.left = left;
		this.right = right;
		setSize();
	}

	public TypeExpression(Tag ttype, Type left, String name) {
		this(ttype, name, left, null);
	}

	public TypeExpression(Tag ttype, String name) {
		this(ttype, name, null, null);
	}

	public TypeExpression(Tag ttype, Type left, Type right) {
		this(ttype, null, left, right);
	}

	public TypeExpression(Tag ttype, Type left) {
		this(ttype, null, left, null);
	}

	public TypeExpression(Tag ttype) {
		this(ttype, null, null, null);
	}

	private void setSize() {
		switch (tag) {
		case BOOLEAN:
		case FLOAT:
		case INTEGER:
		case ENUM:
		case STRING:
			size = tag.getSize();
			break;
		case FIELD:
			size = left.getSize();
			break;
		case PRODUCT:
			size = left.getSize() + right.getSize();
			break;
		case CLASS:
			size = left.getSize();
			break;
		case FUNCTION:
			break;
		case LIST:
			break;
		case NAME:
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		switch (tag) {
		case FUNCTION:
			return "(" + left + ") -> " + right;
		case INTEGER:
			return "integer";
		case LIST:
			return "list<" + left + ">";
		case STRING:
			return "string";
		case BOOLEAN:
			return "boolean";
		case ENUM:
			return "enum<" + left + ">";
		case CLASS:
			return "class " + name + "<" + left + ">{" + right + '}';
		case PRODUCT:
			return left + " X " + right;
		case FIELD:
			return name + ":" + left;
		case FLOAT:
			return "float";
		case NAME:
			return name;
		case CHAR:
			return "char";
		case MAP:
			return "map<" + left + ',' + right + '>';
		case RANGE:
			return "range";
		case SET:
			return "set<" + left + '>';
		case VOID:
			return "void";
		}
		return null;
	}

	@Override
	public Tag getTag() {
		return tag;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public Type getLeft() {
		return left;
	}

	@Override
	public Type getRight() {
		return right;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeExpression other = (TypeExpression) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (tag != other.tag)
			return false;
		return true;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean assertEqual(Type other) {
		return this.equals(other);
	}

	@Override
	public boolean assertBoolean() {
		return this.getTag() == Tag.BOOLEAN;
	}

}
