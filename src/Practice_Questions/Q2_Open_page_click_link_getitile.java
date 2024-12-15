package Practice_Questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q2_Open_page_click_link_getitile {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     String originalWindow = driver.getWindowHandle();
	     driver.findElement(By.xpath("//a[contains(text(),'QA Meetup with Rahul Shetty @Bangalore - Limited S')]")).click();
	     Set<String> windowHandles = driver.getWindowHandles();
    
         for (String handle : windowHandles) {
             if (!handle.equals(originalWindow)) {
                 driver.switchTo().window(handle);
                 break;
             }
         }
	     Thread.sleep(3000);
	     
	     System.out.println(driver.getTitle());
	     driver.quit();   
	    
	}

}
