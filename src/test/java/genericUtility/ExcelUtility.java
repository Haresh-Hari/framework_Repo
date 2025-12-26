package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is an Generic class to Fetch data from Excel file
 * @author Hari
 * @version 29-10-2025
 * 
 * 
 * 
 */
public class ExcelUtility {
	/**
	 * This is the method to getSingle Cell Value data from Excel File
	 * @param sheet
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getSingleCellDataFromExcel(String sheet,int rowIndex,int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Mohana\\Desktop\\TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheet).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(cell);
		return value;
	}
	public ArrayList<String> getMultipleDataFromExcel(String sheet,int rowStart,int cellStart) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Mohana\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		DataFormatter df = new DataFormatter();
		ArrayList<String> a = new ArrayList<String>();
		int row=sh.getLastRowNum();
		for(int i=rowStart;i<row;i++)
		{
			Row r = sh.getRow(i);
			int col = r.getLastCellNum();
			for(int j=cellStart;j<col;j++) {
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				a.add(value);
			}
			
			}
		return a;
	}

}
