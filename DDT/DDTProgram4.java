package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTProgram4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\ExcelSheet\\KamalaDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String mobile= NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(mobile);
		System.out.println(pwd);
		
}
}
