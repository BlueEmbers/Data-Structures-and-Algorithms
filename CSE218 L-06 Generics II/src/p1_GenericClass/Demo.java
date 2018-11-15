package p1_GenericClass;

public class Demo 
{

	public static void main(String[] args) 
	{
		Point<Integer> p1 = new Point<>(10,1);
//		int x = p1.getX();
//		Double x = (double)p1.getX();
//		double y = p1.getY();
		
		Point<Double> p2 = new Point<>(1.5,2.0);
		
		
		Point<String> p3 = new Point<>("One","Two");
		displayPoint(p1);
//		displayPoint(p2);
		
//		displayPoint(p1, p2);
//		displayPoint(p2, p1);
//		displayPoint(p3);

	}
	
//	private static <T> void displayPoint(Point<T> point)
//	{
//		System.out.println(point.getX() + ", " + point.getY());
//	}
	
//	private static <T extends Number, R extends Number> void displayPoint(Point<T> point1, Point<R> point2)
//	{
//		System.out.println(point1 + "\t" + point2);
//	}
	
	private static void displayPoint(Point<? super Integer> point)
	{
		System.out.println(point);
	}

}
