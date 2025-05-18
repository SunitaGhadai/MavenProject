package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\geckodriver.exe");//This tells Selenium to use Geco driver and where my driver is in the system 
		FirefoxDriver browserObject = new FirefoxDriver();//creating an object named as browser object
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");//Open the browser using the get method.

	}

}
