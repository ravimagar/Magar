package selenium.dynamictable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testuserautomation.github.io/WebTable/");
// Method 1
        String before_xpath = "//table/tbody/tr[";
        String after_xpath = "]/td[2]";
        List rows = driver.findElements(By.xpath("//table/tbody/tr"));
        int rowSize = rows.size();
        System.out.println(rowSize);
        for (int i = 2; i <= rowSize; i++) {
            String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(firstNames);
// Now click the checkBox where first Name would be Will
            if (firstNames.contains("Will")) {
// click the checkBox
                driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click();
                System.out.println("candidate has been selected");
                break;
            }
        }
// Method 2 : By custom xpath:
        driver.findElement(By.xpath("//td[contains(text(),'Will')]//preceding-sibling::td//input[@type='checkbox']")).click();
        driver.close();
    }
}

