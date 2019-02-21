package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.HotWireTest;

public class MainPage extends HotWireTest{
	
	public static By bundlelink = By.xpath("//div[contains(text(),'Bundles')]");
	public static By flyFrom=By.id("farefinder-package-origin-location-input");
	public static By flyTo = By.id("farefinder-package-destination-location-input");
	public static By depart=By.id("farefinder-package-startdate-input");
	public static By returndate =By.id("farefinder-package-enddate-input");
	public static By carcheck=By.xpath("//div[@class='hw-btn-check-group hw-default-margin-top']/button[3]");
	public static By departtime = By.id("farefinder-package-pickuptime-input");
	public static By dropofftime = By.id("farefinder-package-dropofftime-input");
	public static By deal = By.id("farefinder-package-search-button");
	public static By listarticles = By.xpath("//article");
	
	
	
}
