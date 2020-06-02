import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programwithvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php");
		// br.findElement(By.className("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		// br.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	//	WebElement userid = br.findElement(By.name("txtUserName"));
	//	userid.clear();
	//	userid.sendKeys("qaplanet1");

		//By pdl = By.name("txtPassword");
	//	WebElement pdf = br.findElement(pdl);
	//	pdf.clear();
	//	pdf.sendKeys("lab1");
		
		//Login 
		//br.findElement(By.xpath("//input[@name='Submit']")).click();
		//WebElement app = br.findElement(By.xpath("//input[@name='Submit"));
		//app.click();
		
	 WebElement asp =  br.findElement(By.name("txtUserName"));
	 asp.clear();
	 asp.sendKeys("qaplanet1");
	 
	By asq =  By.xpath("//input[@name='txtPassword']");
		WebElement asm = asp.findElement(asq);
		asm.clear();
		asm.sendKeys("lab1");

		
		WebElement qe =br.findElement(By.xpath("//input[@name='Submit']"));
		qe.click();
		
		By sq =By.xpath("//a[contains(text(),'Logout')]");
		WebElement sa = br.findElement(sq);
		sa.click();
		
		
		
		
		
		// Logout 
		
		//br.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		

		// WebElement pd = br.findElement(pdl);
		// pd.sendKeys("lab1");

		// br.findElement(By.name("txtUserName")).clear();
		// br.findElement(By.name("txtUserNam")).sendKeys("qaplanet1");

	}

}
