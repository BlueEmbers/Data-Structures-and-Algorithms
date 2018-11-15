package compareObjects;

import java.util.ArrayList;
import java.util.Collections;

public class Demo 
{

	public static void main(String[] args) 
	{
		BankAcoount ba1 = new BankAcoount(10, 100.0);
		BankAcoount ba2 = new BankAcoount(5, 100.0);
		BankAcoount ba3 = new BankAcoount(1, 100.0);
		BankAcoount ba4 = new BankAcoount(-1, 100.0);
		//System.out.println(ba1.equals(ba2));
// Example 1
//		BankAccount[] arr = {ba1, ba2, ba3, ba4};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		ArrayList<BankAcoount> list = new ArrayList<>();
		list.add(ba1);
		list.add(ba2);
		list.add(ba3);
		list.add(ba4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
