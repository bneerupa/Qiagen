package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResultsTest extends BusinessFunctions{
	@Test(priority=3)
	public void checkResults() {
		clickBundle();
		selectCar() ;
		enterSourceandDestination() ;
		enterDates();
		findDeal();
		new FluentWait<WebDriver>(driver)
		  .withTimeout(30, TimeUnit.SECONDS)
		  .pollingEvery(2, TimeUnit.MILLISECONDS)
		  .ignoring(WebDriverException.class)
		  .until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
		int list=resultlist();
		System.out.println("Count :"+list);
		Assert.assertNotEquals(list, 0);
		
	}

	

}
