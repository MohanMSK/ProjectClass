package org.bnm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import bsc.clas.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checking  {
	
	@Test
	private void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	}
	
}
	
