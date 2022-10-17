package com.daily.assignments;

public class GenerateAbcd {
public static void main(String args[]) {
	GenerateAbcd abcd = new GenerateAbcd();
	abcd.start();
}

private void start() {
	
	for(char i='a';i<='z';i++) {
		for(char j=i;j<='z';j++) {
			System.out.print(j);
		}
		for(char k='a';k<i;k++) {
			System.out.print(k);	
		}
		
		System.out.println();
	}
	}
}
