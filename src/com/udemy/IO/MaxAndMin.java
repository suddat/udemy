package com.udemy.IO;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int current = 0;
		int counter = 0;
		int order = 0;
		int min=1;
		int max=-1;
		while (true) {
			order = counter + 1;
			System.out.println("Enter no #" + order + ":");

			boolean isAnInt = sc.hasNextInt();
			if (isAnInt) {
				/*if(min == 0) {
					max = sc.nextInt();					
				}*/
				current = sc.nextInt();
				
				if(max < current) {
					max = current;
				}
				
				if(min > current) {
					min = current;
				}
								
			} else {				
				break;
			}
			sc.nextLine();
		}
		System.out.println("Min: "+min+" And Max :"+max);
		// close scanner
		sc.close();
	}

}
