package org.mav;

import org.openqa.selenium.WebElement;

public class Utilisation extends BaseClass {

	public static void main(String[] args) {
		
		launchurl("https://www.facebook.com/");
		
		 WebElement txtUsername = elementLocatorById("email");
		 
		 enterText(txtUsername,"rathikaammu28");
		 
		 WebElement txtpass = elementLocatorById("pass");
		 
		 enterText(txtpass,"ammucseb");
		 
		 WebElement button = elementLocatorByXpath("//button[@name='login']");
		 
		 btnclick(button);
		 
		 
		 
		 
		
	}

}