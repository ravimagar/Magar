package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test123 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        String selDate = "17";
        String selMonth = "May";
        String selYear = "2022";
        driver.findElement(By.id("datepicker1")).click();

        String liMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
        String liYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        if (liMonth.equals(selMonth) && liYear.equals(selYear)) {
            List<WebElement> allDate = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//child::tbody/tr/td"));
            for (WebElement date : allDate) {
                if (date.getText().equals(selDate)) {
                    date.click();
                    break;
                }
            }

        }
        driver.close();
    }
}
