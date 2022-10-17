package com.daily.assignments;

import java.util.Scanner;

public class SecondLargestNumber {
	
	public static void main(String args[]) {
		SecondLargestNumber sLN =new SecondLargestNumber();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number = ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the number = ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the number = ");
		int thirdNumber = scanner.nextInt();
		scanner.close();
		System.out.println("the second largest number is "+sLN.initiate(firstNumber,secondNumber,thirdNumber));
	}

	private int initiate(int firstNumber,int secondNumber ,int thirdNumber) {
	
	if(firstNumber>=secondNumber&&firstNumber<=thirdNumber||firstNumber<=secondNumber&&firstNumber>=thirdNumber) {
		return firstNumber;
	}
	else if(secondNumber>=firstNumber&&secondNumber<=thirdNumber||secondNumber<=firstNumber&&secondNumber>=thirdNumber) {
		return secondNumber;
	}
	return thirdNumber;
	}

}
