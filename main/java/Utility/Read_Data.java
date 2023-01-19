package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.j2objc.annotations.Property;

public class Read_Data {
	
	public static String readPropertyFile( String value ) throws Exception {

	Properties p = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\ADMI\\eclipse-workspace\\ProjectSept2022\\test Data\\Cofig.properties");
	p.load(file);
	return p.getProperty(value );
	
	}
	
	public static String readExcelSheet(int row, int col) throws Exception
	{
		FileInputStream file = new  FileInputStream("C:\\Users\\ADMI\\eclipse-workspace\\ProjectSept2022\\test Data\\New Microsoft Excel Worksheet.xls");
		Sheet excel = WorkbookFactory.create(file).getSheet("sheet1");
		String value = excel.getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}
	
	}

