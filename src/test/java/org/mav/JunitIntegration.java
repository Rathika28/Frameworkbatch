package org.mav;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.interactions.SourceType;

public class JunitIntegration extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch() {
		launchurl("https://adactinhotelapp.com/");
	}
	
	@Test
	public void test() throws IOException {
		System.out.println(title());
		Assert.assertEquals(true, title().contains("Adactin"));
		System.out.println("User is in LoginPage");
		AdactinLoginPage a=new AdactinLoginPage();
		
		enterText(a.getUsername(), excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 0));
		enterText(a.getPassword(),excelRead("D:\\\\GREENS2\\\\TRAINNING\\\\Practice2.xlsx", "abcd", 0, 1));
		btnclick(a.getLogin());
		
		Assert.assertEquals(true, title().contains("Adactin"));
		System.out.println("User in Home Page");
	}
	
	@Before
	public void verify() {
		Date d=new Date();
		System.out.println(d);
		}
	
	@After
	public void verifyAfterLogin() {
		Date d1=new Date();
		System.out.println(d1);
	}
	
	@AfterClass
	public static void CloseDriver() {
		driver.quit();
			
	}
	@Test
	public void test1() throws InterruptedException, NumberFormatException, IOException {
		Thread.sleep(3000);
		AdactinLocationPage a=new AdactinLocationPage();
		selectionByIndex(a.getLocation(),Integer.parseInt(excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 2)));
	}

	
	

}
