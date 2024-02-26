
public class employee {
	private int empId;
	private String empName;
	private double empSalary;
	public employee() {
		System.out.println("Default constructor");
		empId=111;
		empName="sakshi";
		empSalary=21000.87d;
		
	}
	public employee(int i, String n,double d)
	{
		System.out.println("Parameterized constructor");
		empId = i;
		empName = n;
		empSalary=d;
	}
	public String toString() {
		return "employee=" + empId+ " " + empName+ " "+" " + empSalary;
	}
	public static void main (String[]args)
	{
		employee e= new employee();
		System.out.println(e);
		employee e1= new employee(222, "VISHAL", 532146.98);
	    System.out.println(e1);
	    employee e2= new employee(333, "ADITI", 2146.98);
	    System.out.println(e2);
	    employee e3= new employee(444, "SAKSHI", 532146.987d);
	    System.out.println(e3);
	    employee e4= new employee(555, "PRATHMESH", 214975.6d);
	    System.out.println(e4);
		 
		 
	}
	

}
