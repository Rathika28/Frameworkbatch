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

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\SOFTWARE1\\PROGRAM\\Practice1.xlsx");
		
		FileInputStream str =new FileInputStream(f) ;
		
		Workbook w=new XSSFWorkbook(str);
		
		Sheet sheet=w.getSheet("abcd");
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		for(int i=0;i< physicalNumberOfRows;i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				if(cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l=(long)numericCellValue;
					System.out.println(l);
				}
			}
		}
		
		}

}
