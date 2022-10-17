package com.daily.assignments;

import java.util.Scanner;

public class LeapYear {
	Scanner scanner = new Scanner(System.in);
	public static void main (String args[]) {
		LeapYear year = new LeapYear();
		year.initiate();
	}

	private void initiate() {
		System.out.println("Enter the year: ");
		int input = scanner.nextInt();
		if(input%4==0 ) {
			if(input%100==0) {
				if(input%400==0) {
					System.out.println("this year is leap year");
				}
			}else
				System.out.println("this year is leap year");
		}else
			System.out.println("this is not leap year");
	}

}
