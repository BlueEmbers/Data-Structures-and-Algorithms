package bags_revist;

import java.util.Arrays;
import java.util.function.Predicate;


public class Bag {
	private Student[] array;
	private int nElems;
	private int maxSize;

	public Bag(int maxSize) {
		array = new Student[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}

	public void insert(Student s) {
		array[nElems++] = s;
	}

	public Student[] search(Predicate<Student> tester) {
		Student[] arr = new Student[maxSize];
		int n = 0;
		for (int i = 0; i < nElems; i++) {
			if (tester.test(array[i])) {
				arr[n++] = array[i];
			}
		}
		return Arrays.copyOf(arr, n);
	}

	
}
