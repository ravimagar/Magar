package selenium.uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class UploadFiles {
    @Test
    public void verifyUploadFiles() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement browse = driver.findElement(By.id("file-upload"));
        browse.sendKeys("C:\\dcagentInstaller.log");
        driver.findElement(By.id("file-submit")).click();
        System.out.println("File is Uploaded Successfully");
        String checkText = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        if ("File Uploaded!".equalsIgnoreCase(checkText)) {
            System.out.println("Upload file success.");
        }else {
            System.out.println("File isn't uploaded");
        }
        driver.close();
    }
}
