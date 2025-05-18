package Selenium;

	
		import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		public class AutomaticFormFillup {
		    public static void main(String[] args) throws InterruptedException {
		        // Set the path to your Driver executable
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
                //object of driver
		        ChromeDriver browserObject = new ChromeDriver();
		        //calling get method to pass the website link
		        browserObject.get("https://training.qaonlinetraining.com/testPage.php");
		        
		        browserObject.findElement(By.name("name")).sendKeys("Infotek");
		        
		        Thread.sleep(2000);
		        //to send values to input box use send method
		        browserObject.findElement(By.name("email")).sendKeys("Infotek_solution@gmail.com");
		        
		        Thread.sleep(2000);
		        
		        browserObject.findElement(By.name("website")).sendKeys("www.infotek.com");
		        
		        browserObject.findElement(By.name("comment")).sendKeys("This is a new website");
		        
		        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click(); 
		        
		       // browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();	    

		        //browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
		        
		        browserObject.findElement(By.name("bike")).click();
		        
		        browserObject.findElement(By.name("car")).click();
		        
		        browserObject.findElement(By.name("boat")).click();
		        
		        browserObject.findElement(By.name("horse")).click();
		        
		        Select cn= new Select(browserObject.findElement(By.name("country")));
		        
		        Thread.sleep(2000);
		        
		        cn.selectByVisibleText("India");
		        browserObject.findElement(By.name("submit")).click();
		        Thread.sleep(2000);
		        
		        Select skill=new Select(browserObject.findElement(By.name("skill")));
		        skill.selectByVisibleText("Quality Assurance");
		        Thread.sleep(2000);
		        browserObject.findElement(By.id("alert")).click();
		        Alert alert1 = browserObject.switchTo().alert();
		        alert1.accept();
		        Thread.sleep(2000);
		        browserObject.findElement(By.id("confirm")).click();
		        Alert alert2 = browserObject.switchTo().alert();
		        alert2.dismiss();
		        Thread.sleep(2000);
		        browserObject.findElement(By.id("prompt")).click();
		        Alert alert3 = browserObject.switchTo().alert();
		        alert3.sendKeys("Hello Sunita");
		        alert3.accept();
		        
		       
		    }
		    
		}
		
		//https://training.qaonlinetraining.com/testPage.php