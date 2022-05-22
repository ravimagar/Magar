package testng.parameterized.parameterpassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedExample {

    public static WebDriver driver;

    @BeforeMethod
    void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    @Parameters({"searchKey1"})
    public void parameterTest(String searchKey1) {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKey1);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    @Parameters({"searchKey2"})
    public void parameterTest2(String searchKey2) {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKey2);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }
}
