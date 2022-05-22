package testng.parameterized.dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

public class Test {

    public WebDriver driver;

    @DataProvider(name = "excel-data")
    public Object[][] dataProviderRun() throws Exception{
        Object[][] obj = getExcelData("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\TestData.xlsx", "DataSet");
        return obj;
    }

    public String[][] getExcelData(String fileName, String sheetName){

        String[][] data = null;
        try {
            FileInputStream fs = new FileInputStream(fileName);
            XSSFWorkbook wb = new XSSFWorkbook(fs);
            XSSFSheet sh = wb.getSheet(sheetName);
            XSSFRow row = sh.getRow(0);
            int noOfRow = sh.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRow-1][noOfCols];

            for(int i=1; i<noOfRow; i++){
                for (int j=0; j<noOfCols; j++){
                    row = sh.getRow(i);
                    cell = row.getCell(j);
                    data[i-1][j] = cell.getStringCellValue();
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return data;
    }

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.Test(dataProvider = "excel-data")
    void verifyDataProvider(String keyword1, String keyword2){
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        txtBox.sendKeys(keyword1, " ", keyword2);
        txtBox.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
