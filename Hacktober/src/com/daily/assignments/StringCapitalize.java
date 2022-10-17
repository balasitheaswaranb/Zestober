package com.daily.assignments;

import java.util.Scanner;

public class StringCapitalize {
	Scanner scanner = new Scanner(System.in);
public static void main(String args[]) {
	StringCapitalize sC=new StringCapitalize();
	sC.initiate();
}
public void initiate() {
	String name =scanner.nextLine();
	String []spiltName =name.split(" ");
	for(int i =0;i<spiltName.length;i++) {
	String s1=	spiltName[i].substring(0,1).toUpperCase();
	String s2=	spiltName[i].substring(1).toLowerCase();
		System.out.print(s1+s2+" ");
	}
}

}

