package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis=new FileInputStream("C:\\Users\\Arshad\\Desktop\\qq.xlsx");
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sheet=wb.getSheetAt(0);
//		sheet.getRow(0).createCell(0).setCellValue("cccccccccc");
//		FileOutputStream fout=new FileOutputStream("C:\\Users\\Arshad\\Desktop\\qq.xlsx");
//		wb.write(fout);
//		
//		wb.close();
		System.out.println("fdfa");
		ExcelReader.selectDaptName();

	}

}
