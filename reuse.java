package com.vibin;
import java.time.LocalDate;
import java.time.LocalTime;
public class reuse {
	public static boolean checkLogIn(long mobileNumber,String passWord) {
	long mobileNumber1=9659644868L;
	String passWord1="vibin";
	if(mobileNumber1==mobileNumber) {
		if(passWord.equals(passWord1)) {
			return true;
		}
	}return false;
}
	public static int priceEstimater(int choice,int km) {
		int priceEstimation=0;
		switch(choice) {
		case 1:
			int price1=10;
			int priceEstimation1=price1*km;
			return priceEstimation1;

		case 2:
			int price2=15;
			int priceEstimation2=price2*km;
			return priceEstimation2;
		
		case 3:
			int price3=20;
			int priceEstimation3=price3*km;
			return priceEstimation3;
		}return priceEstimation;
	}
	public static double gst(int price) {
		int gst=7;
		double priceGst=((double)gst/100*price)+price;
		return priceGst;
	}
	public static boolean checkDate(String date) {
		LocalDate journeyDate=LocalDate.parse(date);
		LocalDate currentDate=LocalDate.now();
		if(journeyDate.isAfter(currentDate)) {
				return true;
			}return false;
}
	public static boolean checkPeakTime(String time) {
		LocalTime journeyTime=LocalTime.parse(time);
		int hour=journeyTime.getHour();
		if(hour>=17 && hour<=19) {
			return true;
		}return false;
	}
	public static double peakPrice(double priceGst) {
		double peakGst=1.25;
		double peakGstPrice=(1.25/100*priceGst)+priceGst;
		return peakGstPrice;
	}	
	public static boolean checkDOB(String dOB) {
		LocalDate DOB =LocalDate.parse(dOB);
		LocalDate currentDate=LocalDate.now();
		if(DOB.isBefore(currentDate)) {
				return true;
			}return false;
	}
	
	public static boolean checkSeniorCitizen(String date) {
		LocalDate dob=LocalDate.parse(date);
		int dobYear=dob.getYear();
		LocalDate now=LocalDate.now();
		int nowYear=now.getYear();
		int age=nowYear-dobYear;
		if(age>=60) {
			return true;
		}
		return false;
	}
	public static double seniorCitizenPrice(double price) {
	double seniorCitizenPrice=price/2;
	return seniorCitizenPrice;
	}
}