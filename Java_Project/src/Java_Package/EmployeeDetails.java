package Java_Package;

public class EmployeeDetails {
	
	String name;
	int id;
	String department;
	double salary;
	
	void displaydetails(String name, int id , String department , double salary)
	{
		//concept of "this" keyword used to refer to the current class variables
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
		
		System.out.println("Employe ID: "+ id);
		System.out.println("Employe Name: "+ name);
		System.out.println("Department: "+ department);
		System.out.println("Salary $: "+ salary);
	}

	public static void main(String[] args) {
		//Create an object
		EmployeeDetails obj= new EmployeeDetails();
		//calling method and passing values to parameter
		obj.displaydetails("Sunita",101,"HR",50000.00);	
		obj.displaydetails("John",102,"Manager",60000.00);
		obj.displaydetails("Narshi",103,"Director",160000.00);
		
		
		
		
		

	}

}
