package selenium.displaymethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
//        driver.get("https://us.megabus.com/account-management/login/");

//        driver.findElement(By.xpath("//a[text()=' Sign up ']")).click();
        WebElement signUpButton = driver.findElement(By.xpath("//a[text()='Contact']"));
//        signUpButton.click();

      /*  driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("confirmEmail")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("choosePassword")).sendKeys("Abcd@12345");
        driver.findElement(By.id("confirmPassword")).sendKeys("Abcd@12345");
*/
//        driver.findElement(By.xpath("//a[text()='terms and conditions']//parent::label")).click();

        if(signUpButton.isDisplayed()){
            System.out.println("The Element is Displayed");
        }else {
            System.out.println("The button is not Displayed");
        }
        driver.quit();
    }
}
