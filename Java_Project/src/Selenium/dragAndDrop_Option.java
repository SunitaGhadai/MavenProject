package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop_Option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

        //creating object(driver)//launch the browser
        ChromeDriver browserObject = new ChromeDriver();
        browserObject.get("https://jqueryui.com/droppable/");
        //to switch the screen
        browserObject.switchTo().frame(0);
        //source from where it has to start
        WebElement source = browserObject.findElement(By.xpath("//*[@id='draggable']/p"));
        //target where it should be dropped
        WebElement target = browserObject.findElement(By.xpath("//*[@id='droppable']/p"));
        Thread.sleep(2000);
        Actions act=new Actions(browserObject);
        Thread.sleep(2000);
        act.dragAndDrop(source,target).build().perform();

	}

}
      
		
		       
      
    