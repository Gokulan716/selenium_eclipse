package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_methos {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,-500)");
	    
	    WebElement mouse= driver.findElement(By.xpath("//button[@id='mousehover']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", mouse);
	    
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); 
	    js.executeScript("window.scrollTo(0,0)");   
	    driver.quit();
	}
}
