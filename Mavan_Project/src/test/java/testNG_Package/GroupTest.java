package testNG_Package;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test (groups="Login")
	public void openWebsite() {
		System.out.println("openWebsite");
			}
	@Test ( groups = "Login")
	public void enterData() {
		System.out.println("enterData");
}
	
	@Test ( groups ="Login")
	public void pressLogin() {
		System.out.println("pressLogin");
	}
	
	@Test ( groups ="explore")
	public void explorePage() {
		System.out.println("explorePage");
		
	}
	
	 }