package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_pause_close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");

        // Create a new ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();

        // Open Amazon website
        driver.get("https://www.amazon.com");

        // Wait for 5 seconds
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }

}
