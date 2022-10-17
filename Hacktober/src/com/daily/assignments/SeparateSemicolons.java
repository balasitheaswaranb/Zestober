package com.daily.assignments;

import java.util.Scanner;

public class SeparateSemicolons {
	public static void main(String args[]) {
	SeparateSemicolons separate =new SeparateSemicolons();
	Scanner scanner =new Scanner(System.in);
	String value =  scanner.nextLine();
	separate.start(value);
	scanner.close();
	}

	private void start(String value) {
		String[]stringArray = value.split(";");
		int sumValue=0;
		for(int i = 0;i<stringArray.length;i++) {
			sumValue+=Integer.parseInt(stringArray[i]);
		}
		System.out.println(sumValue);
		
	}
}
