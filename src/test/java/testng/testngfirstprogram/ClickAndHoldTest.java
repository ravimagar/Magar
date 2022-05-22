package testng.testngfirstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHoldTest {

    @Test
    void clickAndHold() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
        WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", titleC);
        actions.moveToElement(titleA).build().perform();
        actions.clickAndHold().build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
