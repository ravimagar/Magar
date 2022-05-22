package selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ganesh.jadhav/Repo/SeleniumProject2.0/src/test/java/selenium/browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        int sizeIFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println(sizeIFrame);

        driver.switchTo().frame("courses-iframe");
        WebElement element =  driver.findElement(By.id("search"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
//        element.sendKeys("hiiii");

        String s = driver.findElement(By.xpath("//h1[text()='All Courses']")).getText();
        System.out.println(s);

        driver.close();
    }
}
