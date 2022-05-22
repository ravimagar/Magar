package selenium.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class DatePicker {
    public static WebDriver driver;

    public static void selectDate(String month_year, String select_day) {
        List<WebElement> elements = driver.findElements(By.xpath("//div[starts-with(@data-testid,'undefined-calendar-day-`%s`')]"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
//Selecting the month
            if (elements.get(i).getText().equals(month_year)) {
//Selecting the date
                List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Week'])[4]"));
                for (WebElement d : days) {
                    System.out.println(d.getText());
                    if (d.getText().equals(select_day)) {
                        d.click();
                        return;
                    }
                }

            }
        }
        driver.findElement(By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/div/a/span")).click();
    }

    @Test
    public void verifyDatePicker() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
        driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).sendKeys("Pune");
        driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]")).sendKeys("Delhi");
        driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = formatter.format(d);
        String splitter[] = date.split("-");
        String month_year = splitter[1];
        String day = splitter[0];
        System.out.println(month_year);
        System.out.println(day);
        selectDate(month_year, day);
        driver.close();
    }
}


