package testNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTestClass {
	WebDriver browserObject;
  @Test(priority=2)
  public void openamazon() {
	  //which driver and where it is located
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
      //object of driver
      ChromeDriver browserObject = new ChromeDriver();
     browserObject.manage().window().maximize();
      //calling get method to pass the website link
      browserObject.get("https://www.amazon.com/");
      browserObject.close();
  }
  @Test(priority=3)
  
  public void opengoogle() {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
  //object of driver
  ChromeDriver browserObject = new ChromeDriver();
  browserObject.manage().window().maximize();
  //calling get method to pass the website link
  browserObject.get("https://www.google.com/");
  browserObject.close();
}
  @Test (priority=1)
  public void opentwitter() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
      //object of driver
      ChromeDriver browserObject = new ChromeDriver();
      browserObject.manage().window().maximize();
      //calling get method to pass the website link
      browserObject.get("https://x.com/");
  }
  @Test (priority=4)
  public void facebook() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
      //object of driver
      ChromeDriver browserObject = new ChromeDriver();
      browserObject.manage().window().maximize();
      //calling get method to pass the website link
      browserObject.get("https://www.facebook.com/");
  }

}