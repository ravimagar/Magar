package selenium.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownUpExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/index.htm");
        driver.manage().window().maximize();
        WebElement l = driver.findElement(By.id("search-strings"));
        // Actions class
        Actions a = new Actions(driver);
        // moveToElement() and then click()
        a.moveToElement(l).click();
        //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
        a.keyDown(Keys.SHIFT);
        a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
