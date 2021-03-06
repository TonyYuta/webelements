/**
 *   File Name: HomePageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.demoqa.webelements;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * HomePageTest 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class HomePageTest extends BaseTest {
	
	@Test(enabled = true, groups = {"Homepage",  "bat", "regression", "all"}, priority = 0)
	public void testNavigateToHomePage() {
		String expected = "Demoqa | Just another WordPress site";
		homePage.navigateToHomePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "RegistrationPage",  "regression", "all"}, priority = 0)
	public void testNavigateToRegistrationPage() {
		String expected = "Registration | Demoqa";
		homePage.navigateToRegistrationPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "DraggablePage",  "regression", "all"}, priority = 0)
	public void testNavigateToDraggablePage() {
		String expected = "Draggable | Demoqa";
		homePage.navigateToDraggablePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "DroppablePage",  "regression", "all"}, priority = 0)
	public void testNavigateToDroppablePage() {
		String expected = "Droppable | Demoqa";
		homePage.navigateToDroppablePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "ResizablePage",  "regression", "all"}, priority = 0)
	public void testNavigateToResizablePage() {
		String expected = "Resizable | Demoqa";
		homePage.navigateToResizablePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "SelectablePage",  "regression", "all"}, priority = 0)
	public void testNavigateToSelectablePage() {
		String expected = "Selectable | Demoqa";
		homePage.navigateToSelectablePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "SortablePage",  "regression", "all"}, priority = 0)
	public void testNavigateToSortablePage() {
		String expected = "Sortable | Demoqa";
		homePage.navigateToSortablePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
		
	@Test(enabled = true, groups = {"Homepage", "AccordionPage",  "regression", "all"}, priority = 0)
	public void testNavigateToAccordionPage() {
		String expected = "Accordion | Demoqa";
		homePage.navigateToAccordionPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "AutocompletePage",  "regression", "all"}, priority = 0)
	public void testNavigateToAutocompletePage() {
		String expected = "Autocomplete | Demoqa";
		homePage.navigateToAutocompletePage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "DatepickerPage",  "regression", "all"}, priority = 0)
	public void testNavigateToDatepickerPage() {
		String expected = "Datepicker | Demoqa";
		homePage.navigateToDatepickerPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "MenuPage",  "regression", "all"}, priority = 0)
	public void testNavigateToMenuPage() {
		String expected = "Menu | Demoqa";
		homePage.navigateToMenuPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "SliderPage",  "regression", "all"}, priority = 0)
	public void testNavigateToSliderPage() {
		String expected = "Slider | Demoqa";
		homePage.navigateToSliderPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "TabsPage",  "regression", "all"}, priority = 0)
	public void testNavigateToTabsPage() {
		String expected = "Tabs | Demoqa";
		homePage.navigateToTabsPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "TooltipPage",  "regression", "all"}, priority = 0)
	public void testNavigateToTooltipPage() {
		String expected = "Tooltip | Demoqa";
		homePage.navigateToTooltipPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
	@Test(enabled = true, groups = {"Homepage", "FramesAndWindowsPage",  "regression", "all"}, priority = 0)
	public void testNavigateToFramesAndWindowsPage() {
		String expected = "Frames and windows | Demoqa";
		homePage.navigateToFramesAndWindowsPage();
		Assert.assertEquals(homePage.currentPageTitle(), expected, "URI doesn't match to Home page");
	}
	
}
