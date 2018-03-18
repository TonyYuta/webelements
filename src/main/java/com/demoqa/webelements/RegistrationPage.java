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
			int dobDay,
			int dobMonth,
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
		
	//	Helper.waiting1000();
		
		// fill out last name
		we = driver.findElement(lNameField);
		we.click();
		we.clear();
		we.sendKeys(lName);

	//	Helper.waiting1000();

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
		
//		Helper.waiting1000();
	
		// choose Hobby check boxes
		
		if(hobbyDance) {
			we = driver.findElement(hobbyDanceCheckBox);
			we.click();
		}
				
		if(hobbyReading) {
			we = driver.findElement(hobbyReadingCheckBox);
			we.click();
		}
		
		if(hobbyCricket) {
			we = driver.findElement(hobbyCricketCheckBox);
			we.click();
		}
		
		Helper.waiting(1000);

		// choose country
		int countryDropDownNumber = Helper.countryNameToDropDownNumber(country);;
		String countryDropDownListString = "#dropdown_7 > option:nth-child(" + countryDropDownNumber + ")";
		By countryDropDownList = By.cssSelector(countryDropDownListString);		
		we = driver.findElement(countryDropDownList);
		we.click();
				
		Helper.waiting(1000);

		// choose day DOB
		String dobDayDropDownListString = "#dd_date_8 > option:nth-child(" + dobDay + ")";
		By dobDayDropDownList = By.id(dobDayDropDownListString);
		we = driver.findElement(dobDayDropDownList);
		we.click();
		Helper.waiting(1000);
		
		// choose month DOB
		String dobMonthDropDownListString = "#mm_date_8 > option:nth-child(" + dobMonth + ")";
		By dobMonthDropDownList = By.id(dobMonthDropDownListString);
		we = driver.findElement(dobMonthDropDownList);
		we.click();
		Helper.waiting(1000);

		// choose year
		String dobYearDropDownListString = "#yy_date_8 > option:nth-child(" + dobYear + ")";
		By dobYearDropDownList = By.id(dobYearDropDownListString);
		we = driver.findElement(dobYearDropDownList);
		we.click();		
		
		
		Helper.waiting(3000);

		
		
		
		
	}
		
		
}
