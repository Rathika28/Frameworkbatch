package org.mav;

import java.io.IOException;

public class Utilisation3 extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchurl("https://adactinhotelapp.com/");
		enterText(elementLocatorById("username"), excelRead("D:\\GREENS2\\TRAINNING\\Practice2.xlsx", "abcd", 0, 0));
		enterText(elementLocatorById("password"),excelRead("D:\\\\GREENS2\\\\TRAINNING\\\\Practice2.xlsx", "abcd", 0, 1));
		btnclick(elementLocatorById("login"));
		selectionByIndex(elementLocatorById("location"), Integer.parseInt(excelRead("D:\\\\GREENS2\\\\TRAINNING\\\\Practice2.xlsx" , "abcd", 0, 2)));
	}

}
