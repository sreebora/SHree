import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get("http://apps.qaplanet.in/hrm/login.php");
		br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		br.findElement(By.xpath("//input[@name='Submit']")).click();
		/*
		 * String ad = br.switchTo().alert().getText(); System.out.println(ad); 
		 */
		/*
		 * TargetLocator qe = br.switchTo(); Alert qw = qe.alert(); String qr =
		 * qw.getText(); System.out.println(qr);
		 */
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
	

}
