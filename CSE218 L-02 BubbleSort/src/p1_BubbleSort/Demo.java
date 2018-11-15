package p1_BubbleSort;

public class Demo {

	public static void main(String[] args) 
	{
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		arr.insert(7);
		arr.insert(5);
		arr.insert(1);
		arr.insert(99);
		arr.insert(88);
		arr.insert(66);
		arr.insert(-12);
		arr.insert(22);
	/*	arr.insert(00);
		arr.insert(44);*/
		arr.display();
		long t = System.nanoTime();
		arr.bubbleSort();
		System.out.println(System.nanoTime() - t);
		arr.display();

	}

}
