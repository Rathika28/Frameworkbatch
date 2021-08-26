package org.mav;

import org.openqa.selenium.WebElement;

public class Utilisation2 extends BaseClass {

	public static void main(String[] args) {
		launchurl("https://adactinhotelapp.com/");
		
		 WebElement txtUsername = elementLocatorById("username");
		 
		 enterText(txtUsername,"purushoth123");
		 
		 WebElement txtpass = elementLocatorById("password");
		 
		 enterText(txtpass,"2N3WPK");
		 
		 WebElement button = elementLocatorByXpath("//input[@name='login']");
		 
		 btnclick(button);
		 
		 WebElement location = elementLocatorById("location");
		 selectionByIndex(location,2);
		 
		 
		 
		 
		
		
	}

}
