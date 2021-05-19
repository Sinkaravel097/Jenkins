package org.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void closeTab() {
		driver.close();
	}

	public static void fillText(WebElement element, String txt) {
		element.sendKeys(txt);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static Actions a;

	public static void toMoveTheCursor(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement drag, WebElement drop) {
		a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}

	public static String excelRead(String excelName, int sheetNum, int row, int cell) throws IOException {
		
		// to get excel file path
		File f = new File("D:\\NewMaven\\Maven11.30am\\Excel\\" + excelName);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet mySheet = wb.getSheetAt(sheetNum);

		Row eachRow = mySheet.getRow(row);

		Cell eachCell = eachRow.getCell(cell);

		int cellType = eachCell.getCellType();

		// cellType == 1 ---> String type

		// celType == other than 1 --> date or number

		String value = "";

		if (cellType == 1) {
			value = eachCell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(eachCell)) {

			Date d = eachCell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("MMMM yyyy");
			value = s.format(d);
		} else {
			double d = eachCell.getNumericCellValue(); // 23456.0
			long l = (long) d; // 23456
			value = String.valueOf(l);
		}

		return value;
	}

}
