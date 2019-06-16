package Framework.ExcelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataClass {

	public ArrayList getData(String sheetName,String testCase) throws IOException {
		
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C:\\Users\\Arshad\\Desktop\\dataDriven.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//get access to sheet
		
		int sheets=workbook.getNumberOfSheets();
		for (int i=0;i<sheets;i++)
		{
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				//identifying "Testcases" by scanning entire first row
		/**/	Iterator<Row> row=sheet.iterator();//sheet is collection of rows
				Row firstRow=row.next();
				Iterator<Cell> cell=firstRow.cellIterator();// row is collection of cells
				int k=0,columnNum=0;
						
				while(cell.hasNext())
				{
					
					if(cell.next().getStringCellValue().equalsIgnoreCase(testCase))
					{
						
					}
					k++;
				}
				columnNum=k;
				System.out.println(columnNum);
		
				
				while (row.hasNext()) 
				{
					Row r=row.next();
					if(r.getCell(columnNum).getStringCellValue().equalsIgnoreCase("Add Profile"))
					{
						Iterator<Cell> c=r.cellIterator();
						while (c.hasNext())
						{
							Cell cc=c.next();
							if(cc.getCellType()==CellType.STRING)
							{
							a.add(cc.getStringCellValue());
							}
							else
							{
								a.add(NumberToTextConverter.toText(cc.getNumericCellValue()));
								//converting numeric value to text using "NumberToTextConverter" belongs to "org.apache.poi.ss.util".
							}
						}
						
					}
				}
				
				
				
					
				
				
			}
		}
		return a;

	}

}
