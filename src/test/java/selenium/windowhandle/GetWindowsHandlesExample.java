package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class GetWindowsHandlesExample {
    @Test
    public void verifyWindowsHandles() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='    click   ']")).click();
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        String parentId = it.next();
        while (it.hasNext()) {
            String child_window = it.next();
            if (!parentId.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}