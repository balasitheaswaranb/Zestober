package com.daily.assignments;

import java.util.Scanner;

public class StringPattern {
	public static void main(String args[]) {
		StringPattern pattern = new StringPattern();
		Scanner scanner =new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		pattern.initiate(str);
	}

	private void initiate(String str) {
		int mid = str.length() / 2;
		for (int i =0; i<mid; i++) {
			for (int j = i; j <= mid; j++) {
				System.out.print(str.charAt(i));
			}
		}
		for (int i = mid; i <str.length(); i++) {
			for (int j = mid; j<=i ; j++) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
