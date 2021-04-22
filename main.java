package com.vibin;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	logIn();
	int choice=checkChoice();
	int km=checkKm();
	int priceForKm=reuse.priceEstimater(choice,km);
	double priceWithGst=reuse.gst(priceForKm);
	checkDate();
	System.out.print("Enter the journey time(HH-MM-SS)=");
	String journeyTime=sc.next();
	boolean peakTime=reuse.checkPeakTime(journeyTime);
	if(peakTime==true)
	{
	double peakGstPrice=reuse.peakPrice(priceWithGst);
	}
	boolean seniorCitizen=dOB();
	if(seniorCitizen==true) {
	double seniorCitizenPrice=reuse.seniorCitizenPrice(priceWithGst);
	double peakGstPrice=reuse.peakPrice(priceWithGst);
	double seniorCitizenPriceDuringPeak=peakGstPrice/2;
	if(seniorCitizen==true && peakTime==true) {
		System.out.println("The amount is= "+seniorCitizenPriceDuringPeak+"Rs");
	}
	else if(seniorCitizen==true && peakTime==false) {
		System.out.println("The amount is= "+seniorCitizenPrice+"Rs");
	}
	}
	double peakGstPrice=reuse.peakPrice(priceWithGst);
	if(seniorCitizen==false && peakTime==true) {
		System.out.println("The amount is= "+peakGstPrice+"Rs");
	}
	if(seniorCitizen==false && peakTime==false) {
		System.out.println("The amount is= "+priceWithGst+"Rs");
	}
}
public static void logIn() {
	System.out.print("Enter the mobile number(10 digit)=");
	long mobileNumber=sc.nextLong();
	System.out.print("Enter the password=");
	String passWord=sc.next();
	boolean logIn=reuse.checkLogIn(mobileNumber, passWord);
	if(logIn==true) {
		System.out.println("Valid user");
	}
	else if(logIn==false){
		System.out.println("Inalid user");
		logIn();
	}
}
public static int checkChoice() {
	System.out.println("CAB TYPES:\n1.MINI(10rs/km)\n2.MICRO(15rs/km)\n3.PREMIUM(20rs/km)");
	System.out.print("Enter your choice=");
	int choice=sc.nextInt();
	 if(choice>3 || choice<=0) {
		System.out.println("Invalid choice");
		return checkChoice();
	}
	return choice;
}
public static int checkKm() {
	System.out.print("Enter the kilo meter=");
	int km=sc.nextInt();
	if(km<=0) {
		System.out.println("Invalid kilometer");
		return checkKm();
	}return km;
}
public static void checkDate() {
	System.out.print("Enter the journey date(YYYY-MM-DD)=");
	String journeyDate=sc.next();
	boolean checkDate=reuse.checkDate(journeyDate);
	if(checkDate==false) {
		System.out.println("Invalid journey date");
		checkDate();
	}
}
public static boolean dOB() {
	System.out.print("Enter the DOB(YYYY-MM-DD)=");
	String DOB=sc.next();
	boolean dOB=reuse.checkDOB(DOB);
	if(dOB==false) {
		System.out.println("Invalid DOB");
		return dOB();
	}
	else if(dOB==true) {
		boolean seniorCitizen=reuse.checkSeniorCitizen(DOB);
		if(seniorCitizen==true) {
			return true;
		}
	}return false;
}
}