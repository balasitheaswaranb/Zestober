package com.daily.assignments;

import java.util.Scanner;

public class TriangleSum {
	Scanner scanner = new Scanner(System.in);
public static void main(String args[]) {
	TriangleSum sum =new TriangleSum();
	sum.initiate();
}

private void initiate() {
	System.out.println("enter first number :");
	int number1 = scanner.nextInt();
	System.out.println("enter second number :");
	int number2 = scanner.nextInt();
	System.out.println("enter third number :");
	int number3 = scanner.nextInt();
	int target =180;
	if(number1+number2+number3==target) {
		System.out.println("true");
	}else
	System.out.println("false");
}
}
