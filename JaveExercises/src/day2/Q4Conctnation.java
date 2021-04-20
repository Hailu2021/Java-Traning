package day2;

import java.util.Scanner;

public class Q4Conctnation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your age: "); 
		int age = input.nextInt(); 
		
		if (age<18) { 
		System.out.println("you are not eligible to vote"); 
		} 
		else if(age > 18 && age < 80) 
			System.out.println("you are eligible to vote"); 
	
	
		else {
			System.out.println("You are too old to vote");
		
			
			
			input.close();
		}

	}

}
