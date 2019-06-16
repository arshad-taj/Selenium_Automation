package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void selectDaptName() throws IOException {
		
		String departmentName;
		
		FileInputStream fis=new FileInputStream(new File("e:/ExcelFile.xlsx"));
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet globalSheet=wb.getSheetAt(0);
		
		int rowCount=globalSheet.getLastRowNum();
		
		for(int i=0;i<rowCount;i++) {
			
			departmentName=globalSheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(departmentName);
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		selectDaptName();
	}

}
