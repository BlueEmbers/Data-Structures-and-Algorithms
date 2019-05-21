package p2_objects;

import java.util.HashSet;

public class Demo 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("John", 3.5);
		Student s2 = new Student("John", 3.5);
		System.out.println(s1.equals(s2));
		HashSet<Student> studentSet = new HashSet<>(10);
		studentSet.add(s1);
		studentSet.add(s2);
		for(Student s : studentSet)
		{
			System.out.println(s);
		}

	}

}
