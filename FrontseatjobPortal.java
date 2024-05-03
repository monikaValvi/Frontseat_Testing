package frontseatWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontseatjobPortal {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.frontseat.co.za");
       WebElement home = driver.findElement(By.linkText("Home"));
       home.click();
      
       WebElement about = driver.findElement(By.linkText("About us"));
       about.click();
      
       WebElement service = driver.findElement(By.linkText("Services"));
       service.click();
       
       WebElement improova = driver.findElement(By.linkText("#IMPROOVA"));
       improova.click();
       
       WebDriverWait wait = new  WebDriverWait(driver, null, null, null, null);
       wait.until(ExpectedConditions.urlContains("https://www.frontseat.co.za/wp-content/uploads/2019/04/IMPROOVA-CAMPAIGN-CI.pdf"));
       System.out.println("https://www.frontseat.co.za" + driver.getCurrentUrl());       
      WebElement download = driver.findElement(By.id("download"));
       download.click();
              
       driver.quit();
       }
}