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
	
	public RegistrationPage navigateToRegistrationPage() {
		we = driver.findElement(registrationBtn);
		we.click();
		return new RegistrationPage(driver);
	}
	
	public DraggablePage navigateToDraggablePage() {
		we = driver.findElement(draggableBtn);
		we.click();
		return new DraggablePage(driver);
	}
	
	public DroppablePage navigateToDroppablePage() {
		we = driver.findElement(droppableBtn);
		we.click();
		return new DroppablePage(driver);
	}
	
	public ResizablePage navigateToResizablePage() {
		we = driver.findElement(resizableBtn);
		we.click();
		return new ResizablePage(driver);
	}
	
	public SelectablePage navigateToSelectablePage() {
		we = driver.findElement(selectableBtn);
		we.click();
		return new SelectablePage(driver);
	}
	
	public SortablePage navigateToSortablePage() {
		we = driver.findElement(sortableBtn);
		we.click();
		return new SortablePage(driver);
	}
	
	public AccordionPage navigateToAccordionPage() {
		we = driver.findElement(accordionBtn);
		we.click();
		return new AccordionPage(driver);
	}
	
	public AutocompletePage navigateToAutocompletePage() {
		we = driver.findElement(autocompleteBtn);
		we.click();
		return new AutocompletePage(driver);
	}
	
	public DatepickerPage navigateToDatepickerPage() {
		we = driver.findElement(datepickerBtn);
		we.click();
		return new DatepickerPage(driver);
	}
	
	public MenuPage navigateToMenuPage() {
		we = driver.findElement(menuBtn);
		we.click();
		return new MenuPage(driver);
	}
	
	public SliderPage navigateToSliderPage() {
		we = driver.findElement(sliderBtn);
		we.click();
		return new SliderPage(driver);
	}
	
	public TabsPage navigateToTabsPage() {
		we = driver.findElement(tabsBtn);
		we.click();
		return new TabsPage(driver);
	}
	
	public TooltipPage navigateToTooltipPage() {
		we = driver.findElement(tooltipBtn);
		we.click();
		return new TooltipPage(driver);
	}
	
	public FramesAndWindowsPage navigateToFramesAndWindowsPage() {
		we = driver.findElement(framesAndWindowsBtn);
		we.click();
		return new FramesAndWindowsPage(driver);
	}
}
