package Basics;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class Cookies_handling {

	public static void main(String[] args) {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   Set<Cookie> cookies = driver.manage().getCookies();
		    for (Cookie cookie : cookies) {
		        System.out.println(cookie.getName() + ": " + cookie.getValue());
		    } 
		    Cookie newCookie = new Cookie("key", "value");
		    driver.manage().addCookie(newCookie); 
		    driver.manage().deleteCookieNamed("cookieName");
		    driver.manage().deleteAllCookies(); 
		    driver.quit();
	}
}
