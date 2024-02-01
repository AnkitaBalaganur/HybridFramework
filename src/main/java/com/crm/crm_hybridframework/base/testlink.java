package com.crm.crm_hybridframework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class testlink {
	
	 public static void main(String[] args) {
		 System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
		 
		 OperaDriver  driver = new OperaDriver();

	        // Navigate to the webpage
	        driver.get("https://sakshi.mirrar.com/");

	        // Find all the links on the webpage
	        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

	      for(int i=0; i< links.size();i++) {
	    	  String text = links.get(i).getText();
	    	  System.out.println(text);
	    	  
	      }

	        // Close the browser
	      
	      // Print the total number of links
	     //   System.out.println("Total number of links on the webpage: " + links.size());
	        //driver.quit();
	    }

}
