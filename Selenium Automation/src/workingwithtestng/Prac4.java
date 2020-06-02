package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prac4 {
	
	String buildpath = "http://apps.qaplanet.in/hrm/login.php";
	WebDriver br;
  @Test(enabled=true,priority=1,groups="Login")
  public void f() {
	  
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
		String title = br.getTitle();
		System.out.println(title);
		Assert.assertEquals(br.getTitle(),"OrangeHRM");
		
  }
 
			
	
  @BeforeMethod
  @Parameters("browser")
  
		public void buildcaseexecution(String ibr){
	  if (ibr.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shree\\Music\\geckodriver.exe");
			 br = new FirefoxDriver();
	        System.out.println("running with FF");
	        br.get(buildpath);
		}
		else if(ibr.equalsIgnoreCase("gg"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
			br = new ChromeDriver();
		
			System.out.println("running with chrome");
			 br.get(buildpath);
		}
		
			
		}
  @AfterMethod
  public void afterexecution() {
  
	  br.close();
	  
  }


  }
