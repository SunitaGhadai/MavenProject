package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
         ChromeDriver browserObject = new ChromeDriver();
	     browserObject.get("https://training.qaonlinetraining.com/testPage.php");
         
	     Select cn= new Select(browserObject.findElement(By.name("country")));
	     cn.selectByVisibleText("India");
	     cn.selectByVisibleText("India");	     
	     Select skill=new Select(browserObject.findElement(By.name("skill")));
	     skill.selectByVisibleText("Quality Assurance");
         skill.selectByVisibleText("Programming");
         
         browserObject.findElement(By.name("submit")).click();
	}
}
