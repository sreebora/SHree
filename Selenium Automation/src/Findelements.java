import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
		// br.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		br.findElement(By.xpath("/html[1]/body[1]/div[3]/ul[1]/li[3]/a[1]")).click();
		// br.findElement(By.linkText("Logout")).click();
		// br.findElement(By.partialLinkText("Log")).click();

	}

}
