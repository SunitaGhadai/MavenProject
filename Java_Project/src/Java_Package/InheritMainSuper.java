package Java_Package;

public class InheritMainSuper {

	public static void main(String[] args) {
		//Employee is a class has attributes like name , id , salary and Manager is a subclass (Extend of Emplyee class)
		//and added one extra attribute "teamsize"
        // creation of object for 2 different calss and passing values to the constructor
		Employee emp = new Employee ("Sunita",111,50000.00);
		emp.displaydetails();
		//the manager class inherits from the employee class so it call "super"
		Manager mang = new Manager ("Shirish", 100,80000.00,50);
		mang.displaydetails();
	}
}
	// declaring variables to employee class
class Employee{
	String Name;
	int Id;
	double Salary;
	
	public Employee (String Name,int Id,double Salary)
	{ // "this" is a constructor of the Emplyee class
		this.Name = Name;
		this.Id = Id;
		this.Salary = Salary;
	}
	
	public void displaydetails()
	{  // calling method to print details of employee
		System.out.println("Employe Name "+ Name);
		System.out.println("Employe Id "+ Id);
		System.out.println("Employe Salary "+ Salary);
	}
}
//manager class is a subclass of Employee class and add one new attribute "teamsize"
class Manager extends Employee
{
	int Teamsize;
	//constructor of manager class and calls employee constructor with the use of "super"
	public Manager (String Name,int Id,double Salary, int Teamsize) {
	super (Name , Id ,Salary);
	this.Teamsize = Teamsize;
	
}
//this method override the method in "Employee"
public void displaydetails()
{
	//super keyword is used to refer to the immediate parent class of a subclass
	super.displaydetails();
	System.out.println("Team size "+Teamsize);
	
}

}

