package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> childWindows = driver.getWindowHandles();

        for(String s: childWindows){
            if(!parentWindow.contentEquals(s)) {
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
                Thread.sleep(3000);
            }
        }
        driver.switchTo().window(parentWindow);
        driver.quit();
    }
}
