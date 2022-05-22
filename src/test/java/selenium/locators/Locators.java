package selenium.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.findElement(By.id("login1")).sendKeys("test@abc.com");
//        driver.findElement(By.name("passwd")).sendKeys("test");
//        Thread.sleep(3000);
//        driver.findElement(By.className("signinbtn")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
//        Thread.sleep(3000);
//        List<WebElement> list = driver.findElements(By.tagName("u"));
//        for (WebElement e : list) {
//            System.out.println(e.getText());
//        }

//        driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("abc@test.com");
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("test@xyz.com");
        Thread.sleep(3000);
        driver.close();
    }
}
