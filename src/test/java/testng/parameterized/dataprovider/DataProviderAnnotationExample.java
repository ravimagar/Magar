package testng.parameterized.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DataProviderAnnotationExample {
    public static WebDriver driver;

    @DataProvider(name = "test-data")
    public Object[][] dataProvFunc() {
        return new Object[][]{
                {"Selenium", "Delhi"}, {"LoadRunner", "Chennai"}
        };
    }

    @BeforeMethod
    void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.Test( dataProvider= "test-data")
    public void parameterTest(String keyword1, String keyword2) {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        txtBox.sendKeys(keyword1, " ", keyword2);
        Reporter.log("Keyword entered is : " + keyword1 + " " + keyword2);
        txtBox.sendKeys(Keys.ENTER);
        Reporter.log("Search results are displayed.");
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }
}

