package selenium.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement dropDownOption = driver.findElement(By.xpath("//select[@name='Month']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", dropDownOption);
        Select drpDown = new Select(dropDownOption);
        drpDown.selectByIndex(6);
        drpDown.selectByIndex(7);
        drpDown.selectByIndex(8);
        drpDown.selectByIndex(1);
        drpDown.selectByIndex(2);
        Thread.sleep(3000);
        drpDown.deselectByVisibleText("January");
        Thread.sleep(3000);
        drpDown.deselectByIndex(7);
        Thread.sleep(3000);
        drpDown.deselectAll();
        Thread.sleep(3000);
        driver.quit();
    }
}
