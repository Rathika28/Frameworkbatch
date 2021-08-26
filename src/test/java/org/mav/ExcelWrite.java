package org.mav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
		public static void main(String[] args) throws IOException   {
			
			File f=new File("D:\\Practice\\Sample.xlsx");
			
			FileInputStream stream=new FileInputStream(f);
			
		    Workbook w=new XSSFWorkbook(stream);
		    
		    Sheet sheet = w.getSheet("abcd");
		    
		    int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		    System.out.println(physicalNumberOfRows);
		    
		    for(int i=0;i<physicalNumberOfRows;i++) {
			   Row row = sheet.getRow(i);

				for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
					Cell cell = row.getCell(j);
					
					int cellType = cell.getCellType();
					
					if(cellType==1) {
						String stringCellValue = cell.getStringCellValue();
						
						if(stringCellValue.equals("USA")) {
							cell.setCellValue("TAMILNADU");
						}
					}
					FileOutputStream str=new FileOutputStream(f);
					w.write(str);
					
		   }
		   

		    }
		}
}


