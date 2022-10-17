package com.daily.assignments;

import java.util.Scanner;

public class NumericalValue {
public static void main(String args[]) {
	NumericalValue numeric = new NumericalValue();
	Scanner scanner =new Scanner(System.in);
	System.out.print("Enter the word : ");
	String str = scanner.nextLine();
	numeric.initiate(str);
	scanner.close();
}

private void initiate(String str) {
	int sum =0;
	for(int i=0;i<str.length();i++) {
		if('A'<=str.charAt(i)&&str.charAt(i)<='Z') {
			sum+=str.charAt(i)-'A'+1;
		}else
			sum+=str.charAt(i)-'a'+1;
		}
	System.out.println(sum);
	}
}

