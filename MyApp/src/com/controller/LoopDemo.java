package com.controller;

public class LoopDemo {

	public static void main(String[] args) {
		/* Display hello 5 times */
		for(int i=1; i<=5; i++) {  //i = 1, 2, 3
			System.out.println("hello");
		}
		int sum = 0;
		
		/* compute sum = 1+2+3+4+5... +10 */
		for(int i=1; i<=10;i++) { //i=1,2,3,4,5,6,7,8,9,10,11(NO)
			sum = sum + i; 
		}
		
		System.out.println(sum);
		
		/* Display even number less than or equal to 10 : 2 4 6 8 10 */
		
		for(int i=1;i<=10;i++) { //i=1,2,3,4...10,11(out of the loop )
			if(i % 2 == 0) {
				System.out.print(i + " "); //2 4 6 8 10
			}
		}
		
		System.out.println("");
		/* While Loop */
		/* Display number from 1 to 5 */
		int j=1; 
		while(j<=5) {
			System.out.print(j + " "); //1 2 3 4 5
			j++;
		}
	}

}



//condition: if true   : if false: come out of the loop  
//body
//increment 
