package com.controller;

import java.util.Scanner;

import com.service.ResultService;

public class ResultApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks scored in Maths");
		double marksMaths = sc.nextDouble();
		System.out.println("Enter marks scored in Science");
		double marksScience = sc.nextDouble();
		System.out.println("Enter marks scored in History");
		double marksHistory = sc.nextDouble();
		
		/* call methods from Service */
		ResultService rs = new ResultService();
		double totalMarksScored = rs.computeTotalMarksScored(marksMaths,marksScience,marksHistory);
		double percent = rs.computePercentage(totalMarksScored,300);
		String grade  = rs.computeGrade(percent);
		System.out.println("Your Grade is:  " + grade);
	}
}
