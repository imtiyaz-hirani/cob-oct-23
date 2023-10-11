package com.controller;

import java.util.Scanner;

import com.service.RailwayService;

public class IfDemo {
	public static void main(String[] args) {  
		RailwayService obj = new RailwayService();
		Scanner sc = new Scanner(System.in);
		
		/* Read age as input from console */
		System.out.println("Enter your age");
		int age = sc.nextInt();
		/* Validate Age */
		if(age >110 || age<0) {
			System.out.println("Invalid Age entered...");
			return;
		}
		/* Call logic methods */
		obj.identifyStatus(age);
		double discount = obj.computeDiscount(age);
		System.out.println("Discount is: " + discount);
		
		String classification = obj.classifyPassengers(age);
		System.out.println("Passenger class " + classification );
		
		obj.allotBerth(classification);
		
		sc.close();
	}
	
}
