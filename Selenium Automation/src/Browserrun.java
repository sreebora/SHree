import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserrun {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands
		br.get("http://apps.qaplanet.in/hrm/login.php");
		String pt = br.getTitle();
		System.out.println(pt);
		String ot = br.getPageSource();
		System.out.println(ot);
		String op =br.getCurrentUrl();
		System.out.println(op);
		
		// Navigation commands 
		//br.navigate().to("https://www.redbus.in/");
		Navigation ap = br.navigate(); // variable creating 
		//ap.to("https://www.redbus.in/");
		//ap.back();
		//ap.forward();
		//ap.refresh();
		
		Navigation ai = br.navigate();// navigation return type 
		
		br.navigate().to("https://www.redbus.in/");
		br.navigate().back();
		br.navigate().forward();
		br.navigate().refresh();
		
		
		
		
		
		
		
		
		 

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\shree\\Documents\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://google.com");
		// System.out.println(driver.getTitle());

	}

}
