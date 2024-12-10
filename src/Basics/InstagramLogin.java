package Basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLogin {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "//Users//gokul//Desktop//Gokul//Learning//chromedriver-mac-arm64//chromedriver");
        ChromeDriver driver = new ChromeDriver();

        try {
            // Navigate to the Instagram login page
            driver.get("https://www.instagram.com/");
            driver.manage().window().maximize();

            // Wait for the username input field to be present and locate it
            WebElement usernameField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
            usernameField.click();
            usernameField.sendKeys("gokulan716@gmail.com");

            // Locate the password input field
            WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
            passwordField.click();
            passwordField.sendKeys("#Jegok"); 

            // Locate the submit button and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();
            
            
            // Locate the Search button and click it
                        
            //Thread.sleep(10000);
            WebElement Notnow = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='button' and contains(text(), 'Not now')]")));
            
            Notnow.click();
            
            WebElement notiNotnow = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Not Now')]")));
 
            notiNotnow.click();
            
            WebElement Searchbtn = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains (text(), 'Search')]")));
 
            Searchbtn.click();
            
            WebElement searchfield = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search' and @type='text']")));
 
            searchfield.sendKeys("mo_han5524");
            Thread.sleep(5000);
            Actions actions = new Actions(driver);

            // Send the down arrow key to the element
            actions.moveToElement(searchfield).sendKeys(Keys.ARROW_DOWN).perform();
            actions.moveToElement(searchfield).sendKeys(Keys.ENTER).perform();
            
            Thread.sleep(5000);
            
            WebElement Morebtn = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains (text(), 'More')]")));    
            Morebtn.click();
            
            WebElement logout = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains (text(), 'Log out')]")));    
            logout.click();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Close the driver after the task is completed
          driver.quit();
        }
    }
}