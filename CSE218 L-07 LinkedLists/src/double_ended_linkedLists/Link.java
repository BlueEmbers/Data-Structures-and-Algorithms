package double_ended_linkedLists;

public class Link {
	public double dData;
	public Link next;

	public Link(double dData) {
		this.dData = dData;
		next = null;
	}

	public void displayLink() {
		System.out.print(dData + " ");
	}
}
