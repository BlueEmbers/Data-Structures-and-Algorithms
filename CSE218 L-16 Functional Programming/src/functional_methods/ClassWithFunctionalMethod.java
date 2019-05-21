package functional_methods;

public class ClassWithFunctionalMethod {
	private int value = 0;

	public int sum(int a, int b) { // function
		return a + b;
	}

	public int add(int nextValue) { // non-functional method
		return value + nextValue;
	}

}
