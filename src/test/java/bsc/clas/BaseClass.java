package bsc.clas;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
//BrowserLaunch 
	public static  WebDriver browserLaunch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			break;

		default:
			System.out.println("Browser");
			break;
		}
		return driver;
	}

//ImplicitlyWait
	public static void implictlyWait(int seconds) {
	  driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);}
//UrlLaunch	
	public static void urlLaunch(String url) {
	  driver.get(url); }
    //GetCurrentUrl
	     public static void getCurrentUrl() {
	       String title = driver.getTitle();
	       System.out.println(title); }
	//GetTitle
	     public static void getTitel() {
		   String title = driver.getTitle();
		   System.out.println(title); }
//SendKeys
	public static void sendKays(WebElement e,String data) {
		e.sendKeys(data);}
	    
//click
	public static void click(WebElement e) {
		e.click(); }
//Assert 
	
	
	
	
	
//Quit
	public static void quit() {
		driver.quit();
	}
	
	
	
	}
	



	
