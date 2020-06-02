package BrowserCommands;

import org.openqa.selenium.WebDriver;

public class BasicCommandsbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver bo = new Firefoxdriver(); 
 String c = bo.get("Shree");
String a = bo.getCurrentUrl();
String b = bo.getTitle();

	}

}
