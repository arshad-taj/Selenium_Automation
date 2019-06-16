package Framework.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		GetDataClass obj=new GetDataClass();
		ArrayList adata=obj.getData("datasheet","Delete Profile");
		for (int i=0;i<adata.size();i++)
		{
			System.out.println(adata.get(i));
		}
		
	}

}
