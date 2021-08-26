package org.mav;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocationPage extends BaseClass {

			public  AdactinLocationPage() {
				PageFactory.initElements(driver, this);
				
			}
			@FindBy(id="pass")
			private WebElement password;
			
			@FindBy(id="login")
			private WebElement login;
			
		    @FindBy(id="location")
		    private WebElement location;

			public WebElement getPassword() {
				return password;
			}

			public WebElement getLogin() {
				return login;
			}

			public WebElement getLocation() {
				return location;
			}

			
	        }



