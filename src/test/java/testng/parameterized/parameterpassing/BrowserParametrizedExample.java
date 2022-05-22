package testng.parameterized.parameterpassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParametrizedExample {

    WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    void beforeMethod(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\main\\resources\\browser\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("please select correct browser");
                break;
        }
    }

    @Test
    @Parameters({"value1", "value2"})
    public void test1(String value1, String value2) throws InterruptedException {
        driver.get("https://courses.letskodeit.com/practice");
        driver.findElement(By.id("name")).sendKeys(value1);
        Thread.sleep(3000);
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(value2);
        Thread.sleep(3000);
        driver.close();
    }

}
