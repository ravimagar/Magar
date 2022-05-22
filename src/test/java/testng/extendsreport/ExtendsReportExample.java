package testng.extendsreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class ExtendsReportExample {

    ExtentReports report = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
    ExtentTest test;

    @BeforeTest
    void beforeTest() {
        report.attachReporter(spark);
    }


    @Test
    void extendsReports() {
        SoftAssert softAssert = new SoftAssert();
        test = report.createTest("Launch browser & website").assignAuthor("Ganesh").assignDevice("chrome");
        test.info("User is Opening the browser");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com/");
        test.fail("Test is fail");
        driver.close();
    }

    @AfterTest
    void reportingClosed() {
        report.flush();
    }
}
