package workingwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	 String buildpath = "http://apps.qaplanet.in/hrm/login.php";


	public static void main(String[] args) {
		/// TODO Auto-generated method stub
		 String buildpath = "http://apps.qaplanet.in/hrm/login.php";
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\shree\\Music\\geckodriver.exe");
			WebDriver br = new FirefoxDriver();
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

}
