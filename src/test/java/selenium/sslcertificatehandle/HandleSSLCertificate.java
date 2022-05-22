package selenium.sslcertificatehandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLCertificate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://expired.badssl.com/");
//        System.out.println("The page title is : " +driver.getTitle());

        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(handlingSSL);
        driver.get("https://expired.badssl.com/");
        Thread.sleep(3000);
        System.out.println("The page title is : " +driver.getTitle());

        driver.quit();
    }
}
