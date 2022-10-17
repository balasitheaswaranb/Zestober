package com.daily.assignments;

import java.util.Scanner;

public class StringLength {
public static void main (String args[]) {
	StringLength string = new StringLength();
	Scanner scanner = new Scanner(System.in);
	String str = scanner.next();
	scanner.close();
	string.initiate(str);
}

private void initiate(String str) {
	for(int i =0;i<str.length();i++) {
		System.out.print("->");
		for(int j= 0;j<=i;j++) {
			System.out.print(str.charAt(j));
		}
	}
}
}
