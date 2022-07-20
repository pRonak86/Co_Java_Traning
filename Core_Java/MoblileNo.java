package com.test;

import java.util.Scanner;
class PhoneNo
{
	Scanner scan=new Scanner(System.in);
	String no,arrOfStr[];
	void get()
	{
		System.out.println("Enter mobile no. in \"+91-AA-BBB-CCCCC\" format: ");
		no=scan.next();
		arrOfStr=no.split("-",4);
	}
	void show()
	{
		System.out.println("\nThe mobile number is +"+no);
		System.out.println("Mobile system operator code = "+arrOfStr[1]);
		System.out.println("\nMobile switching code= "+arrOfStr[2]);
		System.out.println("\nSubscriber's unique last 5 digits= "+arrOfStr[3]);
	}
}
public class MoblileNo 
{
	public static void main(String []args)
	{
		PhoneNo obj=new PhoneNo();
		obj.get();
		obj.show();
	}
}

