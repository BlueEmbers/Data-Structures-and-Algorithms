package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo 
{
	public static void main(String[] args)
	{
		LinkedList<String> staff = new LinkedList<>();
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		staff.addLast("Tom");
		
		ListIterator<String> iterator = staff.listIterator(); // |DHRT
		iterator.next(); // D|HRT
		iterator.next(); // DH|RT
		
		iterator.add("Julia"); // DHJ|RT
		
		iterator.next(); // DHJR|T
		System.out.println(staff);
		iterator.remove(); // DHJ|T
		System.out.println(staff);
	}

}
