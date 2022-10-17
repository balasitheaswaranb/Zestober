package com.daily.assignments;

public class AddFisrtLast {
public static void main(String args[]) {
	AddFisrtLast add =new AddFisrtLast();
	add.start(11444555);
}

private void start(int number) {
	int firstNumber=0,lastNumber=0;
	lastNumber= number%10;
	while(number!=0) {
	firstNumber= number%10;
	number =number/10;
	}
	System.out.println(firstNumber+lastNumber);
	
}
}
