package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTProgram2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\Excelsheet\\KamalaDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet s1 = wb.getSheet("login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		System.out.println(username);
		
		//shortcut for this is below
		
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
	}

}
