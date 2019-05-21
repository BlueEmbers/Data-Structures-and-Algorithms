package shellSort;

public class Demo {

	public static void main(String[] args) {
		ArraySh arr = new ArraySh(100);
		arr.insert(7);
		arr.insert(10);
		arr.insert(1);
		arr.insert(95);
		arr.insert(2);
		arr.insert(51);
		arr.insert(82);
		arr.insert(6);
		arr.insert(43);
		arr.insert(3);
		arr.insert(77);
		arr.insert(110);
		arr.insert(12);
		arr.insert(9);
		arr.insert(23);
		arr.insert(55);
		arr.insert(81);
		arr.insert(69);
		arr.insert(47);
		arr.insert(3);
		arr.display();
		arr.shellSort();
		arr.display();
		
	}

}
