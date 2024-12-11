package Basics;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Auto_Sugesstions {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");     
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li")));
        List<WebElement> values = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	    System.out.println(values.size());	    
	    System.out.println("Available Suggestions are:");
          for( int i=0; i<values.size(); i++){
        	  System.out.println(values.get(i).getText());
          }     
        String desiredOption = "India"; 
        boolean optionSelected = false;
        for (WebElement value : values) {
            if (value.getText().equalsIgnoreCase(desiredOption)) {
            	value.click(); 
                optionSelected = true;
                break;
            }
        }
        //test
        if (optionSelected) {
            System.out.println("Successfully selected: " + desiredOption);
        } else {
            System.out.println("Desired option not found.");
        }
	    driver.quit();
	}
}
