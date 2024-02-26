
public class student {
	private int rollNo;
	private String name;
	
	public student()
	{
		this(4240, "Suraj");
		System.out.println("Default constructor called");
	}
	
	public student(int rollNo,String name)
	{
		System.out.println("PARAMETERISED CONSTRUCTOR called");
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()
	{
		return "Student = [ Roll NO="+rollNo+" Name="+name+"]";
	}
	
	public static void main(String args[])
	{
		student s1=new student();
		System.out.println(s1);
		
		student s2=new student(4220,"Bhushan");
		System.out.println(s2);
	}

}
