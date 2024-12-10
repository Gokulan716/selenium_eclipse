package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsApp {

	public static void main(String[] args) throws InterruptedException {
		
	  
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        
        driver.get("https://web.whatsapp.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(10000);
        
        WebElement searchField = new WebDriverWait(driver, Duration.ofSeconds(40))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //p[@class='selectable-text copyable-text x15bjb6t x1n2onr6']")));
        searchField.click();
        searchField.sendKeys("Deepavali Trip");
        
        Actions actions = new Actions(driver);

        actions.moveToElement(searchField).sendKeys(Keys.ENTER).perform();
        
        WebElement messageField = new WebDriverWait(driver, Duration.ofSeconds(40))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //div[@aria-placeholder='Type a message']")));
		
       
        messageField.click();
        String word1 = "@gokulk";
        String word2 = "Pothumaa?";
        
        
        for (int i = 0; i < 100; i++) {
        	messageField.click();
        	messageField.sendKeys(word1);
        	messageField.sendKeys(Keys.ENTER); 
        	
        	messageField.sendKeys(word2);
        	messageField.sendKeys(Keys.ENTER);  // Press Enter after typing each word
        }
        
        driver.quit();
    

	}

}
