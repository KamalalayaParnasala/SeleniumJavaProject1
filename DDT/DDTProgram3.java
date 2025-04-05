package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTProgram3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\Excelsheet\\KamalaDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
		//short cut to username
		String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		//shortcut to retrieve password
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
	}

}
