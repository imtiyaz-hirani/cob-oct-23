package com.controller;

import java.util.Scanner;

public class BankKiosk {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 /* Take name as input from user/console */
		 System.out.println("Enter your name");
		 String name = sc.next();
		 
		 System.out.println("welcome " + name);
		 
		 while(true) {
			 System.out.println("**********Services**************");
			 System.out.println("1. Info about New Account ");
			 System.out.println("2. Info about FD & RD");
			 System.out.println("3. Info about Mutual Funds and SIPs");
			 System.out.println("4. Register complaint");
			 System.out.println("0. Exit");
			 System.out.println("********************************");
			 int input = sc.nextInt();
			 if(input == 0) {
				 System.out.println("Thank you " + name);
				 System.out.println("Have a nice day");
				 break; //come out of the while loop 
			 }
			 switch(input) {
			 case 1: 
				 //do something
				 while(true) {
					 System.out.println("***Info about New Account***");
					 System.out.println("1. Info about Savings");
					 System.out.println("2. Info about Current");
					 System.out.println("0. go back to Services menu");
					 System.out.println("****************************");
					 int in1 = sc.nextInt();
					 if(in1 == 0) {
						 break; 
					 }
					 switch(in1) {
					 case 1:
						 System.out.println("Saving ROI is 6% pa");
						 break; 
					 case 2: 
						 System.out.println("Current ROI is 0% pa");
						 break;
					 default: 
						 System.out.println("Invalid optional selected..");
						 break; 
					 }
				 }
				 
				 break; 
			 case 2: 
				 //do something
				 System.out.println("Info about FD & RD\"");
				 break; 
			 case 3: 
				 //do something
				 System.out.println("Info about Mutual Funds and SIPs");
				 break; 
			 case 4: 
				 //do something
				 System.out.println("Register complaint");
				 break; 
			 default: 
				//do something
				 System.out.println("Invalid Input");
				 break;  
			 }
		 }
		 
		 sc.close();
	}

}
