package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demofb {
	public static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		loginPage l=new loginPage();
		
		WebElement username = l.getUsername();
		username.sendKeys("rathikaammu28");
		
		WebElement password = l.getPassword();
		password.sendKeys("ammucseb");
		
		WebElement login = l.getLogin();
		login.click();
		
	}

}
