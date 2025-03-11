package Practice_Questions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon_Add_tocart {
	
public static void main(String [] args)  {
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dictionary");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='listitem'])[1]"))).click();
    
    Set<String> allWindows= driver.getWindowHandles();
	
    List<String> windowList = new ArrayList<>(allWindows);

    driver.switchTo().window(windowList.get(1));
   
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='add-to-cart-button']"))).click();
    
     driver.quit();


}

}
