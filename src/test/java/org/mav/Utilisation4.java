package org.mav;

import java.io.IOException;

public class Utilisation4 extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchurl("https://adactinhotelapp.com/");
		AdactinLoginPage a=new AdactinLoginPage();
		enterText(a.getUsername(), excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 0));
		enterText(a.getPassword(),excelRead("D:\\\\GREENS2\\\\TRAINNING\\\\Practice2.xlsx", "abcd", 0, 1));
		btnclick(a.getLogin());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
