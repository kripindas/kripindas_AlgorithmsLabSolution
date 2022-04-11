package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.traveller.service.BubbleSort;
import com.greatlearning.traveller.service.CurrencyDenominations;

public class Main_CurrencyDenominations {

	private static Scanner scanner = new Scanner(System.in);
	private static int currencyDenominationSize;
	private static int[] currencyDenominationsArray;
	private static int amountToPay;

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		CurrencyDenominations currencyDenominationsObj = new CurrencyDenominations();

		System.out.println("Enter the size of currency denominations");
		currencyDenominationSize = scanner.nextInt();

		currencyDenominationsArray = currencyDenominationsObj.addValuesToArray(scanner, currencyDenominationSize,
				currencyDenominationsArray);

		bubbleSort.sort(currencyDenominationsArray);
		currencyDenominationsObj.printArray(currencyDenominationsArray);

		currencyDenominationsObj.denominationsForAmount(scanner, currencyDenominationSize, currencyDenominationsArray,
				amountToPay);

		scanner.close();
	}

}
