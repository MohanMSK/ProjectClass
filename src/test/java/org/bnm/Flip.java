package org.bnm;

import java.awt.List; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.poifs.filesystem.Entry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import bsc.clas.BaseClass;

public class Flip extends BaseClass {
	@BeforeClass
	  public static void l() {
		browserLaunch("chrome");
		implictlyWait(10);
	}
	@Before
	public static void urlLaunch() {
      urlLaunch("http://greenstechnologys.com");
      
      getCurrentUrl();
	  getTitel();
	  }
		@Test
		public void Test1() {
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
	
		
		WebElement sb = driver.findElement(By.xpath("//input[@name='q']"));
		sb.sendKeys("i phone");
		WebElement btnclick = driver.findElement(By.xpath("//button[@type='submit']"));
		btnclick.click();
		}
		@Test
     	public void Test2() {
	
		 java.util.List<WebElement> iphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 java.util.List<WebElement> PRICE = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		      
		java.util.List<Integer> list = new ArrayList<>();
		 for (int i = 0; i <PRICE.size(); i++) {
			WebElement price = PRICE.get(i);
			String text = price.getText();
			String replaceAll = text.replaceAll("[^0-9]","");
			int parseInt = Integer.parseInt(replaceAll);
			boolean add = list.add(parseInt);
		}
		 Collections.reverse(list);
		 System.out.println("Ascending Order = "+list);
		 
		 Integer min = Collections.min(list);
		 System.out.println("minimum = " +min);
		 
		 Integer max = Collections.max(list);
		 System.out.println("maximum = "+max);
		 Map<String, String> map =new LinkedHashMap<>();
		 for (int i = 0; i < iphones.size(); i++) {
			String iphone = iphones.get(i).getText();
			String Pric = PRICE.get(i).getText();
			String put = map.put(iphone, Pric);
		}
		 Set<java.util.Map.Entry<String,String>> entrySet = map.entrySet();
		 for (java.util.Map.Entry<String,String> entry : entrySet) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
			
		}
		 }
		

		
		
	



