package p2_DoubleEndedLinkedList;

public class Link
{
	public double dData;
	public Link next;
	
	public Link(double dData)
	{
		this.dData = dData;
	}
	
	public void displayLInk()
	{
		System.out.print(dData + " ");
	}

}
