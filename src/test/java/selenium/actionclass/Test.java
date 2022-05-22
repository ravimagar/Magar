package selenium.actionclass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("promtButton"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");

        element.click();
        Thread.sleep(3000);

        try {
            Alert alert = driver.switchTo().alert();
            String prompt = "Phalke";
            alert.sendKeys(prompt);
            Thread.sleep(3000);
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
