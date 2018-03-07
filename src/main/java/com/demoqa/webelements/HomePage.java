/**
 *   File Name: HomePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.demoqa.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * HomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private static String homePageUrl = "http://demoqa.com/";
	
	private By registrationBtn 		= By.cssSelector("#menu-item-374 > a");
	private By draggableBtn 			= By.cssSelector("#menu-item-140 > a");
	private By droppableBtn 			= By.cssSelector("#menu-item-141 > a");
	private By resizableBtn 			= By.cssSelector("#menu-item-143 > a");
	private By selectableBtn 		= By.cssSelector("#menu-item-142 > a");
	private By sortableBtn 			= By.cssSelector("#menu-item-151 > a");
	private By accordionBtn 			= By.cssSelector("#menu-item-141 > a");
	private By autocompleteBtn 		= By.cssSelector("#menu-item-145 > a");
	private By datepickerBtn 		= By.cssSelector("#menu-item-146 > a");
	private By menuBtn 				= By.cssSelector("#menu-item-147");
	private By sliderBtn 			= By.cssSelector("#menu-item-97");
	private By tabsBtn 				= By.cssSelector("#menu-item-98");
	private By tooltipBtn 			= By.cssSelector("#menu-item-99");
	private By framesAndWindowsBtn 	= By.cssSelector("#menu-item-148");
	
	public HomePage navigateToHomePage() {
		driver.navigate().to(homePageUrl);
		return new HomePage(driver);
	}
	
	public void navigateToRegistrationPage() {
		we = driver.findElement(registrationBtn);
		return new RegistrationPage(driver);
	}
	
	
}
