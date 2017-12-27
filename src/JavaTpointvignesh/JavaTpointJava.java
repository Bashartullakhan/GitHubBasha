package JavaTpointvignesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaTpointJava {

	public static void main(String[] args) throws Throwable 
	{
		
       WebDriver driver=new FirefoxDriver();
       driver.navigate().to("https://www.javatpoint.com/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       Actions act=new Actions(driver);
      WebElement ele= driver.findElement(By.xpath("//a[text()='Java']"));
      act.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
      Thread.sleep(2000);
      System.out.println(driver.getTitle());
      
      
		
	}

}
