package selenium.cookieshandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flipkart.com");
        driver.manage().getCookies();
        driver.manage().getCookieNamed("mycookie");
//        driver.manage().deleteCookieNamed("mycookie");
//        driver.manage().deleteAllCookies();
        driver.close();
    }
}
