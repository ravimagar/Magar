package testng.rerunfailtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RerunAutomationScripts {

    public static WebDriver driver;

    @BeforeMethod
    void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void reRunScript() {
        driver.get("http://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google", "both condistion should match");
    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }
}


