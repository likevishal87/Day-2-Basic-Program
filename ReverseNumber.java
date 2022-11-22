package com.bridgelabz.forloop;

import java.util.Scanner;

// Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ReverseNumber {
	static void checkReverse(int number) {
		int reminder, reverse = 0;
		for (; number != 0; number = number / 10) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		checkReverse(num);
	}
}
