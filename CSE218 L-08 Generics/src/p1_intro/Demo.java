package p1_intro;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> theList = new ArrayList<>();
		theList.add("Hi");
//		theList.add(1); //autoboxing
//		theList.add(new Integer(1));
//		theList.add(1.1);
//		theList.add(new Double(1.1));
		
		String str1 = theList.get(0);
		String str2 = theList.get(1);
		
	}

}
