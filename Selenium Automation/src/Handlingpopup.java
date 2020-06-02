import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		br.get("http://apps.qaplanet.in/hrm/login.php");

		By useridl = By.xpath("//input[@name='txtUserName']");
		WebElement text = br.findElement(useridl);
		text.sendKeys("");
		Thread.sleep(3000);

		By passwordl = By.xpath("//input[@name='txtPassword']");
		WebElement pass = br.findElement(passwordl);
		pass.sendKeys("");
		Thread.sleep(3000);

		By login = By.xpath("//input[@name='Submit']");
		WebElement ty = br.findElement(login);
		ty.click();
		Thread.sleep(3000);

		// String popup = br.switchTo().alert().getText();
		// System.out.println(popup);
		// br.switchTo().alert().accept();

		TargetLocator target = br.switchTo();
		Alert alert1 = target.alert();
		String alert2 = alert1.getText();
		System.out.println(alert2);
		alert1.accept();
		br.close();
		

	}

}
