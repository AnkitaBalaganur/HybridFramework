package com.crm.crm_hybridframework.logintest;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.crm.crm_hybridframework.base.ExcelReader;
import com.crm.crm_hybridframework.base.KeywordsImpl;

public class TestLogin {
	@Test
	public void test() {
		
		KeywordsImpl key = new KeywordsImpl();
		ArrayList data = ExcelReader.getTestData("D:\\FB\\LoginTest.xlsx");
		
		for(int i=0;i<data.size();i++) {
			if (data.get(i).equals("Open")) {
			key.Open();
				
			}
			if (data.get(i).equals("url")) {
				key.url(data.get(i+1).toString());
					
				}
			if (data.get(i).equals("input")) {
				String testData = data.get(i+1).toString();
				String objectName = data.get(i+2).toString();
				
				key.input(testData, objectName);
				}
			if (data.get(i).equals("click")) {
				
				String objectName = data.get(i+2).toString();
				
				key.click(objectName);
				}
			if (data.get(i).equals("quit")) {
					key.quit();
					}
			
		}
			
		
	}

}
