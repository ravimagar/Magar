package selenium.cookieshandling;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class Test {
    public static WebDriver driver;

    public static void getCookies(Set<Cookie> listCookies){
        for(Cookie c : listCookies){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Repo\\SeleniumProject2.0\\src\\test\\java\\selenium\\browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");

        Cookie addCookie = new Cookie("Institute", "Digital Partner");
        driver.manage().addCookie(addCookie);

        Set<Cookie> listCookies2 = driver.manage().getCookies();
        System.out.println("Adding the customize Cookies");
        getCookies(listCookies2);


        driver.manage().deleteCookieNamed("session-id");
        Set<Cookie> listCookies3 = driver.manage().getCookies();
        System.out.println("Delete the cookie by the name");
        getCookies(listCookies3);


        driver.manage().deleteCookie(addCookie);
        Set<Cookie> listCookies4 = driver.manage().getCookies();
        System.out.println("Delete the cookie by cookie");
        getCookies(listCookies4);

        driver.manage().deleteAllCookies();
        Set<Cookie> listCookies5 = driver.manage().getCookies();
        System.out.println("Delete the all cookie");
        getCookies(listCookies5);

        driver.close();
    }
}
