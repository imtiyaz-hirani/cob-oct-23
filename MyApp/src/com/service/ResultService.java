package com.service;

public class ResultService {

	public double computeTotalMarksScored(double marksMaths, double marksScience, double marksHistory) {
		//add the marks of 3 subjects and return the sum 
		double sum = marksMaths + marksScience + marksHistory;
		return sum;
	}

	public double computePercentage(double totalMarksScored, double totalMarks) {
		// compute percent
		double percent = (totalMarksScored * 100) / totalMarks;
		return percent;
	}

	public String computeGrade(double percent) {  
		// return grade based on percent 
		if(percent >=75) {
			return "A";
		}
		else	
		if(percent >=60) {
			return "B"; 
		}
			
		return "C";
	}

}
