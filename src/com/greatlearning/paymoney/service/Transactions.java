package com.greatlearning.paymoney.service;

import java.util.LinkedList;
import java.util.Scanner;

public class Transactions {

//	static Scanner scanner = new Scanner(System.in);
	static LinkedList<Integer> transactionArray = new LinkedList<>();
	static int noOfTargets;

	public LinkedList<Integer> insertValues(Scanner scanner, int transactionArraySize) {
		System.out.println("Enter the values of the array");
		for (int i = 0; i < transactionArraySize; i++) {
			transactionArray.add(scanner.nextInt());
		}
		return transactionArray;
	}

	public int getNoOfTargets(Scanner scanner) {
		System.out.println("Enter the total no of targets that needs to be achieved");
		noOfTargets = scanner.nextInt();
		System.out.println("No of targets : " + noOfTargets);
		return noOfTargets;
	}

	public void getTransactions(Scanner scanner, LinkedList<Integer> transactionArray, int noOfTargets) {
		for (int i = 0; i < noOfTargets; i++) {
			int transactions = 0;
			int sum = 0;
			boolean isFound = false;
			System.out.println("Enter the value of target");
			int targetValue = scanner.nextInt();
			for (int j = 0; j < transactionArray.size(); j++) {
				transactions++;
				sum += transactionArray.get(j);
				if (targetValue <= sum && !isFound) {
					isFound = true;
					System.out.println("Target achieved after " + transactions + " transactions");
					break;
				}
			}
			if (!isFound) {
				System.out.println("Given target not achieved");
			}
		}
	}

}
