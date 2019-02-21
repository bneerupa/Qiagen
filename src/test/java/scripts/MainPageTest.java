package scripts;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.ResultPage;

public class MainPageTest  extends BusinessFunctions{
	
	
	
	@Test(priority=1)
	public void selectBundleTest() {
		 clickBundle();
	}
	
	@Test(priority=2)
	public void findDeals() {
		selectCar() ;
		enterSourceandDestination() ;
		enterDates();
		findDeal();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
	
	

}
