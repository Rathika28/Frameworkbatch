package org.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFb {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		WebElement username = l.getUsername();
		username.sendKeys("rathikaammu");
		WebElement password = l.getPassword();
		password.sendKeys("1234");
		
		driver.navigate().refresh();
		
		WebElement username2 = l.getUsername();
		username2.sendKeys("rathikaammu");
		
		WebElement password2 = l.getPassword();
		password2.sendKeys("1234");
		
		
	}

}
