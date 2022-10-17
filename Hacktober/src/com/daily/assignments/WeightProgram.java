package com.daily.assignments;

import java.util.Scanner;

public class WeightProgram {
public static void main(String args[]) {
	WeightProgram weight = new WeightProgram();
	Scanner scanner  = new Scanner(System.in);
	int ounces = scanner.nextInt();
	scanner.close();
	weight.initate(ounces);
}

private void initate(int ounces) {
	int pound =ounces/16;
	int div = pound*16;
	int ounce =ounces-div;
	System.out.println(pound +" lb "+ounce+" oz");
}
}
