package Crossb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver br;
  @Test
  @Parameters("browser")
  public void f(String ibr) {
	  if (ibr.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shree\\Music\\geckodriver.exe");
			 br = new FirefoxDriver();
	        System.out.println("running with FF");
		}
		else if(ibr.equalsIgnoreCase("gg"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
			br = new ChromeDriver();
			System.out.println("running with chrome");
		}
		
		br.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.xpath("//td[2]/input")).sendKeys("qaplanet1");
	    br.findElement(By.name("txtPassword")).sendKeys("lab1");
	    br.findElement(By.name("Submit")).click();
	    
	 
	    
	    Assert.assertEquals(br.getTitle(), "OrangeHRM");
	    
	    
	  
		br.close();
	  
	  
  }
}
