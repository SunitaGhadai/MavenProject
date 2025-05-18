package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fcebook_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

        ChromeDriver browserObject = new ChromeDriver();

        browserObject.get("https://en-gb.facebook.com/reg/?app_id=0&logger_id");
        browserObject.findElement(By.name("firstname")).sendKeys("Selenium Practice");
        browserObject.findElement(By.name("lastname")).sendKeys("Class");
        Select Date =new Select(browserObject.findElement(By.name("birthday_day")));
        Date.selectByVisibleText("19");
        
        browserObject.findElement(By.id("month")).sendKeys("July");
        browserObject.findElement(By.name("birthday_year")).sendKeys("1984");
        browserObject.findElement(By.xpath("//*[@id=\"sex\"]")).click();
        Thread.sleep(2000);
        browserObject.findElement(By.name("reg_email__")).sendKeys("sunita.ghadai@gmail.com");
        browserObject.findElement(By.name("reg_passwd__")).sendKeys("sun@123abc");
        
        Thread.sleep(2000);
        
        browserObject.findElement(By.name("websubmit")).click();
        
        
        
       

	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
