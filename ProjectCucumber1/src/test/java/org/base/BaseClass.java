package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static void launchDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bindu\\eclipse-workspace\\ProjectCucumber\\Driver\\chromedriver.exe");
    driver=new ChromeDriver();
}
public static void loadUrl(String url) {
	driver.get(url);
} 
public static void fill(WebElement e,String value) {
e.sendKeys(value);
}
public static void btnClick(WebElement e) {
	e.click();
}
public static String readData(int rowno,int cellNo) {
File f=new File("C:\\Users\\Bindu\\eclipse-workspace\\ProjectCucumber\\Excel\\inputs.xlsx");
	String value=null;
	try {
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(rowno);
		Cell c=r.getCell(cellNo);
		int type=c.getCellType();
		if(type==1) {
			value=c.getStringCellValue();
	 }   
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c))
					{
				Date date=c.getDateCellValue();
				SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy");
				value=sf.format(date);
				
					}else
					{
						double d=c.getNumericCellValue();
						long l=(long)d;
						value=String.valueOf(l);
					}
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return value;

}









}
