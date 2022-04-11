package com.greatlearning.driver;

import java.util.LinkedList;
import java.util.Scanner;

import com.greatlearning.paymoney.service.Transactions;

public class Main_Transactions {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Transactions main = new Transactions();

		System.out.println("Enter the size of the transaction array");
		int transactionArraySize = scanner.nextInt();

		LinkedList<Integer> transactionArray = main.insertValues(scanner, transactionArraySize);
		int noOfTargets = main.getNoOfTargets(scanner);
		main.getTransactions(scanner, transactionArray, noOfTargets);

		scanner.close();

	}

}
