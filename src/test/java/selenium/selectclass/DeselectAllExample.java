package selenium.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DeselectAllExample {
    @Test
    public void verifyDeselectAllExample() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement dropdown  = driver.findElement(By.xpath("//select[@name='Month']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("May");
        select.selectByValue("Ap");
        select.selectByIndex(10);
        Thread.sleep(5000);
        select.deselectByVisibleText("May");
        select.deselectAll();
        Thread.sleep(5000);
        driver.close();
    }
}
