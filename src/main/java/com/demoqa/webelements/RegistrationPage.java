/**
 *   File Name: RegistrationPage.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 5, 2018
 *   
 */

package com.demoqa.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * RegistrationPage //ADDD (description of class)
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
public class RegistrationPage extends BasePage {
	
	private By fNameField = By.id("name_3_firstname");
	private By lNameField = By.id("name_3_lastname");
	private By marStatusSingleRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(2)"); 
	private By marStatusMarriedRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(4)"); 
	private By marStatusDivorcedRadioBtn = By.cssSelector("#pie_register > li:nth-child(2) > div > div > input:nth-child(6)"); 
	
	private By hobbyDanceCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(2)");
	private By hobbyReadingCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(4)");
	private By hobbyCricketCheckBox = By.cssSelector("#pie_register > li:nth-child(3) > div > div > input:nth-child(6)");

	int countryDropDownNumber = 1;
	String countryDropDownListString = "#dropdown_7 > option:nth-child(" + countryDropDownNumber + ")";
	private By countryDropDownList = By.cssSelector(countryDropDownListString);

	// DOB
	int dobDayDropDownNumber = 1;
	String dobDayDropDownListString = "#dd_date_8 > option:nth-child(" + dobDayDropDownNumber + ")";
	private By dobDayDropDownList = By.id(dobDayDropDownListString);
	
	int dobMonthDropDownNumber = 1;
	String dobMonthDropDownListString = "#mm_date_8 > option:nth-child(" + dobMonthDropDownNumber + ")";
	private By dobMonthDropDownList = By.id(dobMonthDropDownListString);
	
	int dobYearDropDownNumber = 1;
	String dobYearDropDownListString = "#yy_date_8 > option:nth-child(" + dobYearDropDownNumber + ")";
	private By dobYearDropDownList = By.id("dobYearDropDownListString");
	
	private By phoneField =  By.id("phone_9");
	private By usernameField = By.id("useername");
	private By emailField = By.id("email_1");
	private By profilePictureBtn = By.id("profile_pic_10");
	private By aboutYourselfField = By.id("description");
	private By pwdField = By.id("password_2");
	private By confirmPwdField = By.id("confirm_password_password_2");
	private By submitBtn = By.cssSelector("#pie_register > li:nth-child(14) > div > input[type=\"submit\"]");				
			
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	public void registrationUser(
			String fName,
			String lName,
			String marStatus,
			boolean hobbyDance,
			boolean hobbyReading,
			boolean hobbyCricket,
			String country,
			int dobMonth,
			int dobDay,
			int dobYear,
			String phone,
			String username,
			String email,
			String profilePicture,
			String aboutYourself,
			String pwd) {
		
		// fill out first name
		we = driver.findElement(fNameField);
		we.click();
		we.clear();
		we.sendKeys(fName);
		
		Helper.waiting1000();
		
		// fill out last name
		we = driver.findElement(lNameField);
		we.click();
		we.clear();
		we.sendKeys(lName);

		Helper.waiting1000();

		// choose marital status
		
		char[] marStatusArray = marStatus.toLowerCase().toCharArray();
		char marStatusChar = marStatusArray[0];
		
		switch(marStatusChar) {
			case 's' : {
				// choose Single Radio Button
				we = driver.findElement(marStatusSingleRadioBtn);
				we.click();
				}
			break;

			case 'm' : {
				// choose Married Radio Button
				we = driver.findElement(marStatusMarriedRadioBtn);
				we.click();
				}
			break;
			
			case 'd' : {
				// choose Divorced Radio Button
				we = driver.findElement(marStatusDivorcedRadioBtn);
				we.click();
				}
			break;
		}
		
		Helper.waiting1000();
	
		// choose Hobby check boxes
		
		if(hobbyDance) {
			we = driver.findElement(hobbyDanceCheckBox);
			we.click();
		}
				
		if(hobbyDance) {
			we = driver.findElement(hobbyReadingCheckBox);
			we.click();
		}
		
		if(hobbyDance) {
			we = driver.findElement(hobbyCricketCheckBox);
			we.click();
		}
		
		Helper.waiting1000();

		// choose country
		we = driver.findElement(countryDropDownList);
		Select select = new Select(we);
		select.selectByVisibleText(country);
		
		Helper.waiting1000();

		// choose month
		we = driver.findElement(dobMonthDropDownList);
		Select selectMonth = new Select(we);
		selectMonth.selectByVisibleText(Integer.toString(dobMonth));
//		selectMonth.selectByVisibleText(dobMonth);
		
		Helper.waiting1000();

		// choose day
		we = driver.findElement(dobDayDropDownList);
		Select selectDay = new Select(we);
		selectDay.selectByVisibleText(Integer.toString(dobDay));
		
		Helper.waiting1000();

		// choose year
		we = driver.findElement(dobYearDropDownList);
		Select selectYear = new Select(we);
		selectYear.selectByVisibleText(Integer.toString(dobYear));
		
		Helper.waiting1000();

		
		
		
		
	}
		
		
}
