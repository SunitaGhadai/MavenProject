package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Java_Project\\Drivers\\chromedriver.exe");
		
		ChromeDriver  browserObject = new ChromeDriver();
		browserObject.get("https://bstackdemo.com/");
		//Finds all elements on the webpage with the tag <a>, which represents hyperlinks.
		//and List<WebElement>: Stores all those link elements into a list.
		List<WebElement> links = browserObject.findElements(By.tagName("a"));


		// Iterating each link and checking the response status
		//for (WebElement link : links): For each <a> element in the list...
		//link.getAttribute("href"): Gets the actual URL string from the href attribute.
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		verifyLink(url);
	}
	}
	
	public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
		}

}

	


