package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\GREEN\\PRACTICE\\Sample.xlsx");
		
		FileInputStream stream=new FileInputStream(f);
		
	    Workbook w=new XSSFWorkbook(stream);
	    
	    Sheet sheet = w.getSheet("abcd");
	    
	    int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	    System.out.println(physicalNumberOfRows);
	    
	    for(int i=0;i<physicalNumberOfRows;i++) {
	    	Row row = sheet.getRow(i);
	    	
	    	for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
	    	}
	    }
	    

	}

	

}
