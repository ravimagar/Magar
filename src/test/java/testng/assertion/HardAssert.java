package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {

    @Test
    void verifyHardAssert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String subHeader = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
        Assert.assertEquals(title, "Facebook - log in or sign up", "Facebook - log in or sign up title should match");
        Assert.assertEquals(subHeader, "'Facebook helps you connect and share with the people in your life.", "'Facebook helps you connect and share with the people in your life. should match");
        driver.close();
    }
}
