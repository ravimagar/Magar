package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class NewTestForMorningBatch {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.id("source")).sendKeys("Pune");
        List<WebElement> listOfCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));

        for (WebElement city : listOfCities){
            if(city.getText().equals("Pune")){
                city.click();
                break;
            }
        }

        String selDate = "22";
        String selMonth = "April";
        String selYear = "2022";

        driver.findElement(By.id("datepicker1")).click();
        String liMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
        String liOfYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        System.out.println(liMonth);
        System.out.println(liOfYear);

        if(liMonth.equals(selMonth) && liOfYear.equals(selYear)){
            List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
            for(WebElement date : allDate){
                if(date.getText().equals(selDate)){
                    date.click();
                    return;
                }
            }
        }
        driver.close();
    }
}
