package com.service;

public class RailwayService {
	public void allotBerth(String classification) {
		switch(classification) {
			case "CHILD":
				System.out.println("LB"); 
				break; 
			case "ADULT":
				System.out.println("UB,MB");
				break; 
			case "MIDDLE_AGE":
				System.out.println("SL, SU, LB");
				break;
			case "SENIOR":
				System.out.println("LB"); 
				break;
			default: 
				System.out.println("Invalid class..."); 
				break;
		}
	}
	
	public String classifyPassengers(int age){
		if(age>=0 && age<=12) {
			return "CHILD";
		}
		if(age>12 && age<=40) {
			return "ADULT";
		}
		if(age>40 && age<60) {
			return "MIDDLE_AGE";
		}
		
		return "SENIOR";
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
