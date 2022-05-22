package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Abc@xyz.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.signinbtn")).click();
        Thread.sleep(3000);
        driver.quit();
}
}
