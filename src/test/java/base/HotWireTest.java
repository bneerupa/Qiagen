/**
 * 
 */
package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author neerupa
 *
 */
public class HotWireTest {
	
	protected static WebDriver driver;
	@BeforeClass
	  public static void init() {
		// TODO Auto-generated constructor stub
		  System.setProperty("webdriver.chrome.driver", "/Applications/Selenium/chromedriver");
		  driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 //System.out.println("before test");
		 driver.get("https://www.hotwire.com/");
		 //System.out.println("new test");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
	

}
