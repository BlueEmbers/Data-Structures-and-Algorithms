package quickSort;

public class QuickSortApp {

	public static void main(String[] args) {
		ArrayQuick arr = new ArrayQuick(5);
//		for(int i = 0; i < 16; i++) {
//			long n = (int) (Math.random() * 199);
//			arr.insert(n);
//		}
		
		arr.insert(1);
		arr.insert(4);
		arr.insert(3);
		arr.insert(2);
		arr.insert(3);
		
		arr.display();
		arr.quickSort();
		arr.display();
	}

}
