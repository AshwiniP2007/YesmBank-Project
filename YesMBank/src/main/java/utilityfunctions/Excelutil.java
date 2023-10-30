package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil 
{
	public static XSSFWorkbook workbook = null;
	
	public static XSSFSheet sheet1=null;
	
	public static void getSheet() {
	try {
		 workbook = new XSSFWorkbook("C:\\Users\\ashwi\\eclipse-workspace\\YesMBank\\src\\main\\java\\data\\LoginData.xlsx");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 sheet1=workbook.getSheet("Sheet1");
	}
	public static int getRowCount()
	{
		getSheet();
	int rowcount = sheet1.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	return rowcount;
	}
	
	public static int getColCount()
	{
		getSheet();
	int colcount = sheet1.getRow(0).getPhysicalNumberOfCells();
	
	System.out.println(colcount);
	
	//String Data = sheet1.getRow(0).getCell(0).getStringCellValue();
	//System.out.println(Data);
	return colcount;
	}
	public static String getCellValue(int rno, int colno) {
		getSheet();
		String data=sheet1.getRow(rno).getCell(colno).getStringCellValue();
		return data;
	}
}
