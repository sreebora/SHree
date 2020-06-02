package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practisetesng2 {
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
  }
}
