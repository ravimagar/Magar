package selenium.brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {
    @Test
    void verifyBrokenLinks() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links are " + links.size());
        List<String> urlList = new ArrayList<>();
        for (WebElement e : links){
            String url = e.getAttribute("href");
            urlList.add(url);
//            checkBrokenLink(url);
        }

        urlList.parallelStream().forEach(e -> checkBrokenLink(e));
        driver.close();
    }

    public static void checkBrokenLink(String linkUrl){
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
            httpUrlConnection.setConnectTimeout(5000);
            httpUrlConnection.connect();
            if (httpUrlConnection.getResponseCode() >= 400){
                System.out.println(linkUrl + " ------ " + httpUrlConnection.getResponseMessage() + " is a broken link");
            }
            else {
                System.out.println(linkUrl + " ----> " + httpUrlConnection.getResponseMessage());
            }
        }
        catch (Exception e){

        }
    }
}
