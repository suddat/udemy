package com.udemy.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RoughWork {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<>();

		listOfStudent.add(new Student(134, "juju", 10));
		listOfStudent.add(new Student(214, "puju", 18));
		listOfStudent.add(new Student(231, "kalu", 29));
		listOfStudent.add(new Student(123, "babu", 92));
		listOfStudent.add(new Student(211, "gudu", 1));
		listOfStudent.add(new Student(221, "bhuru", 28));

		Collections.sort(listOfStudent, Student.StudentRollNo);
		
		for(Student std : listOfStudent) {
			System.out.println(std);
		}

	}

	public static List<Integer> getResult(List<Integer> grades) {
		int org, div, rem, round, diff;
		List<Integer> result = new ArrayList<>();
		for (Integer i : grades) {
			org = i;
			div = org / 5;
			rem = org % 5;
			round = (div + 1) * 5;
			diff = round - org;
			if (diff < 3 && round >= 40) {
				result.add(round);
			} else {
				result.add(org);
			}
		}
		return result;
	}

	private static int wordCount(String input) {
		String[] words = input.split(" "); // Split the word from String
		int wrc = 1; // Variable for getting Repeated word count

		for (int i = 0; i < words.length; i++) // Outer loop for Comparison
		{
			for (int j = i + 1; j < words.length; j++) // Inner loop for Comparison
			{

				if (words[i].equals(words[j])) // Checking for both strings are equal
				{
					wrc = wrc + 1; // if equal increment the count
					words[j] = "0"; // Replace repeated words by zero
				}
			}
			if (words[i] != "0")
				System.out.println(words[i] + "--" + wrc); // Printing the word along with count
			wrc = 1;
		}
		return wrc;
	}

	private static int hourglassSum(int[][] arr) {
		int divCondition = (arr.length / 2) + 1;
		int sum[] = new int[arr.length * 2];
		int h = 0;
		int minSum = 0, maxSum = 0;
		for (int i = 0; i < divCondition; i++) {
			for (int j = 0; j < divCondition; j++) {
				minSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (minSum > maxSum) {
					maxSum = minSum;
				}
			}
		}
		// Arrays.sort(sum);
		// return sum[sum.length - 1];
		return maxSum;
	}

}
