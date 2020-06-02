import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php");
		
		//br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		By text = By.xpath("//input[@name='txtUserName']");
		WebElement at = br.findElement(text);
		at.sendKeys("");
		
		By text3 = By.name("txtPassword");
		WebElement awe = br.findElement(text3);
		awe.sendKeys("");
		
		 By user= By.name("Submit");
		 WebElement ap =br.findElement(user);
		 ap.click();
		 Thread.sleep(5000);
		 
		//String cg =  br.switchTo().alert().getText();
		//System.out.println(cg);
		 

		
		
		 
		

		 
		  
	//By	ac = By.xpath("//input[@name='Submit']");
	//	WebElement text1= br.findElement(ac);
	//	text1.clear();
	//	Thread.sleep(200);
		 
		 
	}

}
