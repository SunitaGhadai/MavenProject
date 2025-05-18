package Java_Package;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Nested_IfElseClass {

	public static void main(String[] args) {
		// multiple conditions given , so where the code get satisfied it will stop there
		
		int testScore=55;
		
		if(testScore>=90)
		{
		System.out.println("Grade A");
		}

		else if(testScore>=80)
		{
		System.out.println("Grade B");			
		}
		
		else if(testScore>=70)
		{
		System.out.println("Grade C");			
		}
		else if(testScore>=60)
		{
		System.out.println("Grade D");			
		}
		else
		{
		System.out.println("Fail");
		}
	}

}
