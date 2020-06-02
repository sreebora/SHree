import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programmwithvariables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php"); 

		WebElement asp = br.findElement(By.name("txtUserName"));
		asp.clear();
		asp.sendKeys("qaplanet1");  

		By asq = By.xpath("//input[@name='txtPassword']");
		WebElement asm = asp.findElement(asq);
		asm.clear();
		asm.sendKeys("lab1");

		WebElement qe = br.findElement(By.xpath("//input[@name='Submit']"));
		qe.click();  

		By sq = By.xpath("//a[contains(text(),'Logout')]");
		WebElement sa = br.findElement(sq);
		sa.click();
		
		
		
		
	}

}
