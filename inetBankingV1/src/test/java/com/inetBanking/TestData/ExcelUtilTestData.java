package com.inetBanking.TestData;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtilTestData {

	public static void main(String[] args) {
		Workbook wb = new HSSFWorkbook();  
        try  (OutputStream fileOut = new FileOutputStream("Javatpoint.xls")) {  
            Sheet sheet1 = (Sheet) wb.createSheet("First Sheet");  
            org.apache.poi.ss.usermodel.Sheet sheet2 = wb.createSheet("Second Sheet");  
            wb.write(fileOut);  
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        }
	}

}
