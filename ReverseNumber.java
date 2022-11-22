package com.bridgelabz.whileloop;

import java.util.Scanner;

//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = scanner.nextInt();

		int reminder, reverse = 0;

		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println(reverse);

	}

}
