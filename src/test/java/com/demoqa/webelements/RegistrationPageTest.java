/**
 *   File Name: RegistrationPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 16, 2018
 *   
 */

package com.demoqa.webelements;

import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * RegistrationPageTest //ADDD (description of class)
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
public class RegistrationPageTest extends BaseTest {
	
	@Test(enabled = true, groups = {"RegistrationPage",  "bat", "regression", "all"}, priority = 0)
	public void testRegistrationUser() {
		
		String fName = "Bil";
		String lName = "Moi";
		String marStatus = "Divorced";
		boolean hobbyDance = false; 
		boolean hobbyReading = true; 
		boolean hobbyCricket = false; 
		String country = "Russia";
		int dobDay = 1;
		int dobMonth = 1;
		int dobYear = 2000;
		String phone = "5437761234";
		String username = "Me";
		String email = "meme@gmail.com";
		String profilePicture = "";
		String aboutYourself = "Me means Me"; 
		String pwd = "^f_*1a/+#X,m";	
		String expected = "Thank you for your registration";
		
		homePage.navigateToRegistrationPage();
		String actual = 	registrationPage.registrationUser(fName, lName, marStatus, hobbyDance, hobbyReading, hobbyCricket, country, dobDay, dobMonth, dobYear, phone, username, email, profilePicture, aboutYourself, pwd);

		Assert.assertEquals(expected, actual, "registaratio was unsuccessfull");

		
		
	}
}
