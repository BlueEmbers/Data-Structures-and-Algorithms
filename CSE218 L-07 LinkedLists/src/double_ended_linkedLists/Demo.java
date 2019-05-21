package double_ended_linkedLists;

public class Demo {

	public static void main(String[] args) {
		FirstLastLinkList theList = new FirstLastLinkList();
		theList.insertFirst(22);
		theList.insertFirst(11);
		theList.insertFirst(33);
		theList.insertLast(44);
		theList.insertLast(55);
		theList.insertLast(22);
		
		theList.displayList();
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.displayList();
		
		
	}

}
