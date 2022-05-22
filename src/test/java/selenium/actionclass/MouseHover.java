package selenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

    @Test
    void verifyMouseHover() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//a[text()='Women']"));
        actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]")).click();
        driver.close();
    }
}
