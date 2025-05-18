package Java_Package;

import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of the scanner object to read the input
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the name");
		//read the input as string, sc is the object and by using it we are calling the method
		String name = sc.nextLine();
		System.out.println("Enter Address");
		String add = sc.nextLine();
		System.out.println("enter the age");
		int age=sc.nextInt();
		
			
		System.out.println("Name "+name + " ,address" + add+ " ,Age "+age);

	}

}
