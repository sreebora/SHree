package collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver.exe");
		WebDriver br = new ChromeDriver();
		// Browser commands // Chro path it is an add on tool of chrome browser or
		// firefox browser to inspect web element,it is an option to give x path
		br.get("https://www.redbus.in/");
		List<WebElement> b  = br.findElements(By.tagName("a")); 
		System.out.println(b.size());
		for(int i=0; i<=b.size();i++ ) 
		{
	
	System.out.println(b.get(i).getText());
	}
		
	}
}
