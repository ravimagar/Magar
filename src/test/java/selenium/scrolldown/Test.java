package selenium.scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement element = driver.findElement(By.xpath("//a[text()='Click and Hold in Selenium']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        Thread.sleep(3000);

//        js.executeScript("window.scrollBy(0,-250)");
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

        Thread.sleep(3000);
        driver.close();
    }
}
