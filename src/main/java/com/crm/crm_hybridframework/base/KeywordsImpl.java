package com.crm.crm_hybridframework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.opera.OperaDriver;

public class KeywordsImpl implements Keywords {
	
	static OperaDriver driver;
	static FileInputStream input = null;
	static Properties prop = null;

	@Override
	public void Open() {

	 prop = new Properties();
		
			try {
				input = new FileInputStream("C:\\Users\\ankit\\eclipse-workspace\\crm_hybridframework\\src\\main\\java\\com\\crm\\crm_hybridframework\\base\\objectrepository.properties");
				prop.load(input);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
	            if (input != null) {
	                try {
	                    input.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
			
		
			System.setProperty("webdriver.opera.driver", "D:\\test1\\operadriver_win64\\operadriver.exe");
		 
		  driver = new OperaDriver();

	}

	

	@Override
	public void url(String url) {
		driver.get(url);
	}



	public void input(String testData, String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
		
	}
	
	


	public void click(String objectName) {
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	



	public void quit() {
		driver.quit();
		
	}
}

