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
		homePage.navigateToRegistrationPage();
	}
}
