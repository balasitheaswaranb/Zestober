package com.daily.assignments;

public class ReverseNumber {
public static void main(String args[]) {
	ReverseNumber reverse = new ReverseNumber();
	reverse.start(12345);
}

private void start(int number) {
	
	do {
		int reverse = 0;
		reverse=number%10;
		number/=10;
		System.out.print(reverse);
	}while(number!=0);
}
}
