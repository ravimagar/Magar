package testng.parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecutionExample {
    public static WebDriver driver;
    @BeforeMethod
    void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    void verifyLocalTest1(){
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
    }

    @Test
    void verifyLocalTest2(){
        driver.get("https://www.google.com");
    }

    @Test
    void verifyLocalTest3(){
        driver.get("https://www.facebook.com");
    }

    @AfterMethod
    void afterMethod(){
        driver.close();
    }
}
