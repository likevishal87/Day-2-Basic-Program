package com.bridgelabz.whileloop;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();
		int i = 1, sum = 0;

		while (i <= number) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
