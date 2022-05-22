package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class EveningBatch {
    public static WebDriver driver;

    public static void selectDate(String select_day, String month, String year){
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
        for(int i = 0; i< elements.size(); i++){
            System.out.println(elements.get(i).getText());
            if(elements.get(i).getText().equals(month + " " + year)){
                List<WebElement> days = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41']"));
                for(WebElement e : days){
                    if(e.getText().equals(select_day)){
                        e.click();
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
        String date = "23-May-2022";
        String splitter[] = date.split("-");
        String day = splitter[0];
        String month = splitter[1];
        String year = splitter[2];

        selectDate(day, month, year);
        Thread.sleep(5000);
        driver.close();
    }
}
