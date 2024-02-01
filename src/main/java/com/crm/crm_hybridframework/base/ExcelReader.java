package com.crm.crm_hybridframework.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelReader {
	 public static ArrayList getTestData(String filePath) {
		 ArrayList arr = new ArrayList();
		 try {
				 FileInputStream inputStream = new FileInputStream(new File(filePath));
				 
	             Workbook workbook = WorkbookFactory.create(inputStream);

	            Sheet sheet = workbook.getSheetAt(0);
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            arr.add(cell.getStringCellValue());
	                            break;
	                        case NUMERIC:
	                        	arr.add(cell.getNumericCellValue() + "\t");
	                            break;
	                        case BOOLEAN:
	                        	arr.add(cell.getBooleanCellValue() + "\t");
	                            break;
	                        default:
	                            System.out.print("\t");
	                    }
	                }
	                System.out.println();
	            }
	            inputStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return arr;
	 }}


