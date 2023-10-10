package com.controller;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		IfDemo obj = new IfDemo();
		Scanner sc = new Scanner(System.in);
		
		/* Read age as input from console */
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		/* Call logic methods */
		obj.identifyStatus(age);
		double discount = obj.computeDiscount(age);
		System.out.println("Discount is: " + discount);
	}
	
	public void identifyStatus(int age){
		if(age >= 60) {
			System.out.println("Senior citizen");
		}
		else {
			System.out.println("not senior");
		}
	}
	
	public double computeDiscount(int age){
		if(age>=60) {
			return 5.0; 
		}
			
		return 0; 
	}
}
