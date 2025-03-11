package Practice_Questions;



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
/*
/*https://nichethyself.com/tourism/home.html
2. Go to "Customized tours"
3. Select "Home Stay" in preferred stay dropwdown/combo towards the bottom of the page.
4. Click on "England" checkbox
5. Now click on "Contact Us" menu on top right corner
6. On "Contact Us" window, click on Search icon.
7. Enter "London" on the pop up window and click on OK.

STC Tourism
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

public class nichethyself {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Customized tours']")).click();
		
		Set<String> allwindows =driver.getWindowHandles();
		
		ArrayList<String> all = new ArrayList<>(allwindows);
		
		driver.switchTo().window(all.get(1));
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id='days']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='days']"));
		
		
		Select s= new Select(dropdown);
		
		s.selectByVisibleText("Home Stay");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[normalize-space()='England']//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='link']")).click();

	

	}

}
