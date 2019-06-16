package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Hashmap {

	public static void main(String[] args) throws Exception {
		// hashMap stores the value in key value format
		// doesn't maintain order
		//not synchronized
		//can have one null key and multiple null value
		//contains unique elements only i.e keys duplicates not allowed, duplicate values are allowed
		
		FileInputStream fis=new FileInputStream("D:\\Excel_HashMap.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row;
	
			
		Map<String,String> hm=new HashMap<String,String>();
	
		for (int i=1;i<=sheet.getLastRowNum();i++) 
		{
			row=sheet.getRow(i);
			String key=row.getCell(0).getStringCellValue();
			
			for (int j=1;j<row.getLastCellNum();j++)
			{
				String value=row.getCell(j).getStringCellValue();
				hm.put(key, value);
			}
			
		
			
		}
		
		System.out.println(hm);
		
		for (Entry ent:hm.entrySet())
		{
			System.out.println(ent.getKey()+"="+ent.getValue());
		}
				
		
	
		
	
		
	

	}

	private static XSSFRow getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
