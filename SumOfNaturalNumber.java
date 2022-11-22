package com.bridgelabz.forloop;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumOfNaturalNumber {
	static void checksum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = i + sum;
		}
		System.out.println("Sum of N Natural number: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		checksum(num);
	}
}
