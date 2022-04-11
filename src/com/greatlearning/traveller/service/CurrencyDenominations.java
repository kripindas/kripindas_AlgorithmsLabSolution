package com.greatlearning.traveller.service;

import java.util.Scanner;

public class CurrencyDenominations {

	static int[] noteCount;

	public int[] addValuesToArray(Scanner scanner, int currencyDenominationSize, int[] currencyDenominations) {
		currencyDenominations = new int[currencyDenominationSize];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < currencyDenominationSize; i++) {
			currencyDenominations[i] = scanner.nextInt();
		}
		return currencyDenominations;
	}

	public void printArray(int array[]) {
		int size = array.length;
		for (int i = 0; i < size; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public void denominationsForAmount(Scanner scanner, int currencyDenominationSize, int[] currencyDenominationsArray,
			int amountToPay) {
		System.out.println("Enter the amount you want to pay");
		amountToPay = scanner.nextInt();
		int amount = amountToPay;
		noteCount = new int[currencyDenominationSize];
		for (int i = currencyDenominationsArray.length - 1; i >= 0; i--) {
			int count = amountToPay / currencyDenominationsArray[i];
			noteCount[i] = count;
			amountToPay = amountToPay - currencyDenominationsArray[i] * count;
		}

		System.out.println("Your payment approach in order to give min no of notes will be,");
		int sum = 0;
		for (int i = noteCount.length - 1; i >= 0; i--) {
			if (noteCount[i] > 0) {
				System.out.println(currencyDenominationsArray[i] + ":" + noteCount[i]);
				sum += currencyDenominationsArray[i] * noteCount[i];
			}
		}

		if (sum != amount) {
			if (sum > amount) {
				int balance = sum - amount;
				System.out.println("Balance to be given : " + balance);
			} else {
				int balance = amount - sum;
				System.out.println("Currency denomination combination has a reduction of : " + balance);
			}

		}

	}

}
