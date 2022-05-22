package selenium.sslcertificatehandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setHeadless(true);

        System.out.println(options.getBrowserName());
        System.out.println(options.getBrowserVersion());
        System.out.println(options.getLogLevel());
        System.out.println(options.getPlatformName());
        options.setCapability("1", "Ganesh");

        System.setProperty("webdriver.chrome.driver", "C:/Users/ganesh.jadhav/Repo/SeleniumProject2.0/src/test/java/selenium/browser/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();
    }
}
