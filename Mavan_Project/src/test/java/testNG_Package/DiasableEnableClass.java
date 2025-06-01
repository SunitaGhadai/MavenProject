package testNG_Package;

import org.testng.SkipException;
import org.testng.annotations.Test;
   //Two method to skip testcase applied here
    public class DiasableEnableClass {
    @Test(enabled=false)//when we write this statement the test case skip by itself and will ot reflect in the report too.
	void test1 ()
	{
		System.out.println("This test case is disabled");
    }
	
    @Test // this test case left as it is so it will execute (bydefault enabled means true so it will execute)
	void test2 ()
	{
		System.out.println("This test case is enabled");
    }
    @Test
    void test3 ()
{
	System.out.println("Skip the test case");
	//this throw statement will generate a report that the test case skip
	throw new SkipException("I am skipping this test case");
}
    
    
}

