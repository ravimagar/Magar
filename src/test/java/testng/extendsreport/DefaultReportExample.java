package testng.extendsreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class DefaultReportExample {

    ExtentReports reports = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("TestReport.html");
    ExtentTest test;

    @BeforeTest
    void beforeTest(){
        reports.attachReporter(spark);
    }

    @Test
    public void defaultReports1() {
        test = reports.createTest("Launch browser & website").assignAuthor("Shubham").assignDevice("chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        test.info("User is opening the browser");
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        softAssert.assertEquals(googleTitle, "Google", "message should Google");
        test.pass("Test is passed");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void defaultReports2() {
        test = reports.createTest("Launch browser & website").assignAuthor("Ajinkya").assignDevice("chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        softAssert.assertEquals(googleTitle, "google", "message should google");
        test.fail("Test is fail");
        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void defaultReports3() {
        test = reports.createTest("Launch browser & website").assignAuthor("Kirti").assignDevice("chrome");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        softAssert.assertEquals(googleTitle, "Google", "message should Google");
        test.pass("Test is passed");
        driver.quit();
        softAssert.assertAll();
    }

    @AfterTest
    public void afterTest(){
        reports.flush();
    }
}
