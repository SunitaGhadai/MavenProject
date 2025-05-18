package Java_Package;

public class OverLoadingPolymorphysm {

	public static void main(String[] args) {
		
		//creation of objet
		Student student1 = new PrimaryStudent();
		Student student2 = new HighSchoolStudent();
		Student student3 = new CollegeStudent();
		
		//method overriding dynamic process
		student1.describe();
		student2.describe();
		student3.describe();
		
		//method overloading static
		System.out.println("Primary student hour "+ student1.studyhours(5));
		System.out.println("High School student hour "+ student2.studyhours(5));
		System.out.println("College student hour "+ student3.studyhours(7,5));
	}

}

class Student
{
	public void describe()
	{ 
		System.out.println("I am a Student");
	}

	public int studyhours(int subjects)
	{
		return subjects*2;
    }
	public int studyhours(int subjects,int hourspersubject)
	{
		return subjects*hourspersubject;
	}
}

class PrimaryStudent extends Student{
 
	public void describe()
	{ 
		System.out.println("I am a Primary Student");
	}

}
class HighSchoolStudent extends Student{
 
   public void describe()
   { 
	System.out.println("I am a High School Student");
   }

  @Override
public int studyhours(int subjects) 
   {
	return subjects*3;
   }

}
class CollegeStudent extends Student{

	public void describe()
	{ 
		System.out.println("I am a College Student");
	}
}


