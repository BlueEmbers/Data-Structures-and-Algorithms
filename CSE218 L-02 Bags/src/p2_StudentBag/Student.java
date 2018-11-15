package p2_StudentBag;

public class Student
{
	private String firstName;
	private String lastName;
	private double gpa;
	private String id;
	
	public Student(String firstName, String lastName, double gpa, String id) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.id = id;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public double getGpa() 
	{
		return gpa;
	}

	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Student - FirstName = " + firstName + ", LastName = " + lastName + ", GPA = " + gpa + ", ID = " + id + "]";
	}
	
	

}
