package fr.ubordeaux.deptinfo.compilation.lea.environment;

import java.util.ArrayDeque;
import java.util.Deque;

import fr.ubordeaux.deptinfo.compilation.lea.type.Tag;
import fr.ubordeaux.deptinfo.compilation.lea.type.Type;

public class StackEnvironment<T> {

	private Deque<Environment<T>> stack;
	private boolean verbose;
	private String name;

	public StackEnvironment(String name, boolean verbose) {
		this.stack = new ArrayDeque<Environment<T>>();
		this.name = name;
		this.verbose = verbose;
	}

	public void put(String key, T t) throws EnvironmentException {
		if (stack.isEmpty())
			throw new EnvironmentException("*** Empty Stack Environment");
		else
			stack.getFirst().put(key, t);
	}

	public T get(String key) throws EnvironmentException {
		if (stack.isEmpty())
			throw new EnvironmentException("*** Empty Stack Environment");
		else {
			for (Environment<T> it : stack) {
				T value = it.get(key);
				if (value != null)
					return value;
			}
		}
		return null;
	}

	public void push(Environment<T> environment) {
		if (verbose)
			System.out.println("*** Push a new environment");
		stack.addFirst(environment);
	}

	public void pop() {
		if (verbose)
			System.out.println("*** Pop an environment");
		stack.pop();
	}

	public void put(Type type) throws EnvironmentException {
		switch (type.getTag()) {
		case FIELD:
			this.put(type.getName(), (T)type.getLeft());
			break;
		default:
			throw new EnvironmentException("Unexpected case");
		}
	}

	public int size() {
		return stack.size();
	}

	public String getName() {
		return name;
	}

}
