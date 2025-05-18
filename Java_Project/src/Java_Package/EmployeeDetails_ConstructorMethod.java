package Java_Package;

public class EmployeeDetails_ConstructorMethod {
	
	String name;
	int id;
	String department;
	double salary;
	
	//constructor is created
	
	EmployeeDetails_ConstructorMethod(String nam, int i , String dept , double sal)
	{
		name = nam;
		id = i;
		department = dept;
		salary = sal;
	}
	void displaydetails()
	{
		System.out.println("Employe ID: "+ id);
		System.out.println("Employe Name: "+ name);
		System.out.println("Department: "+ department);
		System.out.println("Salary $: "+ salary);
	}

	public static void main(String[] args) {
		//Create an object
		EmployeeDetails_ConstructorMethod obj= new 	EmployeeDetails_ConstructorMethod("Sunita",101,"HR",50000.00);
		obj.displaydetails();
		EmployeeDetails_ConstructorMethod obj1= new 	EmployeeDetails_ConstructorMethod("Bhuvana",102,"HR",40000.00);
		obj1.displaydetails();
		
		

	}

}
