package com.daily.assignments;

public class IsPalindrome {
public static void main(String args[]) {
	IsPalindrome is =new IsPalindrome();
	is.initiate("malayalamm");
}

private void initiate(String string) {
	String rev ="";
	for(int i =string.length()-1;i>=0;i--) {
		rev+=string.charAt(i);
	}
	if(string.equals(rev))
		System.out.println("is palindrome");
	else
		System.out.println("is not a palindrome");
}
}