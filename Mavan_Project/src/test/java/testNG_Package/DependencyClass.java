package testNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
	WebDriver browserObject;
	//keeping Amazon as parent method to check the dependency
	 @Test()//parent test case and not dependent on any other teast case
	  public void openingAmazonSite() {
		  //which driver and where it is located
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
	      //object of driver
	      ChromeDriver browserObject = new ChromeDriver();
	      //calling get method to pass the website link
	      browserObject.get("https://ww.amazorxx.com/");
	      browserObject.close();
	  }
	  @Test(dependsOnMethods="openingAmazonSite")
	  
	  public void openinggooglesite() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
	  //object of driver
	  ChromeDriver browserObject = new ChromeDriver();
	  //calling get method to pass the website link
	  browserObject.get("https://www.google.com/");
	  browserObject.close();
	}
	 
	  @Test (dependsOnMethods="openinggooglesite")
	  public void openingtwittersite() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
	      //object of driver
	      ChromeDriver browserObject = new ChromeDriver();
	      //calling get method to pass the website link
	      browserObject.get("https://x.com/");
	      browserObject.close();
	  }

}
