package com.dhanraj.utility;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeUtility {

	
	// date to String
	public static String dateToString(Date d) {
		String dat = d.toString();
		return dat;
		
	}
	
	// string to date
	public  static Date stringToDate(String str) {
		Date d = new Date();
	//	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
		 d = new SimpleDateFormat("dd-MM-yyyy").parse(str);
		
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	//TODO: 2 kinds date formats
}
