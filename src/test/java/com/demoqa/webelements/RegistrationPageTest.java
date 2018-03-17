/**
 *   File Name: RegistrationPageTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Mar 16, 2018
 *   
 */

package com.demoqa.webelements;

import org.testng.annotations.Test;

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
		String marStatus = "Single";
		boolean hobbyDance = true; 
		boolean hobbyReading = true; 
		boolean hobbyCricket = false; 
		String country = "USA";
		int dobMonth = 1;
		int dobDay = 1;
		int dobYear = 2000;
		String phone = "543-776-1234";
		String username = "Me";
		String email = "meme@gmail.com";
		String profilePicture = "";
		String aboutYourself = "Me means Me"; 
		String pwd = "pwdmeme";
		
	
		homePage.navigateToRegistrationPage();
		registrationPage.registrationUser(fName, lName, marStatus, hobbyDance, hobbyReading, hobbyCricket, country, dobMonth, dobDay, dobYear, phone, username, email, profilePicture, aboutYourself, pwd);
	}
}