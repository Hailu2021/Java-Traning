package day2;

import java.util.Scanner;

public class Q5Conctnaion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter first number: "); 
		int num1= input.nextInt();
		
		System.out.print("Enter second number"); 
		int num2  = input.nextInt(); 
		System.out.println("sum"+ (num1 + num2)); 
		System.out.println("The difference is: " + (num1 - num2)); 

		input.close();
	}

}
