package frameworkexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
 String buildpath = "http://apps.qaplanet.in/hrm/login.php";
	void testcase1(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get(buildpath);
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
		String title = br.getTitle();
		System.out.println(title);
		
		if(br.getTitle().equals("OrangeHRM"))
			
		System.out.println("pass");
		else
			System.out.println("fail" );
		
		br.close();
}
void testcase2() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
	WebDriver br = new ChromeDriver();
	// Browser commands // Chro path it is an add on tool of chrome browser or
	// firefox browser to inspect web element,it is an option to give x path
	br.get(buildpath);
	br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	br.findElement(By.xpath("//input[@name='Submit']")).click();
	System.out.println(br.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText());
	if(br.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText().equals("Logout"))
		System.out.println("pass");
	else 
		System.out.println("fail");
	br.close();
}
	void testcase3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get(buildpath);
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
		
		Alert qt =	br.switchTo().alert();
	     String qy = qt.getText();
	    	System.out.println(qy);
	    	
	    	
	    	if(qy.equals("User Name not given!"))
	    		System.out.println("pass");
	    	else 
	    		System.out.println("fail");
	    	qt.accept();
	    	br.close();
	}    	
	  void testcase4() {  

		  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
			WebDriver br = new ChromeDriver();
			// Browser commands // Chro path it is an add on tool of chrome browser or
			// firefox browser to inspect web element,it is an option to give x path
			br.get(buildpath);
			br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
			br.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(4) td:nth-child(2) > input.button")).click();
		  if(br.findElement(By.xpath("//input[@name='txtUserName']")).getText().equals(""))
		  System.out.println("pass");
		  else
			  System.out.println("fail");
		  br.close();
		  
			  
	  }
}
	
	



