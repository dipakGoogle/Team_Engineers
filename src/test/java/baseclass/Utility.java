package baseclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static String getTD(int rowindex,int colindex) throws Throwable, Throwable {
FileInputStream fis=new  FileInputStream("C:\\Users\\dell\\Downloads\\Zerodha.xlsx");
Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
return data;
	}


}
