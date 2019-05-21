package simpleLinkedLists;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insertFirst(22, 22.22);
		theList.insertFirst(33, 33.33);
		theList.insertFirst(55, 55.55);
		theList.insertFirst(11, 11.11);
		
		theList.displayList();
		
		Link f = theList.find(33);
		f.displayLink();
		
		Link d = theList.delete(55);
		d.displayLink();
		
		System.out.println(theList.isEmpty());
		
		theList.displayList();
		
	}

}
