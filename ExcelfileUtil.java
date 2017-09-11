package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUtil {
		
    Workbook wb;
	public ExcelfileUtil() throws Exception
	{
	
		FileInputStream fis=new FileInputStream("./TestInputs/TestInputs.xlsx");
        wb = WorkbookFactory.create(fis);
	}
     
	
	public int rowCount(String sheetname)
	{
		int rows=wb.getSheet(sheetname).getLastRowNum();
		return rows;
	
	}
	
	public int colCount(String sheetname , int rowNo)
	{
		wb.getSheet(sheetname).getRow(rowNo).getLastCellNum();
		
		return 0;
		
	}
	
	public String getData(String sheetname, int row , int column)
	{
		
		String data="";
		
		
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_NUMERIC)
		{
		int celldata=  (int) wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		data = String.valueOf(celldata);
		}
		else
		{
		data=	wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		return  data;
	
		}
	
		}
