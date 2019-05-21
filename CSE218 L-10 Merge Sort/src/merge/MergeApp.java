package merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = { 1, 3, 6, 8, 10 };
		int[] arrayB = { 4, 7, 11, 13, 16, 17, 28, 31, 33 };
		int[] arrayC = new int[arrayA.length + arrayB.length];

		merge(arrayA, 5, arrayB, 9, arrayC);
		display(arrayC, 14);
	}

	private static void display(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;

		while (aIndex < sizeA && bIndex < sizeB) { // neither arrayA nor arrayB is finished
			if (arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}

		while (aIndex < sizeA) { // arrayB is empty but arrayA isn't
			arrayC[cIndex++] = arrayA[aIndex++];
		}

		while (bIndex < sizeB) { // arrayA is empty but arrayB isn't
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}

}
