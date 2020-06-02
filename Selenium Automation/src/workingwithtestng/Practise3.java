package workingwithtestng;

import org.testng.annotations.Test;

public class Practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			String buildpath = "http://apps.qaplanet.in/hrm/login.php";
			WebDriver br;
			
		  @Test(enabled=true,priority=1,groups="Login")
		  public void testcase1() { 
			  
				br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
				br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
				br.findElement(By.xpath("//input[@name='Submit']")).click();
				String title = br.getTitle();
				System.out.println(title);
				Assert.assertEquals(br.getTitle(),"OrangeHRM");
				
		  }
		  @Test(enabled=true,priority=2,groups="Login")
		 public void testcase2() {

			
				// Browser commands // Chro path it is an add on tool of chrome browser or
				// firefox browser to inspect web element,it is an option to give x path
			
				br.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
				br.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
				br.findElement(By.xpath("//input[@name='Submit']")).click();
				System.out.println(br.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText());
				Assert.assertEquals(br.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText(), "Logout");
					
			}
		  @BeforeMethod
		  
				public void buildcaseexecution(){
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Documents\\chromedriver.exe");
				 br = new ChromeDriver();
				// Browser commands // Chro path it is an add on tool of chrome browser or
				// firefox browser to inspect web element,it is an option to give x path
				br.get(buildpath);
					
				}
		  @AfterMethod
		  public void afterexecution() {
		  
			  br.close();
			  
		  }
		}


	}

}
