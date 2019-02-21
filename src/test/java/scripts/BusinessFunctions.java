/**
 * 
 */
package scripts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.HotWireTest;
import pages.MainPage;
import pages.ResultPage;

/**
 * @author neerupa
 *
 */
public class BusinessFunctions  extends HotWireTest{
	
	public void clickBundle() {
		driver.findElement(MainPage.bundlelink).click();
		
	}
	
	public void selectCar() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//	     wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(carcheck));
		System.out.println(driver.findElement(MainPage.carcheck).isDisplayed());
		driver.findElement(MainPage.carcheck).click();
//		((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", carcheck);
	}
	
	public void enterSourceandDestination() {
		driver.findElement(MainPage.flyFrom).sendKeys("LAX");
		
		driver.findElement(MainPage.flyTo).sendKeys("SFO");
		driver.findElement(MainPage.flyTo).sendKeys(Keys.TAB);
		
	}
public void enterDates() {
		
		Calendar from = Calendar.getInstance();
		from.add(Calendar.DAY_OF_MONTH, 2);
		Calendar to = Calendar.getInstance();
		to.add(Calendar.DAY_OF_MONTH, 20);
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(from.getTime());
		String laterDate = new SimpleDateFormat("MM/dd/yyyy").format(to.getTime());
		
		System.out.println(tommorowsDate);
		System.out.println(laterDate);
		
		driver.findElement(MainPage.depart).sendKeys(tommorowsDate);
		
		driver.findElement(MainPage.returndate).clear();
		driver.findElement(MainPage.returndate).sendKeys(laterDate);
		driver.findElement(MainPage.departtime).sendKeys("Evening");
		driver.findElement(MainPage.dropofftime).sendKeys("Morning");
	}
public void findDeal() {
	driver.findElement(MainPage.deal).click();
//	List<WebElement> results = driver.findElements(listarticles);
//	int i =results.size();
//	System.out.println(i);
}

public static int resultlist() {
	List<WebElement> results = driver.findElements(ResultPage.listarticles);
	return results.size();
	
	
}
	

}
