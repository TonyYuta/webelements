/**
 *   File Name: BaseTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 6, 2018
 *   
 */

package com.demoqa.webelements;

import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * BaseTest //ADDD (description of class)
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
public class BaseTest {
	
	WebDriver driver;
	
	HomePage homePage;
	RegistrationPage registrationPage;
	DraggablePage draggablePage;
	DroppablePage droppablePage;
	ResizablePage resizablePage;
	SelectablePage selectablePage;
	SortablePage sortablePage;
	AccordionPage accordionPage;
	AutocompletePage autocompletePage;
	DatepickerPage datepickerPage;
	MenuPage menuPage;
	SliderPage sliderPage;
	TabsPage tabsPage;
	TooltipPage tooltipPage;
	FramesAndWindowsPage framesAndWindowsPage;
	
	ArrayList<String> al;
	HashSet<String> hs;
	
	@Parameters({ "browser", "appURL", "groups" })
	@BeforeClass(alwaysRun = true)				
	public void initializeTestBaseSetup(String browser, String appURL, String groups) {
		try {
			DriverFactory.setDriver(browser, appURL, groups);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		driver = DriverFactory.getDriver();
		
		homePage = new HomePage(driver);
		registrationPage = new RegistrationPage(driver);
		draggablePage = new DraggablePage(driver);
		droppablePage = new DroppablePage(driver);
		resizablePage = new ResizablePage(driver);
		selectablePage = new SelectablePage(driver);
		sortablePage = new SortablePage(driver);
		accordionPage = new AccordionPage(driver);
		autocompletePage = new AutocompletePage(driver);
		datepickerPage = new DatepickerPage(driver);
		menuPage = new MenuPage(driver);
		sliderPage = new SliderPage(driver);
		tabsPage = new TabsPage(driver);
		tooltipPage = new TooltipPage(driver);
		framesAndWindowsPage = new FramesAndWindowsPage(driver);

	}
	
	@AfterClass(enabled = true, alwaysRun = true)
	public void afterClassTearDown() {
		//driver.close();
		driver.quit();
		}	
	

	
	

}