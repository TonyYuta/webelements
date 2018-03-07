/**
 *   File Name: BasePage.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.demoqa.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * BasePage //ADDD (description of class)
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
public class BasePage {
	
	protected WebElement we;
	protected WebDriver driver;
	


	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String currentPageString() {
		return driver.getTitle();
	}
	
	
}
