package selenium.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownEvent {
    @Test
    public void verifyDropDownEvent() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='My Store']")).click();
        driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
        Select drpDown = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
//        drpDown.selectByVisibleText("Price: Highest first");
//        drpDown.selectByIndex(1);
        drpDown.selectByValue("price:desc");
        Thread.sleep(5000);
        drpDown.deselectByValue("price:desc");
        Thread.sleep(5000);
        driver.quit();
    }
}
